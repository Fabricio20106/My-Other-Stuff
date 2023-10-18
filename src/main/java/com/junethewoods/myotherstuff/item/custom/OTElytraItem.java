package com.junethewoods.myotherstuff.item.custom;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class OTElytraItem extends ElytraItem {
    public OTElytraItem(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public EquipmentSlotType getEquipmentSlot(ItemStack stack) {
        return EquipmentSlotType.CHEST;
    }
}
