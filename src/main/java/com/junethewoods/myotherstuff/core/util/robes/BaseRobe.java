package com.junethewoods.myotherstuff.core.util.robes;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.util.OTRobes;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public class BaseRobe extends OTRobes {
    public BaseRobe(String name, Supplier<Ingredient> repairIngredient, SoundEvent equipSound) {
        super(MyOtherStuff.MOD_PREFIX + name, 15, new int[] {2, 5, 6, 2}, 50, equipSound, 3, 0, repairIngredient);
    }
}
