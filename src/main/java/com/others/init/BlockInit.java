package com.others.init;

import com.others.MyOtherStuff;
import com.others.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.trees.BirchTree;
import net.minecraft.block.trees.OakTree;
import net.minecraft.entity.EntityType;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("deprecation")
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {
    public static final DeferredRegister<Block> blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, MyOtherStuff.mod_id);
    public static void register() {}

    public static final RegistryObject<Block> blue_block = blocks.register("blue_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static final RegistryObject<Block> blue_wall = blocks.register("blue_wall", () -> new WallBlock(AbstractBlock.Properties.from(blue_block.get())));
    public static final RegistryObject<Block> blue_slab = blocks.register("blue_slab", () -> new SlabBlock(AbstractBlock.Properties.from(blue_block.get())));
    public static final RegistryObject<Block> screen_monitor = blocks.register("screen_monitor", () -> new MonitorBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1f, 1200F).harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static final RegistryObject<Block> monitor = blocks.register("monitor", () -> new MonitorBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1f, 1200F).harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static final RegistryObject<Block> fur_block = blocks.register("fur_block", () -> new Block(AbstractBlock.Properties.from(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> lined_bedrock = blocks.register("lined_bedrock", () -> new Block(AbstractBlock.Properties.from(Blocks.BEDROCK)));
    public static final RegistryObject<Block> lined_bedrock_slab = blocks.register("lined_bedrock_slab", () -> new SlabBlock(AbstractBlock.Properties.from(lined_bedrock.get())));
    public static final RegistryObject<Block> beacon_laser_block = blocks.register("beacon_laser_block", () -> new Block(AbstractBlock.Properties.from(Blocks.STONE)));
    public static final RegistryObject<Block> beacon_laser_slab = blocks.register("beacon_laser_slab", () -> new SlabBlock(AbstractBlock.Properties.from(beacon_laser_block.get())));
    public static final RegistryObject<Block> blue_glass = blocks.register("blue_glass", () -> new GlassBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).notSolid().setAllowsSpawn(BlockInit::neverAllowSpawn).setSuffocates(BlockInit::isntSolid).setOpaque(BlockInit::isntSolid).sound(SoundType.GLASS).noDrops()));
    public static final RegistryObject<Block> bluewhite_glass = blocks.register("bluewhite_glass", () -> new GlassBlock(AbstractBlock.Properties.create(Material.GLASS).setOpaque(BlockInit::isntSolid).sound(SoundType.GLASS).hardnessAndResistance(0.3F).notSolid().noDrops()));
    public static final RegistryObject<Block> end_crystal_glass = blocks.register("end_crystal_glass", () -> new GlassBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));
    public static final RegistryObject<Block> end_crystal_glass_pane = blocks.register("end_crystal_glass_pane", () -> new PaneBlock(AbstractBlock.Properties.from(end_crystal_glass.get())));
    public static final RegistryObject<Block> bluewhite_glass_pane = blocks.register("bluewhite_glass_pane", () -> new PaneBlock(AbstractBlock.Properties.from(bluewhite_glass.get())));
    public static final RegistryObject<Block> blue_glass_pane = blocks.register("blue_glass_pane", () -> new PaneBlock(AbstractBlock.Properties.from(blue_glass.get())));
    public static final RegistryObject<Block> command_block = blocks.register("command_block_1", () -> new CommandBlockBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BROWN).hardnessAndResistance(-1.0F, 3600000.0F).noDrops()));
    public static final RegistryObject<Block> crafting_table = blocks.register("crafting_table_1", () -> new CraftingTable1Block(AbstractBlock.Properties.from(Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> smithing_table = blocks.register("smithing_table_1", () -> new SmithingTable1Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> golden_cauldron = blocks.register("golden_cauldron", () -> new CauldronBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.STONE).setRequiresTool().hardnessAndResistance(2.0F).notSolid()));
    public static final RegistryObject<Block> golden_beacon = blocks.register("golden_beacon", () -> new GoldenBeaconBlock(AbstractBlock.Properties.create(Material.GLASS, MaterialColor.DIAMOND).hardnessAndResistance(3.0F).notSolid()));
    public static final RegistryObject<Block> energy_cube = blocks.register("energy_cube", () -> new EnergyCubeBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> cpu = blocks.register("cpu", () -> new CpuBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> autocrafter = blocks.register("autocrafter", () -> new AutocrafterBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> lego_furnace = blocks.register("lego_furnace", () -> new LegoFurnaceBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> acacia_leaves = blocks.register("acacia_leaves_1", () -> new LeavesBlock(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.GROUND).notSolid()));
    public static final RegistryObject<Block> azalea = blocks.register("azalea", () -> new Block(AbstractBlock.Properties.create(Material.PLANTS).hardnessAndResistance(0.6F).sound(SoundType.GROUND)));
    public static final RegistryObject<Block> oak_bush_sapling = blocks.register("oak_bush_sapling", () -> new SaplingBlock(new OakTree(), AbstractBlock.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0.0F, 0.0F).sound(SoundType.GROUND)));
    public static final RegistryObject<Block> swamp_oak_sapling = blocks.register("swamp_oak_sapling", () -> new SaplingBlock(new OakTree(), AbstractBlock.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0.0F, 0.0F).sound(SoundType.GROUND)));
    public static final RegistryObject<Block> tall_birch_sapling = blocks.register("tall_birch_sapling", () -> new SaplingBlock(new BirchTree(), AbstractBlock.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0.0F, 0.0F).sound(SoundType.GROUND)));
    public static final RegistryObject<Block> blue_carrots = blocks.register("blue_carrots", () -> new BlueCarrotBlock(AbstractBlock.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0.0F, 0.0F).sound(SoundType.CROP)));
    public static final RegistryObject<Block> inno_flower = blocks.register("inno_flower", () -> new FlowerBlock(Effects.LEVITATION, 15, AbstractBlock.Properties.create(Material.MISCELLANEOUS).notSolid().hardnessAndResistance(0.2F).sound(SoundType.GROUND)));
    public static final RegistryObject<Block> orange_flower_pot = blocks.register("orange_flower_pot", () -> new FlowerPotBlock(Blocks.AIR, AbstractBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0F, 0.0F).notSolid()));
    public static final RegistryObject<Block> orange_flower_pot_1 = blocks.register("orange_flower_pot_1", () -> new FlowerPotBlock(Blocks.AIR, AbstractBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0F, 0.0F).notSolid()));
    public static final RegistryObject<Block> orange_potted_inno_flower = blocks.register("orange_potted_inno_flower",() -> new FlowerPotBlock(inno_flower.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0F, 0.0F).notSolid()));
    public static final RegistryObject<Block> potted_inno_flower = blocks.register("potted_inno_flower", () -> new FlowerPotBlock(inno_flower.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).notSolid()));
    public static final RegistryObject<Block> potted_tall_birch_sapling = blocks.register("potted_tall_birch_sapling", () -> new FlowerPotBlock(tall_birch_sapling.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).notSolid()));
    public static final RegistryObject<Block> potted_swamp_oak_sapling = blocks.register("potted_swamp_oak_sapling", () -> new FlowerPotBlock(swamp_oak_sapling.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).notSolid()));
    public static final RegistryObject<Block> potted_oak_bush_sapling = blocks.register("potted_oak_bush_sapling", () -> new FlowerPotBlock(oak_bush_sapling.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).notSolid()));
    public static final RegistryObject<Block> potted_grass = blocks.register("potted_grass", () -> new FlowerPotBlock(Blocks.GRASS, AbstractBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).notSolid()));
    public static final RegistryObject<Block> diaemerald_ore = blocks.register("diaemerald_ore", () -> new OreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
    public static final RegistryObject<Block> diaemerald_block = blocks.register("diaemerald_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.DIAMOND).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> crystal_ore = blocks.register("crystal_ore", () -> new OreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
    public static final RegistryObject<Block> deepslate_crystal_ore = blocks.register("deepslate_crystal_ore", () -> new OreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.5F, 3.5F)));
    public static final RegistryObject<Block> crystal_block = blocks.register("crystal_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.QUARTZ).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> inno_ore = blocks.register("inno_ore", () -> new OreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
    public static final RegistryObject<Block> inno_block = blocks.register("inno_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> purple_ore = blocks.register("purple_ore", () -> new OreBlock(AbstractBlock.Properties.from(Blocks.NETHER_QUARTZ_ORE)));
    public static final RegistryObject<Block> purple_block = blocks.register("purple_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.PURPLE).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> granite_bricks = blocks.register("granite_bricks", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.DIRT).setRequiresTool().hardnessAndResistance(2.0F, 6.0F)));
    public static final RegistryObject<Block> slate_bricks = blocks.register("slate_bricks", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY).setRequiresTool().hardnessAndResistance(2.0F, 6.0F)));
    public static final RegistryObject<Block> bright_first_block = blocks.register("bright_first_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.LIGHT_BLUE).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> dark_first_block = blocks.register("dark_first_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> first_block = blocks.register("first_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.CYAN).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> phoenix_gem_block = blocks.register("phoenix_gem_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.ORANGE_TERRACOTTA).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> plasteel_block = blocks.register("plasteel_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.CLAY).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> inno_core_block = blocks.register("inno_core_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> nether_core_block = blocks.register("nether_core_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.PURPLE).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));

    private static boolean isntSolid(BlockState state, IBlockReader reader, BlockPos pos) {
        return true;
    }

    private static Boolean neverAllowSpawn(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> entity) {
        return true;
    }
}