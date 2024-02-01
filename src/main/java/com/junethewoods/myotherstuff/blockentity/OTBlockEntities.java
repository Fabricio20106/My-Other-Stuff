package com.junethewoods.myotherstuff.blockentity;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.block.OTBlocks;
import com.junethewoods.myotherstuff.blockentity.custom.GoldenBeaconBlockEntity;
import com.junethewoods.myotherstuff.blockentity.custom.LegoFurnaceBlockEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OTBlockEntities {
    public static final DeferredRegister<TileEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MyOtherStuff.MOD_ID);

    public static final RegistryObject<TileEntityType<LegoFurnaceBlockEntity>> DRAWN_FURNACE = BLOCK_ENTITIES.register("drawn_furnace", () ->
            TileEntityType.Builder.of(LegoFurnaceBlockEntity::new, OTBlocks.DRAWN_FURNACE.get()).build(null));

    public static final RegistryObject<TileEntityType<GoldenBeaconBlockEntity>> GOLDEN_BEACON = BLOCK_ENTITIES.register("golden_beacon", () ->
            TileEntityType.Builder.of(GoldenBeaconBlockEntity::new, OTBlocks.GOLDEN_BEACON.get()).build(null));
}
