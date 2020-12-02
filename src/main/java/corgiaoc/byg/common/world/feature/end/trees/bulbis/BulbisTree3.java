package corgiaoc.byg.common.world.feature.end.trees.bulbis;

import com.mojang.serialization.Codec;
import corgiaoc.byg.common.world.feature.config.BYGMushroomConfig;
import corgiaoc.byg.common.world.feature.overworld.mushrooms.util.BYGAbstractMushroomFeature;
import corgiaoc.byg.core.BYGBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureWorldAccess;

import java.util.Random;

public class BulbisTree3 extends BYGAbstractMushroomFeature<BYGMushroomConfig> {

    public BulbisTree3(Codec<BYGMushroomConfig> configIn) {
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
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 3, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 4, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 5, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 6, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 7, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 8, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 9, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 10, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 5, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 6, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 7, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 10, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 10, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 11, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 11, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 12, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 12, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 12, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 13, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 13, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 13, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 13, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 14, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 14, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 14, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 15, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 15, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 15, 3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 16, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 16, 3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 17, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 17, 3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 18, 3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 19, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 5, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 6, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 6, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 6, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 6, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 6, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 6, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 6, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 6, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 7, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 7, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 7, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 7, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 7, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 7, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 7, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 7, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 9, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 16, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 16, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 16, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 16, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 16, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 16, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 16, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 16, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 17, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 17, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 17, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 17, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 17, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 17, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 17, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 17, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 17, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 17, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 17, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 17, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 18, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 18, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 18, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 18, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 18, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 18, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 18, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 18, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 18, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 18, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 18, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 18, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 18, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 18, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 18, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 18, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 18, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 18, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 18, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 18, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 19, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 19, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 19, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 19, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 19, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 19, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 19, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 19, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 19, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 19, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 19, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 19, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 19, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 19, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 19, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 19, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 19, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 19, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 19, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 19, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 19, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 19, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 19, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 19, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 20, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 20, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 20, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 20, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 20, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 20, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 20, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 20, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 20, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 20, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 20, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 20, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 20, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 20, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 20, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 20, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 20, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 20, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 20, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 20, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 20, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 21, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 21, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 21, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 21, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 21, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 21, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 21, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 21, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 21, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 21, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 21, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 21, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 22, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 22, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 22, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 22, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 22, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 22, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 22, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 22, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 22, 4));
            }
        }
        return true;
    }
}