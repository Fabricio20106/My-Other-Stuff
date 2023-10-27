package com.junethewoods.myotherstuff.block.custom;

import net.minecraft.util.text.TranslationTextComponent;

public class CrafterBlock extends BaseTableBlock {
    public CrafterBlock(Properties properties) {
        super(properties, new TranslationTextComponent("container.autocrafter"));
    }
}
