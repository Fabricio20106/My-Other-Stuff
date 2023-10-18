package com.junethewoods.myotherstuff.block.custom;

import com.junethewoods.myotherstuff.item.OTItems;
import net.minecraft.block.*;
import net.minecraft.util.IItemProvider;

public class BlueCarrotBlock extends CarrotBlock {
    public BlueCarrotBlock(Properties properties) {
        super(properties);
    }

    public IItemProvider getBaseSeedId() {
        return OTItems.BLUE_CARROT.get();
    }
}
