package com.junethewoods.myotherstuff.core.util.armors;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.util.OtRobes;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public class BaseArmor extends OtRobes {
    public BaseArmor(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
        super(MyOtherStuff.PREFIX + name, maxDamageFactor, damageReductionAmountArray, enchantability, soundEvent, toughness, knockbackResistance, repairMaterial);
    }
}
