package corgiaoc.byg.common.world.feature.end.trees.bulbis;

import com.mojang.serialization.Codec;
import corgiaoc.byg.common.world.feature.config.BYGMushroomConfig;
import corgiaoc.byg.common.world.feature.overworld.mushrooms.util.BYGAbstractMushroomFeature;
import corgiaoc.byg.core.BYGBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureWorldAccess;

import java.util.Random;

public class BulbisTree2 extends BYGAbstractMushroomFeature<BYGMushroomConfig> {

    public BulbisTree2(Codec<BYGMushroomConfig> configIn) {
        super(configIn);
    }

    protected boolean placeMushroom(StructureWorldAccess worldIn, Random rand, BlockPos pos, boolean isMushroom, BYGMushroomConfig config) {
        BlockState STEM = config.getStemProvider().getBlockState(rand, pos);
        BlockState MUSHROOM = config.getMushroomProvider().getBlockState(rand, pos);
        BlockState MUSHROOM2 = config.getMushroom2Provider().getBlockState(rand, pos);
        BlockState MUSHROOM3 = config.getMushroom3Provider().getBlockState(rand, pos);
        BlockState POLLEN = config.getPollenProvider().getBlockState(rand, pos);
        int randTreeHeight = 8 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().set(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getTopHeightLimit()) {
            if (!isDesiredGroundwEndTags(worldIn, pos.down(), BYGBlocks.IVIS_PHYLIUM)) {
                return false;
            } else if (!this.isAnotherMushroomLikeThisNearby(worldIn, pos, randTreeHeight, 0, STEM.getBlock(), MUSHROOM.getBlock(), isMushroom)) {
                return false;
            } else if (!this.doesMushroomHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isMushroom)) {
                return false;
            } else {
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 0, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 1, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 2, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 2, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 2, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 3, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 3, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 4, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 4, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 4, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 4, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 4, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 4, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 5, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 5, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 6, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 6, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 7, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 7, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 8, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 6, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 6, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 6, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 6, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 6, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 6, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 6, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 6, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 7, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 7, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 7, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 7, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 7, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 7, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 7, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 7, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 7, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 7, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 7, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 7, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 8, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 8, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 8, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 8, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 8, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 8, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 8, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 8, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 8, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 8, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 9, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 9, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 9, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 9, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 9, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 9, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 9, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 9, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 9, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 9, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 9, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 9, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 9, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 9, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 9, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 9, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 9, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 9, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 9, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 9, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 9, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 9, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 9, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 9, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 10, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 10, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 10, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 10, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 10, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 10, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 10, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 10, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 10, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 10, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 10, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 10, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 10, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 10, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 10, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 10, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 10, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 10, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 10, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 10, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 10, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 11, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 11, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 11, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 11, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 11, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 11, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 11, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 11, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 11, 2));
            }
        }
        return true;
    }
}