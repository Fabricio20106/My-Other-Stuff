package com.junethewoods.myotherstuff.core.init.tabs;

import com.junethewoods.myotherstuff.core.init.OTWeaponry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class OTWeapons extends ItemGroup {
    public static final OTWeapons TAB = new OTWeapons("others.weapons");

    public OTWeapons(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(OTWeaponry.AMETHYST_SWORD.get());
    }
}
