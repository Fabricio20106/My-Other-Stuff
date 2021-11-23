package com.junethewoods.myotherstuff.core.init;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.util.OtRobes;
import com.junethewoods.myotherstuff.core.util.armors.BaseArmor;
import com.junethewoods.myotherstuff.core.util.armors.IrlArmor;
import com.junethewoods.myotherstuff.core.util.robes.BaseRobe;
import com.junethewoods.myotherstuff.core.util.robes.GenericEquipRobe;
import com.junethewoods.myotherstuff.core.util.robes.HuskRobe;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.registries.DeferredRegister;

public class Robes {
    public static final SoundEvent leatherEquip = SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    public static final SoundEvent turtleEquip = SoundEvents.ITEM_ARMOR_EQUIP_TURTLE;

    public static final OtRobes blup = new BaseRobe("blup", () -> Ingredient.fromItems(StuffInit.blue_leather.get()), leatherEquip);
    public static final OtRobes crystal = new BaseRobe("crystal", () -> Ingredient.fromItems(StuffInit.crystal.get()), leatherEquip);
    public static final OtRobes empresary = new BaseRobe("empresary2", () -> Ingredient.fromItems(StuffInit.blue_leather.get()), leatherEquip);
    public static final OtRobes galaxy = new BaseRobe("galaxy", () -> Ingredient.fromItems(StuffInit.galaxy_cloth.get()), leatherEquip);
    public static final OtRobes green = new BaseRobe("green", () -> Ingredient.fromItems(Items.GREEN_WOOL), leatherEquip);
    public static final OtRobes number = new BaseRobe("number", () -> Ingredient.fromItems(Items.BLUE_WOOL), leatherEquip);
    public static final OtRobes orange = new BaseRobe("orange", () -> Ingredient.fromItems(Items.ORANGE_WOOL), leatherEquip);
    public static final OtRobes pales = new BaseRobe("pales", () -> Ingredient.fromItems(Items.BLUE_DYE), leatherEquip);
    public static final OtRobes speed = new BaseRobe("speed", () -> Ingredient.fromItems(Items.REDSTONE), leatherEquip);
    public static final OtRobes husk = new HuskRobe("husk", () -> Ingredient.fromItems(Items.YELLOW_WOOL), turtleEquip);
    public static final OtRobes abu = new GenericEquipRobe("abu", () -> Ingredient.fromItems(StuffInit.blue_leather.get()));
    public static final OtRobes kimono = new GenericEquipRobe("kimono", () -> Ingredient.fromItems(StuffInit.blue_leather.get()));

    public static final OtRobes respawn_anchor = new BaseArmor("anchor", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, 0.0F, () -> Ingredient.fromItems(Blocks.WHITE_CONCRETE));
    public static final OtRobes fast = new BaseArmor("fast", 37, new int[] {3, 6, 8, 3}, 50, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F, () -> Ingredient.fromItems(Blocks.CRYING_OBSIDIAN));
    public static final OtRobes sophryst = new BaseArmor("sophryst", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> Ingredient.fromItems(StuffInit.coal_powder.get()));
    public static final OtRobes shulker = new BaseArmor("shulker", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 3.0F, 0.0F, () -> Ingredient.fromItems(Items.SHULKER_SHELL));
    public static final OtRobes alex = new BaseArmor("alex", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> Ingredient.fromItems(Items.GREEN_WOOL));
    public static final OtRobes baby_demon = new IrlArmor("baby_demon", () -> Ingredient.fromItems(Items.PINK_WOOL));

    public static void classLoad() {}
}
