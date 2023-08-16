package com.junethewoods.myotherstuff.common.block;

import com.junethewoods.myotherstuff.core.init.OTItems;
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
