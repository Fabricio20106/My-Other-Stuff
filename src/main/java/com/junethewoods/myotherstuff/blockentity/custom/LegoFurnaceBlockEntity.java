package com.junethewoods.myotherstuff.blockentity.custom;

import com.junethewoods.myotherstuff.blockentity.OTBlockEntities;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.FurnaceContainer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class LegoFurnaceBlockEntity extends AbstractFurnaceTileEntity {
    public LegoFurnaceBlockEntity() {
        super(OTBlockEntities.DRAWN_FURNACE.get(), IRecipeType.SMELTING);
    }

    @Override
    public TileEntityType<?> getType() {
        return OTBlockEntities.DRAWN_FURNACE.get();
    }

    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container.lego_furnace");
    }

    protected Container createMenu(int id, PlayerInventory player) {
        return new FurnaceContainer(id, player, this, this.dataAccess);
    }
}
