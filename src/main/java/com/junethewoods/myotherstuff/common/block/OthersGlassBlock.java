package com.junethewoods.myotherstuff.common.block;

public class OthersGlassBlock extends net.minecraft.block.AbstractGlassBlock {
    public OthersGlassBlock(net.minecraft.block.AbstractBlock.Properties properties) {
        super(properties);
    }

    @java.lang.Override
    public net.minecraft.block.BlockRenderType getRenderType(net.minecraft.block.BlockState state) {
        return net.minecraft.block.BlockRenderType.MODEL;
    }
}
