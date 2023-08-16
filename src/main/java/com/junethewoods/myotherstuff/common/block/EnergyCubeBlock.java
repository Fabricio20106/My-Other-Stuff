package com.junethewoods.myotherstuff.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class EnergyCubeBlock extends Block {
    public EnergyCubeBlock(Properties properties) {
        super(properties);
    }

    public int getSignal(BlockState state, IBlockReader reader, BlockPos pos, Direction side) {
        return 15;
    }

    public boolean isSignalSource(BlockState state) {
        return true;
    }
}
