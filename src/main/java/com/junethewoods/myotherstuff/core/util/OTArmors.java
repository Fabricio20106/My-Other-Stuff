package com.junethewoods.myotherstuff.core.util;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.init.OTItems;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum OTArmors implements IArmorMaterial {
    ALEX(MyOtherStuff.MOD_ID + ":alex", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(Items.GREEN_WOOL)),
    SHULKER(MyOtherStuff.MOD_ID + ":shulker", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_CHAIN, 3, 0, () -> Ingredient.of(Items.SHULKER_SHELL)),
    SOPHRYST_ACCESSORIES_NICOLAS(MyOtherStuff.MOD_ID + ":sophryst", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(OTItems.COAL_POWDER.get())),
    PIGLIN(MyOtherStuff.MOD_ID + ":piglin", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(Items.LEATHER)),
    FAST(MyOtherStuff.MOD_ID + ":fast", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_IRON, 3, 0, () -> Ingredient.of(Items.WHITE_CONCRETE)),
    ANCHOR(MyOtherStuff.MOD_ID + ":anchor", 37, new int[] {3, 6, 8, 3}, 50, SoundEvents.ARMOR_EQUIP_NETHERITE, 3, 0.2f, () -> Ingredient.of(Blocks.CRYING_OBSIDIAN)),
    BABY_DEMON(MyOtherStuff.MOD_ID + ":baby_demon", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3,0, () -> Ingredient.of(Blocks.PINK_WOOL)),
    FINN(MyOtherStuff.MOD_ID + ":finn", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3,0, () -> Ingredient.of(OTItems.REDSTONE_POWDER.get())),
    HAN_SOLO(MyOtherStuff.MOD_ID + ":han", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3,0, () -> Ingredient.of(OTItems.REINFORCED_CLOTH.get())),
    IAN(MyOtherStuff.MOD_ID + ":ian", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3,0, () -> Ingredient.of(Blocks.RED_WOOL)),
    MARIO(MyOtherStuff.MOD_ID + ":mario", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3,0, () -> Ingredient.of(OTItems.REINFORCED_CLOTH.get())),
    PONY(MyOtherStuff.MOD_ID + ":pony", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3,0, () -> Ingredient.of(OTItems.GALAXY_CLOTH.get())),
    INNO(MyOtherStuff.MOD_ID + ":inno", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_IRON, 3, 0, () -> Ingredient.of(OTItems.INNO_INGOT.get())),
    NETHER(MyOtherStuff.MOD_ID + ":nether.json", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_DIAMOND, 3, 0, () -> Ingredient.of(OTItems.PURPLE_INGOT.get())),
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

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] defensePerSlot;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackRes;
    private final LazyValue<Ingredient> repairIngredient;

    OTArmors(String name, int maxDamageFactor, int[] defensePerSlot, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackRes, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.defensePerSlot = defensePerSlot;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackRes = knockbackRes;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return MAX_DAMAGE_ARRAY[slot.getIndex()] * this.maxDamageFactor;
    }

    public int getDefenseForSlot(EquipmentSlotType slot) {
        return this.defensePerSlot[slot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
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