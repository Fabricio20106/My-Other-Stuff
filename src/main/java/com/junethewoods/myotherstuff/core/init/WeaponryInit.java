package com.junethewoods.myotherstuff.core.init;

import com.junethewoods.myotherstuff.common.item.HoneyBottleSwordItem;
import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.init.tabs.OTWeapons;
import com.junethewoods.myotherstuff.core.util.OtherTools;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WeaponryInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyOtherStuff.MOD_ID);

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(OtherTools.V1SWORDS, 3, -2.4f, new Item.Properties().group(OTWeapons.TAB)));
    public static final RegistryObject<Item> ENCHANTING_SWORD = ITEMS.register("enchanting_sword", () -> new SwordItem(OtherTools.V1SWORDS, 5, -2.4f, new Item.Properties().group(OTWeapons.TAB)));
    public static final RegistryObject<Item> END_ROD_SWORD = ITEMS.register("end_rod_sword", () -> new SwordItem(OtherTools.V1SWORDS, 3, -2.4f, new Item.Properties().group(OTWeapons.TAB)));
    public static final RegistryObject<Item> FIREWORK_SWORD = ITEMS.register("firework_sword", () -> new SwordItem(OtherTools.V1SWORDS, 3, -2.4f, new Item.Properties().group(OTWeapons.TAB)));
    public static final RegistryObject<Item> GLASS_SWORD = ITEMS.register("glass_sword", () -> new SwordItem(OtherTools.V1SWORDS, 4, -2.4f, new Item.Properties().group(OTWeapons.TAB)));
    public static final RegistryObject<Item> HONEY_BOTTLE_SWORD = ITEMS.register("honey_bottle_sword", () -> new HoneyBottleSwordItem(OtherTools.V1SWORDS, 3, -2.4f, new Item.Properties().group(OTWeapons.TAB)));
    public static final RegistryObject<Item> LIGHTNING_SWORD = ITEMS.register("lightning_sword", () -> new SwordItem(ItemTier.STONE, 3, -2.4f, new Item.Properties().group(OTWeapons.TAB)));
    public static final RegistryObject<Item> LEVER_SWORD = ITEMS.register("lever_sword", () -> new SwordItem(ItemTier.STONE, 3, -2.4f, new Item.Properties().group(OTWeapons.TAB)));
    public static final RegistryObject<Item> SHEARS_IRON_SWORD = ITEMS.register("shears_iron_sword", () -> new SwordItem(ItemTier.IRON, 3, -2.4f, new Item.Properties().group(OTWeapons.TAB)));
    public static final RegistryObject<Item> STRIDER_SWORD = ITEMS.register("strider_sword", () -> new SwordItem(OtherTools.V1SWORDS, 3, -2.4f, new Item.Properties().group(OTWeapons.TAB)));
    public static final RegistryObject<Item> UNDYING_SWORD = ITEMS.register("undying_sword", () -> new SwordItem(ItemTier.DIAMOND, 3, -2.4f, new Item.Properties().group(OTWeapons.TAB)));
    public static final RegistryObject<Item> WEAK_ENCHANTING_SWORD = ITEMS.register("weak_enchanting_sword", () -> new SwordItem(ItemTier.WOOD, 3, -2.4f, new Item.Properties().group(OTWeapons.TAB)));
    public static final RegistryObject<Item> WITCH_SWORD = ITEMS.register("witch_sword", () -> new SwordItem(OtherTools.V1SWORDS, 3, -2.4f, new Item.Properties().group(OTWeapons.TAB)));
    public static final RegistryObject<Item> TRIDENT_PICKAXE = ITEMS.register("trident_pickaxe", () -> new PickaxeItem(OtherTools.V1SWORDS, 3, -2.4f, new Item.Properties().group(OTWeapons.TAB)));

}
