package com.junethewoods.myotherstuff.blockentity.custom;

import com.junethewoods.myotherstuff.blockentity.OTBlockEntities;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.tileentity.BeaconTileEntity;
import net.minecraft.tileentity.TileEntityType;

public class GoldenBeaconBlockEntity extends BeaconTileEntity {
    public static final Effect[][] GOLDEN_BEACON_EFFECTS = new Effect[][] {
            {Effects.SLOW_FALLING, Effects.DIG_SPEED},
            {Effects.NIGHT_VISION, Effects.ABSORPTION},
            {Effects.DAMAGE_BOOST},
            {Effects.LUCK}};

    public GoldenBeaconBlockEntity() {
        super();
    }

    @Override
    public TileEntityType<?> getType() {
        return OTBlockEntities.GOLDEN_BEACON.get();
    }
}
