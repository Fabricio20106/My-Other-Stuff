package com.junethewoods.myotherstuff.item.custom.discontinued;

import net.minecraft.item.ItemStack;

public class DiscontinuedFoiledItem extends DiscontinuedItem {
    public DiscontinuedFoiledItem(Properties properties, String modName) {
        super(properties, modName);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
