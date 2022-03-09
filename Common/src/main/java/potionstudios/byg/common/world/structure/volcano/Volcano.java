package potionstudios.byg.common.world.structure.volcano;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.pieces.PieceGenerator;
import net.minecraft.world.level.levelgen.structure.pieces.PieceGeneratorSupplier;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;
import potionstudios.byg.common.world.math.noise.fastnoise.lite.FastNoiseLite;
import potionstudios.byg.common.world.structure.arch.ArchStructure;
import potionstudios.byg.util.blendingfunction.BlendingFunction;

import java.util.HashSet;
import java.util.Set;

public class Volcano extends StructureFeature<NoneFeatureConfiguration> {
    private static FastNoiseLite fnlPerlin = null;

    public Volcano(Codec<NoneFeatureConfiguration> $$0) {
        super($$0, PieceGeneratorSupplier.simple(PieceGeneratorSupplier.checkForBiomeOnTop(Heightmap.Types.WORLD_SURFACE_WG), Volcano::generatePieces));
    }

    private static void generatePieces(StructurePiecesBuilder piecesBuilder, PieceGenerator.Context<NoneFeatureConfiguration> context) {
        setSeed(context.seed());

        WorldgenRandom random = context.random();
        ChunkPos chunkPos = context.chunkPos();
        int blockX = chunkPos.getBlockX(random.nextInt(16));
        int blockZ = chunkPos.getBlockZ(random.nextInt(16));


        ChunkGenerator chunkGenerator = context.chunkGenerator();
        int generatorBaseHeight = chunkGenerator.getBaseHeight(blockX, blockZ, Heightmap.Types.OCEAN_FLOOR_WG, context.heightAccessor());


        BlendingFunction function = BlendingFunction.EaseInBack.INSTANCE;

        Long2ObjectOpenHashMap<Set<BlockPos>> trackedPositionsByChunk = new Long2ObjectOpenHashMap<>();
        int distanceFromOrigin = 100;
        double radiusSq = distanceFromOrigin * distanceFromOrigin;

        BlockPos.MutableBlockPos mutable = new BlockPos.MutableBlockPos();

        double baseRadius = 350;
        double leakage = 0.5;
        int volcanoConeSize = 80;
        int volcanoStartHeight = volcanoConeSize - 15;
        BlockPos volcanoOrigin = new BlockPos(blockX, volcanoStartHeight, blockZ);
        double threshold = 1;
        int fluidY = -20 + random.nextInt(9);

        for (double x = -volcanoConeSize; x <= volcanoConeSize; x++) {
            for (double z = -volcanoConeSize; z <= volcanoConeSize; z++) {
                for (double y = -volcanoConeSize; y <= 0; y++) {

                    mutable.set(blockX, generatorBaseHeight, blockZ).move((int) x, (int) y + volcanoStartHeight, (int) z);
                    float noise3 = FastNoiseLite.getSpongePerlinValue(fnlPerlin.GetNoise(mutable.getX(), mutable.getZ()));

                    double scaledNoise = (noise3 / 11) * (-(y * baseRadius) / ((x * x) + (z * z)));

                    if (scaledNoise - leakage >= threshold) {
                        double factor = VolcanoPiece.distToCenterSqr(volcanoOrigin, mutable) / (volcanoConeSize * volcanoConeSize);
                        double apply = function.apply(factor, generatorBaseHeight + volcanoStartHeight - 10, mutable.getY());

                        trackedPositionsByChunk.computeIfAbsent(ChunkPos.asLong(mutable), key -> new HashSet<>()).add(new BlockPos(mutable.getX(), apply, mutable.getZ()));

                    } else if (scaledNoise >= threshold) {
                        trackedPositionsByChunk.computeIfAbsent(ChunkPos.asLong(mutable), key -> new HashSet<>()).add(mutable.immutable());
                    }
                    mutable.move(Direction.DOWN);
                }
            }
        }

        trackedPositionsByChunk.forEach((key, positions) -> {
            piecesBuilder.addPiece(new VolcanoPiece(positions, volcanoOrigin, function, 0, ArchStructure.getWritableArea(new ChunkPos(key), context.heightAccessor())));
        });
    }

    public static void setSeed(long seed) {
        if (fnlPerlin == null) {
            fnlPerlin = FastNoiseLite.createSpongePerlin((int) seed);
            fnlPerlin.SetFrequency(0.03F);
        }
    }
}
