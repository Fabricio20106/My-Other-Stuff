package com.junethewoods.myotherstuff.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.trees.OakTree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class AzaleaBlock extends BushBlock implements IGrowable {
    private static final OakTree TREE_GROWER = new OakTree();
    private static final VoxelShape SHAPE = VoxelShapes.or(Block.box(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 8.0D, 10.0D));

    public AzaleaBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, IBlockReader world, BlockPos pos) {
        return state.is(Blocks.CLAY) || super.mayPlaceOn(state, world, pos);
    }

    @Override
    public boolean isValidBonemealTarget(IBlockReader world, BlockPos pos, BlockState state, boolean bool) {
        return world.getFluidState(pos.above()).isEmpty();
    }

    @Override
    public boolean isBonemealSuccess(World world, Random rand, BlockPos pos, BlockState state) {
        return world.random.nextFloat() < 0.45D;
    }

    @Override
    public void performBonemeal(ServerWorld world, Random rand, BlockPos pos, BlockState state) {
        TREE_GROWER.growTree(world, world.getChunkSource().getGenerator(), pos, state, rand);
    }
}
