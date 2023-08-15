package com.junethewoods.myotherstuff.core.util.robes;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.util.OtRobes;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public class GenericEquipRobe extends OtRobes {
    public GenericEquipRobe(String name, Supplier<Ingredient> repairMaterial) {
        super(MyOtherStuff.PREFIX + name, 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, repairMaterial);
    }
}
