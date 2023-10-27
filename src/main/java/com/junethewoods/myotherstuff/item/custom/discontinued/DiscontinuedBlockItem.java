package com.junethewoods.myotherstuff.item.custom.discontinued;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class DiscontinuedBlockItem extends BlockItem {
    private final String modName;

    public DiscontinuedBlockItem(Block block, Properties properties, String modName) {
        super(block, properties);
        this.modName = modName;
    }

    @Override
    public ITextComponent getName(ItemStack stack) {
        String trimmedName = modName.toLowerCase().replace(" ", "").replace("'", "");
        String modName = "tooltip.others.mod." + trimmedName;

        return new TranslationTextComponent(modName, getOriginalName(stack));
    }

    public ITextComponent getOriginalName(ItemStack stack) {
        return new TranslationTextComponent(this.getDescriptionId(stack));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        tooltip.add(new TranslationTextComponent("tooltip.others.discontinuation.block.main", modName).withStyle(TextFormatting.GRAY));
        tooltip.add(new TranslationTextComponent("tooltip.others.discontinuation.safety").withStyle(TextFormatting.GRAY));
        super.appendHoverText(stack, world, tooltip, flag);
    }
}
