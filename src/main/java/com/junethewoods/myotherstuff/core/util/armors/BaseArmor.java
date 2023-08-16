package com.junethewoods.myotherstuff.core.util.armors;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.util.OTRobes;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public class BaseArmor extends OTRobes {
    public BaseArmor(String name, int maxDamageFactor, int[] defensePerSlot, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackRes, Supplier<Ingredient> repairIngredient) {
        super(MyOtherStuff.MOD_PREFIX + name, maxDamageFactor, defensePerSlot, enchantmentValue, equipSound, toughness, knockbackRes, repairIngredient);
    }
}
