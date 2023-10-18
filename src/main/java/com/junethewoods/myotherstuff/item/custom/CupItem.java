package com.junethewoods.myotherstuff.item.custom;

import com.junethewoods.myotherstuff.item.OTItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;

public class CupItem extends BucketItem {
    public CupItem(Fluid fluid, Properties properties) {
        super(fluid, properties);
    }

    @Override
    protected ItemStack getEmptySuccessItem(ItemStack stack, PlayerEntity player) {
        return !player.abilities.instabuild ? new ItemStack(OTItems.CUP.get()) : stack;
    }
}