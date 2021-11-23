package com.junethewoods.myotherstuff.core.util.robes;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.util.OtRobes;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public class BaseRobe extends OtRobes {
    public BaseRobe(String name, Supplier<Ingredient> repairMaterial, SoundEvent equipSound) {
        super(MyOtherStuff.prefix + name, 15, new int[]{2, 5, 6, 2}, 50, equipSound, 3.0F, 0.0F, repairMaterial);
    }
}
