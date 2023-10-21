package com.junethewoods.myotherstuff.util.armor;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.item.OTItems;
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

public enum OTRobes implements IArmorMaterial {
    BLUP(MyOtherStuff.MOD_ID + ":blup", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(OTItems.BLUE_LEATHER.get())),
    MAGENTIC_CRYSTAL(MyOtherStuff.MOD_ID + ":magentic_crystal", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(OTItems.MAGENTIC_CRYSTAL.get())),
    EMPRESARY_2(MyOtherStuff.MOD_ID + ":empresary2", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(OTItems.BLUE_LEATHER.get())),
    GALAXY(MyOtherStuff.MOD_ID + ":galaxy", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(OTItems.GALAXY_CLOTH.get())),
    GREEN(MyOtherStuff.MOD_ID + ":green", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(Items.GREEN_WOOL)),
    NUMBER_1(MyOtherStuff.MOD_ID + ":number", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(Items.BLUE_WOOL)),
    ORANGE(MyOtherStuff.MOD_ID + ":orange", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(Items.ORANGE_WOOL)),
    STRIPES(MyOtherStuff.MOD_ID + ":pales", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(Items.BLUE_DYE)),
    SPEED_BOOTS(MyOtherStuff.MOD_ID + ":speed", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_LEATHER, 3, 0, () -> Ingredient.of(Items.REDSTONE)),
    HUSK(MyOtherStuff.MOD_ID + ":husk", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_TURTLE, 3, 0, () -> Ingredient.of(Items.YELLOW_WOOL)),
    ABU(MyOtherStuff.MOD_ID + ":abu", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, () -> Ingredient.of(OTItems.BLUE_LEATHER.get())),
    KIMONO(MyOtherStuff.MOD_ID + ":kimono", 15, new int[] {2, 5, 6, 2}, 50, SoundEvents.ARMOR_EQUIP_GENERIC, 0, 0, () -> Ingredient.of(OTItems.BLUE_LEATHER.get()));

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] defensePerSlot;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackRes;
    private final LazyValue<Ingredient> repairIngredient;

    OTRobes(String name, int maxDamageFactor, int[] defensePerSlot, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackRes, Supplier<Ingredient> repairIngredient) {
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