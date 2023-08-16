package com.junethewoods.myotherstuff.core.init;

import com.junethewoods.myotherstuff.core.util.OTRobes;
import com.junethewoods.myotherstuff.core.util.armors.BaseArmor;
import com.junethewoods.myotherstuff.core.util.armors.IRLArmor;
import com.junethewoods.myotherstuff.core.util.robes.BaseRobe;
import com.junethewoods.myotherstuff.core.util.robes.GenericEquipRobe;
import com.junethewoods.myotherstuff.core.util.robes.HuskRobe;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class Robes {
    public static final SoundEvent LEATHER_EQUIP = SoundEvents.ARMOR_EQUIP_LEATHER;
    public static final SoundEvent TURTLE_EQUIP = SoundEvents.ARMOR_EQUIP_TURTLE;

    public static final OTRobes BLUP = new BaseRobe("blup", () -> Ingredient.of(OTItems.BLUE_LEATHER.get()), LEATHER_EQUIP);
    public static final OTRobes CRYSTAL = new BaseRobe("crystal", () -> Ingredient.of(OTItems.MAGENTIC_CRYSTAL.get()), LEATHER_EQUIP);
    public static final OTRobes EMPRESARY_2 = new BaseRobe("empresary2", () -> Ingredient.of(OTItems.BLUE_LEATHER.get()), LEATHER_EQUIP);
    public static final OTRobes GALAXY = new BaseRobe("galaxy", () -> Ingredient.of(OTItems.GALAXY_CLOTH.get()), LEATHER_EQUIP);
    public static final OTRobes GREEN = new BaseRobe("green", () -> Ingredient.of(Items.GREEN_WOOL), LEATHER_EQUIP);
    public static final OTRobes NUMBER_1 = new BaseRobe("number", () -> Ingredient.of(Items.BLUE_WOOL), LEATHER_EQUIP);
    public static final OTRobes ORANGE = new BaseRobe("orange", () -> Ingredient.of(Items.ORANGE_WOOL), LEATHER_EQUIP);
    public static final OTRobes STRIPES = new BaseRobe("pales", () -> Ingredient.of(Items.BLUE_DYE), LEATHER_EQUIP);
    public static final OTRobes SPEED_BOOTS = new BaseRobe("speed", () -> Ingredient.of(Items.REDSTONE), LEATHER_EQUIP);
    public static final OTRobes HUSK = new HuskRobe("husk", () -> Ingredient.of(Items.YELLOW_WOOL), TURTLE_EQUIP);
    public static final OTRobes ABU = new GenericEquipRobe("abu", () -> Ingredient.of(OTItems.BLUE_LEATHER.get()));
    public static final OTRobes KIMONO = new GenericEquipRobe("kimono", () -> Ingredient.of(OTItems.BLUE_LEATHER.get()));

    public static final OTRobes ANCHOR = new BaseArmor("anchor", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_IRON, 3, 0, () -> Ingredient.of(Blocks.WHITE_CONCRETE));
    public static final OTRobes FAST = new BaseArmor("fast", 37, new int[] {3, 6, 8, 3}, 50, SoundEvents.ARMOR_EQUIP_NETHERITE, 3, 0.2F, () -> Ingredient.of(Blocks.CRYING_OBSIDIAN));
    public static final OTRobes SOPHRYST_ACCESSORIES_NICOLAS = new BaseArmor("sophryst", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(OTItems.COAL_POWDER.get()));
    public static final OTRobes SHULKER = new BaseArmor("shulker", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_CHAIN, 3, 0, () -> Ingredient.of(Items.SHULKER_SHELL));
    public static final OTRobes ALEX = new BaseArmor("alex", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(Items.GREEN_WOOL));
    public static final OTRobes BABY_DEMON = new IRLArmor("baby_demon", () -> Ingredient.of(Items.PINK_WOOL));
}
