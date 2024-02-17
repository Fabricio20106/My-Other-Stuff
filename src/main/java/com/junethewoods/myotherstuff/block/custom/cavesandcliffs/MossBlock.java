package com.junethewoods.myotherstuff.block.custom.cavesandcliffs;

import com.junethewoods.myotherstuff.world.OTFeatures;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class MossBlock extends Block implements IGrowable {
    public MossBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidBonemealTarget(IBlockReader world, BlockPos pos, BlockState state, boolean bool) {
        return world.getBlockState(pos.above()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(World world, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(ServerWorld world, Random rand, BlockPos pos, BlockState state) {
        OTFeatures.LUSH_VEGETATION_PATCH.place(world, world.getChunkSource().getGenerator(), rand, pos.above());
    }
}
