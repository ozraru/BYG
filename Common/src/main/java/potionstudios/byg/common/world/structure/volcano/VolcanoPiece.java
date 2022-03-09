package potionstudios.byg.common.world.structure.volcano;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.*;
import net.minecraft.resources.RegistryOps;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.StructureFeatureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import potionstudios.byg.common.block.BYGBlocks;
import potionstudios.byg.common.world.structure.BYGStructurePieceTypes;
import potionstudios.byg.util.blendingfunction.BlendingFunction;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class VolcanoPiece extends StructurePiece {

    private final Set<BlockPos> positions = new HashSet<>();
    private final BlockPos volcanoOrigin;
    private final BlendingFunction function;

    public VolcanoPiece(StructurePieceSerializationContext context, CompoundTag tag) {
        super(BYGStructurePieceTypes.VOLCANO_PIECE, tag);
        ListTag positions = tag.getList("positions", Tag.TAG_COMPOUND);

        for (Tag position : positions) {
            this.positions.add(NbtUtils.readBlockPos((CompoundTag) position));
        }

        this.volcanoOrigin = NbtUtils.readBlockPos((CompoundTag) tag.get("volcano_origin"));

        RegistryOps<Tag> tagRegistryOps = RegistryOps.create(NbtOps.INSTANCE, context.registryAccess());
        this.function = BlendingFunction.CODEC.decode(tagRegistryOps, tag.get("function")).result().orElseThrow().getFirst();

    }

    public VolcanoPiece(Set<BlockPos> positions, BlockPos volcanoOrigin, BlendingFunction function, int $$1, BoundingBox $$2) {
        super(BYGStructurePieceTypes.VOLCANO_PIECE, $$1, $$2);
        this.volcanoOrigin = volcanoOrigin;
        this.function = function;
        this.positions.addAll(positions);
    }


    @Override
    protected void addAdditionalSaveData(StructurePieceSerializationContext context, CompoundTag compoundTag) {
        RegistryOps<Tag> tagRegistryOps = RegistryOps.create(NbtOps.INSTANCE, context.registryAccess());
        ListTag positions = new ListTag();

        for (BlockPos position : this.positions) {
            positions.add(NbtUtils.writeBlockPos(position));
        }
        compoundTag.put("positions", positions);
        compoundTag.put("volcano_origin", NbtUtils.writeBlockPos(this.volcanoOrigin));
        compoundTag.put("function", BlendingFunction.CODEC.encodeStart(tagRegistryOps, this.function).get().orThrow());
    }

    @Override
    public void postProcess(WorldGenLevel worldGenLevel, StructureFeatureManager structureFeatureManager, ChunkGenerator chunkGenerator, Random random, BoundingBox boundingBox, ChunkPos chunkPos, BlockPos blockPos) {
        for (BlockPos position : this.positions) {
            int surfaceHeight = worldGenLevel.getHeight(Heightmap.Types.OCEAN_FLOOR_WG, position.getX(), position.getZ());

            BlockPos.MutableBlockPos set = new BlockPos.MutableBlockPos().set(position);
            set.setY(surfaceHeight);
            for (int i = surfaceHeight; i <= position.getY(); i++) {
                if (i == position.getY()) {
                    worldGenLevel.setBlock(set, BYGBlocks.BLACK_SAND.defaultBlockState(), 2);
                } else {
                    worldGenLevel.setBlock(set, Blocks.STONE.defaultBlockState(), 2);
                }
                set.move(Direction.UP);

            }
        }
    }

    public static double distToCenterSqr(BlockPos pos, BlockPos pos1) {
        double $$3 = (double) pos.getX() + 0.5D - pos1.getX();
        double $$5 = (double) pos.getZ() + 0.5D - pos1.getZ();
        return $$3 * $$3 + $$5 * $$5;
    }
}
