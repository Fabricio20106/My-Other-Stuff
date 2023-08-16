package com.junethewoods.myotherstuff.core.util.armors;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.util.OTRobes;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public class IRLArmor extends OTRobes {
    public IRLArmor(String name, Supplier<Ingredient> repairIngredient) {
        super(MyOtherStuff.MOD_PREFIX + name, 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, repairIngredient);
    }
}
