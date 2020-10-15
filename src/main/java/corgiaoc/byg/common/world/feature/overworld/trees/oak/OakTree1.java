package corgiaoc.byg.common.world.feature.overworld.trees.oak;

import com.mojang.serialization.Codec;
import corgiaoc.byg.common.world.feature.config.BYGTreeConfig;
import corgiaoc.byg.common.world.feature.overworld.trees.util.BYGAbstractTreeFeature;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;

import java.util.Random;
import java.util.Set;

public class OakTree1 extends BYGAbstractTreeFeature<BYGTreeConfig> {

    public OakTree1(Codec<BYGTreeConfig> configIn) {
        super(configIn);
    }

    protected boolean generate(Set<BlockPos> changedBlocks, ISeedReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling, BYGTreeConfig config) {

        int randTreeHeight = config.getMinHeight() + rand.nextInt(config.getMaxPossibleHeight());
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().setPos(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getHeight()) {
            if (!isDesiredGroundwDirtTag(worldIn, pos.down(), config)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 7, 5, 5, isSapling)) {
                return false;
            } else {
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 0, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 1, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 2, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 3, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 4, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 5, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 6, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, 0), boundsIn);
                placeTrunk(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 0, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 0, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 0, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 1, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 1, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 2, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 2, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 3, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 4, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 4, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 4, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 4, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 5, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 5, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 5, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 5, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 5, 3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 6, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, 4), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, 4), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, 5), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, 5), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, 1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, 2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, 5), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 9, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, -3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, -2), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, -1), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 3), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 4), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 5), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 5), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, 6), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, 0), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, 4), boundsIn);
                placeBranch(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 5, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 6, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 6, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 6, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 6, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 7, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 7, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 7, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 7, 8), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 7, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 7, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 7, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 7, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 7, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(5, 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(5, 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 8, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 8, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 8, 8), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 8, 8), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 8, 8), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 8, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 8, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 8, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 8, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 8, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 8, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 8, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 8, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 8, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 8, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 8, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 8, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(5, 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(5, 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(5, 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 9, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 9, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 9, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 9, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 9, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 9, 8), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 8), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 9, 9), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 8), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 9, 9), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 9, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 9, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 9, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 9, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 9, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 9, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(5, 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(5, 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-3, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 10, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 10, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, -5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 10, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 10, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 10, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 10, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 10, 7), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(4, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(5, 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-2, 11, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 11, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 11, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 11, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(-1, 11, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 11, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 11, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 11, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 11, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 11, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 11, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 11, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, -4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, 4), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 11, 6), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 11, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 11, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 11, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 11, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 11, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(3, 11, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 12, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(0, 12, 5), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 12, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 12, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(1, 12, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mainmutable.setPos(pos).move(2, 12, 0), boundsIn);
            }
        }
        return true;
    }
}