package com.junethewoods.myotherstuff.block;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.block.custom.*;
import com.junethewoods.myotherstuff.block.custom.cavesandcliffs.AzaleaBlock;
import com.junethewoods.myotherstuff.block.custom.cavesandcliffs.HangingRootsBlock;
import com.junethewoods.myotherstuff.block.custom.cavesandcliffs.MossBlock;
import com.junethewoods.myotherstuff.block.custom.cavesandcliffs.RootedDirtBlock;
import com.junethewoods.myotherstuff.block.tree.JungleBush;
import com.junethewoods.myotherstuff.block.tree.SwampOakTree;
import com.junethewoods.myotherstuff.block.tree.TallBirchTree;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OTBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MyOtherStuff.MOD_ID);

    public static final RegistryObject<Block> BRIGHT_BLUE_TILES = BLOCKS.register("bright_blue_tiles", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN).strength(1.5F,6).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static final RegistryObject<Block> BRIGHT_BLUE_TILE_STAIRS = BLOCKS.register("bright_blue_tile_stairs", () -> new StairsBlock(() -> BRIGHT_BLUE_TILES.get().defaultBlockState(), AbstractBlock.Properties.copy(BRIGHT_BLUE_TILES.get())));
    public static final RegistryObject<Block> BRIGHT_BLUE_TILE_SLAB = BLOCKS.register("bright_blue_tile_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BRIGHT_BLUE_TILES.get())));
    public static final RegistryObject<Block> BRIGHT_BLUE_TILE_WALL = BLOCKS.register("bright_blue_tile_wall", () -> new WallBlock(AbstractBlock.Properties.copy(BRIGHT_BLUE_TILES.get())));
    public static final RegistryObject<Block> BLUE_TILES = BLOCKS.register("blue_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(1.5F,6).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static final RegistryObject<Block> CHISELED_BLUE_TILES = BLOCKS.register("chiseled_blue_tiles", () -> new Block(AbstractBlock.Properties.copy(BLUE_TILES.get())));
    public static final RegistryObject<Block> BLUE_TILE_STAIRS = BLOCKS.register("blue_stairs", () -> new StairsBlock(() -> BLUE_TILES.get().defaultBlockState(), AbstractBlock.Properties.copy(BLUE_TILES.get())));
    public static final RegistryObject<Block> BLUE_TILE_SLAB = BLOCKS.register("blue_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BLUE_TILES.get())));
    public static final RegistryObject<Block> BLUE_TILE_WALL = BLOCKS.register("blue_wall", () -> new WallBlock(AbstractBlock.Properties.copy(BLUE_TILES.get())));
    public static final RegistryObject<Block> DARK_BLUE_TILES = BLOCKS.register("dark_blue_tiles", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(1.5F,6).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static final RegistryObject<Block> DARK_BLUE_TILE_STAIRS = BLOCKS.register("dark_blue_tile_stairs", () -> new StairsBlock(() -> DARK_BLUE_TILES.get().defaultBlockState(), AbstractBlock.Properties.copy(DARK_BLUE_TILES.get())));
    public static final RegistryObject<Block> DARK_BLUE_TILE_SLAB = BLOCKS.register("dark_blue_tile_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(DARK_BLUE_TILES.get())));
    public static final RegistryObject<Block> DARK_BLUE_TILE_WALL = BLOCKS.register("dark_blue_tile_wall", () -> new WallBlock(AbstractBlock.Properties.copy(DARK_BLUE_TILES.get())));
    public static final RegistryObject<Block> INNO_TILES = BLOCKS.register("inno_tiles", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.SNOW).strength(1.5F,6).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static final RegistryObject<Block> INNO_TILE_STAIRS = BLOCKS.register("inno_tile_stairs", () -> new StairsBlock(() -> INNO_TILES.get().defaultBlockState(), AbstractBlock.Properties.copy(INNO_TILES.get())));
    public static final RegistryObject<Block> INNO_TILE_SLAB = BLOCKS.register("inno_tile_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(INNO_TILES.get())));
    public static final RegistryObject<Block> INNO_TILE_WALL = BLOCKS.register("inno_tile_wall", () -> new WallBlock(AbstractBlock.Properties.copy(INNO_TILES.get())));
    public static final RegistryObject<Block> NETHER_TILES = BLOCKS.register("nether_tiles", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(1.5F,6).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static final RegistryObject<Block> NETHER_TILE_STAIRS = BLOCKS.register("nether_tile_stairs", () -> new StairsBlock(() -> NETHER_TILES.get().defaultBlockState(), AbstractBlock.Properties.copy(NETHER_TILES.get())));
    public static final RegistryObject<Block> NETHER_TILE_SLAB = BLOCKS.register("nether_tile_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(NETHER_TILES.get())));
    public static final RegistryObject<Block> NETHER_TILE_WALL = BLOCKS.register("nether_tile_wall", () -> new WallBlock(AbstractBlock.Properties.copy(NETHER_TILES.get())));
    public static final RegistryObject<Block> SCREEN_MONITOR = BLOCKS.register("screen_monitor", () -> new MonitorBlock(AbstractBlock.Properties.of(Material.STONE).strength(1, 1200F).sound(SoundType.NETHERITE_BLOCK).harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static final RegistryObject<Block> MONITOR = BLOCKS.register("monitor", () -> new MonitorBlock(AbstractBlock.Properties.of(Material.STONE).strength(1, 1200F).sound(SoundType.NETHERITE_BLOCK).harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static final RegistryObject<Block> FUR_BLOCK = BLOCKS.register("fur_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> BORDERED_BEDROCK = BLOCKS.register("lined_bedrock", () -> new Block(AbstractBlock.Properties.copy(Blocks.BEDROCK)));
    public static final RegistryObject<Block> BORDERED_BEDROCK_SLAB = BLOCKS.register("lined_bedrock_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BORDERED_BEDROCK.get())));
    public static final RegistryObject<Block> BEACON_BEAM_BLOCK = BLOCKS.register("beacon_laser_block", () -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BEACON_BEAM_SLAB = BLOCKS.register("beacon_laser_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BEACON_BEAM_BLOCK.get())));
    public static final RegistryObject<Block> BLUE_GLASS = BLOCKS.register("blue_glass", () -> new OTGlassBlock(AbstractBlock.Properties.of(Material.GLASS).strength(0.3F).noOcclusion().isValidSpawn(OTBlocks::isValidSpawnLocation).isSuffocating(OTBlocks::allowsSuffocating).isViewBlocking(OTBlocks::allowsSuffocating).sound(SoundType.GLASS).noDrops()));
    public static final RegistryObject<Block> CYAN_GLASS = BLOCKS.register("bluewhite_glass", () -> new OTGlassBlock(AbstractBlock.Properties.of(Material.GLASS).isViewBlocking(OTBlocks::allowsSuffocating).sound(SoundType.GLASS).strength(0.3F).noOcclusion().noDrops()));
    public static final RegistryObject<Block> END_CRYSTAL_GLASS = BLOCKS.register("end_crystal_glass", () -> new OTGlassBlock(AbstractBlock.Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> END_CRYSTAL_GLASS_PANE = BLOCKS.register("end_crystal_glass_pane", () -> new PaneBlock(AbstractBlock.Properties.copy(END_CRYSTAL_GLASS.get())));
    public static final RegistryObject<Block> CYAN_GLASS_PANE = BLOCKS.register("bluewhite_glass_pane", () -> new PaneBlock(AbstractBlock.Properties.copy(CYAN_GLASS.get())));
    public static final RegistryObject<Block> BLUE_GLASS_PANE = BLOCKS.register("blue_glass_pane", () -> new PaneBlock(AbstractBlock.Properties.copy(BLUE_GLASS.get())));
    public static final RegistryObject<Block> DRAWN_COMMAND_BLOCK = BLOCKS.register("command_block_1", () -> new CommandBlockBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BROWN).strength(-1, 3600000).sound(SoundType.METAL).noDrops()));
    public static final RegistryObject<Block> DRAWN_CRAFTING_TABLE = BLOCKS.register("crafting_table_1", () -> new DrawnCraftingTableBlock(AbstractBlock.Properties.copy(Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> DRAWN_SMITHING_TABLE = BLOCKS.register("smithing_table_1", () -> new DrawnSmithingTableBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GOLDEN_CAULDRON = BLOCKS.register("golden_cauldron", () -> new CauldronBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.STONE).requiresCorrectToolForDrops().strength(2).noOcclusion()));
    public static final RegistryObject<Block> GOLDEN_BEACON = BLOCKS.register("golden_beacon", () -> new GoldenBeaconBlock(AbstractBlock.Properties.of(Material.GLASS, MaterialColor.DIAMOND).strength(3).noOcclusion()));
    public static final RegistryObject<Block> DRAWN_CREATIVE_ENERGY_CUBE = BLOCKS.register("energy_cube", () -> new DrawnCreativeEnergyCubeBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5, 6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> CPU = BLOCKS.register("cpu", () -> new CPUBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5, 6).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> CRAFTER = BLOCKS.register("autocrafter", () -> new CrafterBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5, 6).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> TAILORING_BENCH = BLOCKS.register("tailoring_bench", () -> new TailoringBenchBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2, 3).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DRAWN_FURNACE = BLOCKS.register("lego_furnace", () -> new LegoFurnaceBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5, 6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> HANGING_ROOTS = BLOCKS.register("hanging_roots", () -> new HangingRootsBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.DIRT).noCollission().instabreak().sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> ROOTED_DIRT = BLOCKS.register("rooted_dirt", () -> new RootedDirtBlock(AbstractBlock.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> MOSS_CARPET = BLOCKS.register("moss_carpet", () -> new OTCarpetBlock(AbstractBlock.Properties.of(Material.PLANT, MaterialColor.COLOR_GREEN).strength(0.1F).sound(SoundType.CROP)));
    public static final RegistryObject<Block> MOSS_BLOCK = BLOCKS.register("moss_block", () -> new MossBlock(AbstractBlock.Properties.of(Material.PLANT, MaterialColor.COLOR_GREEN).strength(0.1F).sound(SoundType.CROP)));
    public static final RegistryObject<Block> AZALEA_LEAVES = BLOCKS.register("azalea_leaves", () -> new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES = BLOCKS.register("flowering_azalea_leaves", () -> new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> DRAWN_ACACIA_LEAVES = BLOCKS.register("acacia_leaves_1", () -> new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> AZALEA = BLOCKS.register("azalea", () -> new AzaleaBlock(AbstractBlock.Properties.of(Material.PLANT).instabreak().sound(SoundType.CROP).noOcclusion()));
    public static final RegistryObject<Block> FLOWERING_AZALEA = BLOCKS.register("flowering_azalea", () -> new AzaleaBlock(AbstractBlock.Properties.of(Material.PLANT).instabreak().sound(SoundType.CROP).noOcclusion()));
    public static final RegistryObject<Block> JUNGLE_BUSH_SAPLING = BLOCKS.register("oak_bush_sapling", () -> new SaplingBlock(new JungleBush(), AbstractBlock.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> SWAMP_OAK_SAPLING = BLOCKS.register("swamp_oak_sapling", () -> new SaplingBlock(new SwampOakTree(), AbstractBlock.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> TALL_BIRCH_SAPLING = BLOCKS.register("tall_birch_sapling", () -> new SaplingBlock(new TallBirchTree(), AbstractBlock.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> BLUE_CARROTS = BLOCKS.register("blue_carrots", () -> new BlueCarrotBlock(AbstractBlock.Properties.of(Material.PLANT).randomTicks().instabreak().noCollission().sound(SoundType.CROP)));
    public static final RegistryObject<Block> INNO_FLOWER = BLOCKS.register("inno_flower", () -> new FlowerBlock(Effects.LEVITATION, 15, AbstractBlock.Properties.of(Material.PLANT).noOcclusion().instabreak().sound(SoundType.CROP)));
    public static final RegistryObject<Block> DECORATED_FLOWER_POT = BLOCKS.register("orange_flower_pot", () -> new FlowerPotBlock(Blocks.AIR, AbstractBlock.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
    public static final RegistryObject<Block> STRIPED_DECORATED_FLOWER_POT = BLOCKS.register("orange_flower_pot_1", () -> new FlowerPotBlock(Blocks.AIR, AbstractBlock.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
    public static final RegistryObject<Block> DECORATED_POTTED_INNO_FLOWER = BLOCKS.register("orange_potted_inno_flower", () -> new FlowerPotBlock(INNO_FLOWER.get(), AbstractBlock.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_INNO_FLOWER = BLOCKS.register("potted_inno_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) DECORATED_FLOWER_POT.get(), INNO_FLOWER, AbstractBlock.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_TALL_BIRCH_SAPLING = BLOCKS.register("potted_tall_birch_sapling", () -> new FlowerPotBlock(TALL_BIRCH_SAPLING.get(), AbstractBlock.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_SWAMP_OAK_SAPLING = BLOCKS.register("potted_swamp_oak_sapling", () -> new FlowerPotBlock(SWAMP_OAK_SAPLING.get(), AbstractBlock.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_JUNGLE_BUSH_SAPLING = BLOCKS.register("potted_oak_bush_sapling", () -> new FlowerPotBlock(JUNGLE_BUSH_SAPLING.get(), AbstractBlock.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_GRASS = BLOCKS.register("potted_grass", () -> new FlowerPotBlock(Blocks.GRASS, AbstractBlock.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_AZALEA = BLOCKS.register("potted_azalea_bush", () -> new FlowerPotBlock(AZALEA.get(), AbstractBlock.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_FLOWERING_AZALEA = BLOCKS.register("potted_flowering_azalea_bush", () -> new FlowerPotBlock(FLOWERING_AZALEA.get(), AbstractBlock.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
    public static final RegistryObject<Block> GRANITE_BRICKS = BLOCKS.register("granite_bricks", () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(2, 6)));
    public static final RegistryObject<Block> SLATE_BRICKS = BLOCKS.register("slate_bricks", () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2, 6)));
    public static final RegistryObject<Block> DIAEMERALD_ORE = BLOCKS.register("diaemerald_ore", () -> new OreBlock(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3, 3)));
    public static final RegistryObject<Block> DEEPSLATE_DIAEMERALD_ORE = BLOCKS.register("deepslate_diaemerald_ore", () -> new OreBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(4.5F, 3)));
    public static final RegistryObject<Block> DIAEMERALD_BLOCK = BLOCKS.register("diaemerald_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.DIAMOND).requiresCorrectToolForDrops().strength(5, 6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MAGENTIC_CRYSTAL_ORE = BLOCKS.register("crystal_ore", () -> new OreBlock(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3, 3)));
    public static final RegistryObject<Block> DEEPSLATE_MAGENTIC_CRYSTAL_ORE = BLOCKS.register("deepslate_crystal_ore", () -> new OreBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(4.5F, 3F)));
    public static final RegistryObject<Block> MAGENTIC_CRYSTAL_BLOCK = BLOCKS.register("crystal_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(5, 6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> INNO_ORE = BLOCKS.register("inno_ore", () -> new OreBlock(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3, 3)));
    public static final RegistryObject<Block> INNO_BLOCK = BLOCKS.register("inno_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5, 6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_INNO_BLOCK = BLOCKS.register("raw_inno_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5, 6)));
    public static final RegistryObject<Block> NETHER_ORE = BLOCKS.register("purple_ore", () -> new OreBlock(AbstractBlock.Properties.copy(Blocks.NETHER_QUARTZ_ORE)));
    public static final RegistryObject<Block> NETHER_BLOCK = BLOCKS.register("purple_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).requiresCorrectToolForDrops().strength(5, 6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_NETHER_BLOCK = BLOCKS.register("raw_purple_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5, 6)));
    public static final RegistryObject<Block> BRIGHT_FIRST_BLOCK = BLOCKS.register("bright_first_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).requiresCorrectToolForDrops().strength(5, 6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> DARK_FIRST_BLOCK = BLOCKS.register("dark_first_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).requiresCorrectToolForDrops().strength(5, 6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FIRST_BLOCK = BLOCKS.register("first_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN).requiresCorrectToolForDrops().strength(5, 6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_FIRST_BLOCK = BLOCKS.register("raw_first_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5, 6)));
    public static final RegistryObject<Block> PHOENIX_GEM_BLOCK = BLOCKS.register("phoenix_gem_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).requiresCorrectToolForDrops().strength(5, 6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> PLASTEEL_BLOCK = BLOCKS.register("plasteel_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.CLAY).requiresCorrectToolForDrops().strength(5, 6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> INNO_CORE_BLOCK = BLOCKS.register("inno_core_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5, 6).sound(SoundType.METAL)));
    public static final RegistryObject<Block> NETHER_CORE_BLOCK = BLOCKS.register("nether_core_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).requiresCorrectToolForDrops().strength(5, 6).sound(SoundType.METAL)));

    private static boolean allowsSuffocating(BlockState state, IBlockReader reader, BlockPos pos) {
        return true;
    }

    private static Boolean isValidSpawnLocation(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> entity) {
        return true;
    }
}