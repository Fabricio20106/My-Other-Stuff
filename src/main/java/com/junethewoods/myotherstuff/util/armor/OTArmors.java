package com.junethewoods.myotherstuff.util.armor;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.item.OTItems;
import com.junethewoods.myotherstuff.util.OTTags;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.Tags;

import java.util.function.Supplier;

public enum OTArmors implements IArmorMaterial {
    AZALEA_HELM(MyOtherStuff.MOD_ID + ":azalea_helm", 10, new int[] {0, 0, 0, 0}, 1, SoundEvents.ARMOR_EQUIP_LEATHER, 0, 0, () -> Ingredient.of(Items.GREEN_WOOL)),
    SHULKER(MyOtherStuff.MOD_ID + ":shulker", 13, new int[] {2, 5, 6, 2}, 14, SoundEvents.ARMOR_EQUIP_CHAIN, 1.5F, 0, () -> Ingredient.of(Items.SHULKER_SHELL)),
    SOPHRYST_ACCESSORIES_NICOLAS(MyOtherStuff.MOD_ID + ":sophryst", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 0, 0, () -> Ingredient.of(OTTags.Items.DUSTS_COAL)),
    PIGLIN(MyOtherStuff.MOD_ID + ":piglin", 10, new int[] {2, 5, 6, 2}, 1, SoundEvents.ARMOR_EQUIP_LEATHER, 0, 0, () -> Ingredient.of(Tags.Items.LEATHER)),
    FAST(MyOtherStuff.MOD_ID + ":fast", 15, new int[] {3, 5, 6, 3}, 15, SoundEvents.ARMOR_EQUIP_IRON, 1, 0, () -> Ingredient.of(Items.WHITE_CONCRETE)),
    ANCHOR(MyOtherStuff.MOD_ID + ":anchor", 37, new int[] {1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3, 0.2F, () -> Ingredient.of(Blocks.CRYING_OBSIDIAN)),
    BABY_DEMON(MyOtherStuff.MOD_ID + ":baby_demon", 10, new int[] {1, 2, 3, 1}, 1, SoundEvents.ARMOR_EQUIP_LEATHER, 0,0, () -> Ingredient.of(Blocks.PINK_WOOL)),
    FINN(MyOtherStuff.MOD_ID + ":finn", 10, new int[] {1, 2, 3, 1}, 1, SoundEvents.ARMOR_EQUIP_LEATHER, 0,0, () -> Ingredient.of(Tags.Items.DUSTS_REDSTONE)),
    HAN_SOLO(MyOtherStuff.MOD_ID + ":han", 10, new int[] {1, 2, 3, 1}, 1, SoundEvents.ARMOR_EQUIP_LEATHER, 0,0, () -> Ingredient.of(OTItems.REINFORCED_CLOTH.get())),
    IAN(MyOtherStuff.MOD_ID + ":ian", 10, new int[] {1, 2, 3, 1}, 1, SoundEvents.ARMOR_EQUIP_LEATHER, 0,0, () -> Ingredient.of(Blocks.RED_WOOL)),
    MARIO(MyOtherStuff.MOD_ID + ":mario", 10, new int[] {1, 2, 3, 1}, 1, SoundEvents.ARMOR_EQUIP_LEATHER, 0,0, () -> Ingredient.of(OTItems.REINFORCED_CLOTH.get())),
    PONY(MyOtherStuff.MOD_ID + ":pony", 10, new int[] {1, 2, 3, 1}, 1, SoundEvents.ARMOR_EQUIP_LEATHER, 0,0, () -> Ingredient.of(OTItems.GALAXY_CLOTH.get())),
    INNO(MyOtherStuff.MOD_ID + ":inno", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_IRON, 3, 0, () -> Ingredient.of(OTItems.INNO_INGOT.get())),
    NETHER(MyOtherStuff.MOD_ID + ":nether.json", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_DIAMOND, 3, 0, () -> Ingredient.of(OTItems.NETHER_INGOT.get())),
    FIRST(MyOtherStuff.MOD_ID + ":first", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_IRON, 3, 0, () -> Ingredient.of(OTItems.FIRST_INGOT.get())),
    FABRICIO2010_HEADSET(MyOtherStuff.MOD_ID + ":headset", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_IRON, 3, 0, () -> Ingredient.of(Items.IRON_INGOT)),
    EMPRESARY_2(MyOtherStuff.MOD_ID + ":empresary2", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_IRON, 3, 0, () -> Ingredient.of(OTItems.FIRST_INGOT.get())),
    BARD(MyOtherStuff.MOD_ID + ":bard", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_CHAIN, 3, 0, () -> Ingredient.of(Items.BROWN_WOOL)),
    GACHA(MyOtherStuff.MOD_ID + ":gacha", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_CHAIN, 3, 0, () -> Ingredient.of(OTItems.FIRST_INGOT.get())),
    PAJAMA(MyOtherStuff.MOD_ID + ":pajama", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(Items.WHITE_WOOL)),
    SPRING(MyOtherStuff.MOD_ID + ":spring", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_IRON, 3, 0, () -> Ingredient.of(OTItems.FIRST_INGOT.get())),
    EMPRESARY(MyOtherStuff.MOD_ID + ":empresary", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_IRON, 3, 0, () -> Ingredient.of(OTItems.FIRST_INGOT.get())),
    FARMER(MyOtherStuff.MOD_ID + ":farmer", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_IRON, 3, 0, () -> Ingredient.of(OTItems.FIRST_INGOT.get())),
    CORONAVIRUS_EMPRESARY(MyOtherStuff.MOD_ID + ":corona", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_IRON, 3, 0, () -> Ingredient.of(OTItems.FIRST_INGOT.get()));

    private static final int[] DURABILITY_MUL_ARRAY = new int[] {13, 15, 16, 11};
    private final String name;
    private final int durabilityMul;
    private final int[] defensePerSlot;
    private final int enchValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackRes;
    private final Supplier<Ingredient> repairIngredient;

    OTArmors(String name, int durabilityMul, int[] defensePerSlot, int enchValue, SoundEvent equipSound, float toughness, float knockbackRes, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMul = durabilityMul;
        this.defensePerSlot = defensePerSlot;
        this.enchValue = enchValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackRes = knockbackRes;
        this.repairIngredient = repairIngredient;
    }

    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return DURABILITY_MUL_ARRAY[slot.getIndex()] * this.durabilityMul;
    }

    public int getDefenseForSlot(EquipmentSlotType slot) {
        return this.defensePerSlot[slot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchValue;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    // Gets the percentage of knockback resistance provided by armor of the material.
    public float getKnockbackResistance() {
        return this.knockbackRes;
    }
}