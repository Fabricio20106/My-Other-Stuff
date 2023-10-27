package com.junethewoods.myotherstuff.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class DrawnCreativeEnergyCubeBlock extends Block {
    public DrawnCreativeEnergyCubeBlock(Properties properties) {
        super(properties);
    }

    public int getSignal(BlockState state, IBlockReader world, BlockPos pos, Direction side) {
        return 15;
    }

    public boolean isSignalSource(BlockState state) {
        return true;
    }
}
