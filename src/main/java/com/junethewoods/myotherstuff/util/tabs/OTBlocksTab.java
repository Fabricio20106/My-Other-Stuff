package com.junethewoods.myotherstuff.util.tabs;

import com.junethewoods.myotherstuff.item.OTItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class OTBlocksTab extends ItemGroup {
    public static final OTBlocksTab TAB = new OTBlocksTab("others.blocks");

    public OTBlocksTab(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(OTItems.BLUE_TILES.get());
    }
}
