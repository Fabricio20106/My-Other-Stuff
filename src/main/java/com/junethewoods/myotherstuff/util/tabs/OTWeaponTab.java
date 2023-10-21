package com.junethewoods.myotherstuff.util.tabs;

import com.junethewoods.myotherstuff.item.OTItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class OTWeaponTab extends ItemGroup {
    public static final OTWeaponTab TAB = new OTWeaponTab("others.weapons");

    public OTWeaponTab(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(OTItems.ANCHOR_SWORD.get());
    }
}
