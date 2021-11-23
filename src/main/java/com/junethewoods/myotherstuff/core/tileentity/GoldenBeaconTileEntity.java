package com.junethewoods.myotherstuff.core.tileentity;

import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.tileentity.BeaconTileEntity;
import net.minecraft.tileentity.ITickableTileEntity;

public class GoldenBeaconTileEntity extends BeaconTileEntity implements INamedContainerProvider, ITickableTileEntity {
    public static final Effect[][] effect_list = new Effect[][]{{Effects.SLOW_FALLING, Effects.HASTE}, {Effects.NIGHT_VISION, Effects.ABSORPTION}, {Effects.STRENGTH}, {Effects.LUCK}};

}
