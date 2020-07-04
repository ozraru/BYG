package voronoiaoc.byg.common.world.feature.features.overworld.trees.aspen;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;

public class AspenTree4 extends BYGAbstractTreeFeature<DefaultFeatureConfig> {


    public AspenTree4(Codec<DefaultFeatureConfig> configIn) {
        super(configIn);
    }

    /**
     * TODO: Redo.
     */
    protected boolean place(Set<BlockPos> changedBlocks, ServerWorldAccess worldIn, Random rand, BlockPos pos, BlockBox boundsIn) {
        int randTreeHeight = 23 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().set(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getDimensionHeight()) {
            BlockPos blockpos = pos.down();
            if (!isDesiredGroundwDirtTag(worldIn, blockpos, Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.doesTreeFit(worldIn, pos, randTreeHeight)) {
                return false;
            } else {
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 0, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 1, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 2, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 3, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 4, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 5, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 6, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 7, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 8, 0), boundsIn);

                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 0, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 0, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 0, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 0, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 1, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 1, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 1, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 1, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 2, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 2, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 2, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 2, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 9, 0), boundsIn);

                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 3, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 3, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 3, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 3, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 4, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 4, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 4, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 4, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 5, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 5, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 5, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 5, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 6, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 6, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 6, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 6, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 7, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 7, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 7, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 7, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 8, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 8, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 8, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 8, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 9, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 9, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 9, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 9, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 10, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 10, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 10, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 10, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 11, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 11, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 11, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 11, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 12, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 12, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 12, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 12, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 13, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 13, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 13, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 13, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 14, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 14, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 14, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 14, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 15, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 15, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 15, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 15, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 16, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 16, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 16, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 16, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 17, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 17, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 17, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 17, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 18, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 18, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 18, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 18, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 19, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 19, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 19, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 19, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 20, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 20, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 20, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 20, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 21, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 21, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 21, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 21, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 9, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 9, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 10, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 10, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 11, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 11, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 12, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 12, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 9, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 9, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 9, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 9, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 12, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 13, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 13, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 13, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 13, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 13, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 13, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 13, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 14, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 14, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 14, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 14, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 14, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 14, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 14, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 15, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 15, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 15, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 15, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 15, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 15, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 15, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 15, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 15, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 16, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 16, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 16, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 16, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 16, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 16, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 16, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 16, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 17, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 17, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 17, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 17, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 18, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 18, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 19, -2), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, ServerWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        if (canTreePlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.PINE_LOG.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, ServerWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        if (canTreePlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.PINE_LOG.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, ServerWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        BlockPos.Mutable blockpos = new BlockPos.Mutable().set(pos);
        if (isAir(reader, blockpos)) {
            this.setFinalBlockState(blockPos, reader, blockpos, BYGBlockList.PINE_LEAVES.getDefaultState(), boundingBox);
        }
    }


    private boolean doesTreeFit(TestableWorld reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.Mutable pos = new BlockPos.Mutable();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 2;

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!canTreePlaceHere(reader, pos.set(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}