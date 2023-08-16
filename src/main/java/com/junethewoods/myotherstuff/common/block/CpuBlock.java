package com.junethewoods.myotherstuff.common.block;

import com.junethewoods.myotherstuff.common.block.properties.OtherBlockStateProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

public class CpuBlock extends HorizontalBlock {
    public static final BooleanProperty enabled = OtherBlockStateProperties.enabled;
    public static final DirectionProperty facing = HorizontalBlock.FACING;

    public CpuBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(facing, Direction.NORTH).setValue(enabled, Boolean.FALSE));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(enabled, facing);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(facing, context.getHorizontalDirection().getOpposite());
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(facing, rot.rotate(state.getValue(facing)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(facing)));
    }
}