package com.others.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class EnergyCubeBlock extends Block {
    public EnergyCubeBlock(AbstractBlock.Properties properties) {
        super(properties);
    }

    public int getWeakPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
        return 15;
    }

    public boolean canProvidePower(BlockState state) {
        return true;
    }
}
