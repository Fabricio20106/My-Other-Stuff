package com.junethewoods.myotherstuff.util.tabs;

import com.junethewoods.myotherstuff.item.OTItems;
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
