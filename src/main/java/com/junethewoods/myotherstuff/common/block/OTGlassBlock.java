package com.junethewoods.myotherstuff.common.block;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;

public class OTGlassBlock extends AbstractGlassBlock {
    public OTGlassBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockRenderType getRenderShape(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
