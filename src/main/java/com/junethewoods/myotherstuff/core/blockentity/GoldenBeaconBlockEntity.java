package com.junethewoods.myotherstuff.core.blockentity;

import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.tileentity.BeaconTileEntity;

public class GoldenBeaconBlockEntity extends BeaconTileEntity {
    public static final Effect[][] GOLDEN_BEACON_EFFECTS = new Effect[][] {{Effects.SLOW_FALLING, Effects.DIG_SPEED}, {Effects.NIGHT_VISION, Effects.ABSORPTION}, {Effects.DAMAGE_BOOST}, {Effects.LUCK}};
}
