package com.junethewoods.myotherstuff.block.custom.cavesandcliffs;

import com.junethewoods.myotherstuff.block.OTBlocks;
import com.junethewoods.myotherstuff.block.tree.AzaleaTree;
import com.junethewoods.myotherstuff.block.tree.FloweringAzaleaTree;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.Tags;

import java.util.Random;

public class AzaleaBlock extends BushBlock implements IGrowable {
    private static final AzaleaTree AZALEA_TREE = new AzaleaTree();
    private static final FloweringAzaleaTree FLOWERING_AZALEA_TREE = new FloweringAzaleaTree();
    private static final VoxelShape SHAPE = VoxelShapes.or(Block.box(0, 8, 0, 16, 16, 16), Block.box(6, 0, 6, 10, 8, 10));

    public AzaleaBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, IBlockReader world, BlockPos pos) {
        return state.is(Blocks.CLAY) || state.is(Tags.Blocks.DIRT) || state.is(OTBlocks.MOSS_BLOCK.get()) || super.mayPlaceOn(state, world, pos);
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
        if (rand.nextFloat() <= 0.5) {
            FLOWERING_AZALEA_TREE.growTree(world, world.getChunkSource().getGenerator(), pos, state, rand);
        } else {
            AZALEA_TREE.growTree(world, world.getChunkSource().getGenerator(), pos, state, rand);
        }
    }
}
