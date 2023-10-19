package com.junethewoods.myotherstuff.item.custom;

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
