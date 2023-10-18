package com.junethewoods.myotherstuff.item.custom;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class DiscontinuedHoeItem extends HoeItem {
    private final String modName;

    public DiscontinuedHoeItem(IItemTier tier, int damage, float swingSpeed, Properties properties, String modName) {
        super(tier, damage, swingSpeed, properties);
        this.modName = modName;
    }

    @Override
    public ITextComponent getName(ItemStack stack) {
        String trimmedName = modName.toLowerCase().replace(" ", "");
        String modName = "message.others.mod." + trimmedName;

        return new TranslationTextComponent(modName, getOriginalName(stack));
    }

    public ITextComponent getOriginalName(ItemStack stack) {
        return new TranslationTextComponent(this.getDescriptionId(stack));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        tooltip.add(new TranslationTextComponent("message.others.discontinuation.block.main", modName).withStyle(TextFormatting.GRAY));
        tooltip.add(new TranslationTextComponent("message.others.discontinuation.safety").withStyle(TextFormatting.GRAY));
        super.appendHoverText(stack, world, tooltip, flag);
    }
}