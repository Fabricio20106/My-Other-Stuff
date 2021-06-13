package com.others.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.state.DirectionProperty;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

public class CpuBlock extends Block {
    public static final DirectionProperty facing = HorizontalBlock.HORIZONTAL_FACING;
    public CpuBlock(Properties properties) {
        super(properties);
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(facing, rot.rotate(state.get(facing)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(facing)));
    }
}