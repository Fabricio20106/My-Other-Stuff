package com.junethewoods.myotherstuff.core.init.tabs;

import com.junethewoods.myotherstuff.core.init.StuffInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class StuffInitTab extends ItemGroup {
    public static final StuffInitTab stuff = new StuffInitTab(ItemGroup.TABS.length, "others");

    public StuffInitTab(int index, String label) {super(index, label);}

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(StuffInit.mini_cloud.get());
    }
}
