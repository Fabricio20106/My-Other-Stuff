package com.junethewoods.myotherstuff.core.init.tabs;

import com.junethewoods.myotherstuff.core.init.OTItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class OTTab extends ItemGroup {
    public static final OTTab TAB = new OTTab(ItemGroup.TABS.length, "others");

    public OTTab(int index, String label) {super(index, label);}

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(OTItems.MINI_CLOUD.get());
    }
}
