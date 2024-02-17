package com.junethewoods.myotherstuff.block.custom;

import com.junethewoods.myotherstuff.item.OTItems;
import com.junethewoods.myotherstuff.util.OTTags;
import net.minecraft.block.*;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class BlueCarrotBlock extends CarrotBlock {
    public BlueCarrotBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, IBlockReader world, BlockPos pos) {
        return state.is(OTTags.Blocks.BLUE_CARROTS_PLANTABLE_ON);
    }

    @Override
    public IItemProvider getBaseSeedId() {
        return OTItems.BLUE_CARROT.get();
    }
}
