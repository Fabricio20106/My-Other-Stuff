package com.junethewoods.myotherstuff.common.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class OthersElytraItem extends ElytraItem {
    public OthersElytraItem(Properties builder) {
        super(builder);
    }

    @Nullable
    @Override
    public EquipmentSlotType getEquipmentSlot(ItemStack stack) {
        return EquipmentSlotType.CHEST;
    }
}
