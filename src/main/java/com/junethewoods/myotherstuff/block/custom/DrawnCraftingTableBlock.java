package com.junethewoods.myotherstuff.block.custom;

import net.minecraft.util.text.TranslationTextComponent;

public class DrawnCraftingTableBlock extends BaseTableBlock {
    public DrawnCraftingTableBlock(Properties properties) {
        super(properties, new TranslationTextComponent("container.crafting_one"));
    }
}
