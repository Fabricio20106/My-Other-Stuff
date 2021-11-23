package com.junethewoods.myotherstuff.common.block;

import com.junethewoods.myotherstuff.core.init.StuffInit;
import net.minecraft.block.*;
import net.minecraft.util.IItemProvider;

public class BlueCarrotBlock extends CarrotBlock {
    public BlueCarrotBlock(Properties p_i48433_1_) {
        super(p_i48433_1_);
    }
    public IItemProvider getSeedsItem() {
        return StuffInit.blue_carrot.get();
    }
}
