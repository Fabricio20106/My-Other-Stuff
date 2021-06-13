package com.others.init.tabs;

import com.others.init.StuffInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class StuffInitTab extends ItemGroup {
    public static final StuffInitTab stuff = new StuffInitTab(ItemGroup.GROUPS.length, "others");

    public StuffInitTab(int index, String label) {super(index, label);}

    @Override
    public ItemStack createIcon() {return new ItemStack(StuffInit.mini_cloud.get());}
}
