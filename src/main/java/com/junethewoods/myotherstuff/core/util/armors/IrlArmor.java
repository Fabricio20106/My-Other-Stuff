package com.junethewoods.myotherstuff.core.util.armors;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.util.OtRobes;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public class IrlArmor extends OtRobes {
    public IrlArmor(String name, Supplier<Ingredient> repairMaterial) {
        super(MyOtherStuff.PREFIX + name, 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, repairMaterial);
    }
}
