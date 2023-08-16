package com.junethewoods.myotherstuff.core.util.robes;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.util.OTRobes;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public class GenericEquipRobe extends OTRobes {
    public GenericEquipRobe(String name, Supplier<Ingredient> repairIngredient) {
        super(MyOtherStuff.MOD_PREFIX + name, 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, repairIngredient);
    }
}
