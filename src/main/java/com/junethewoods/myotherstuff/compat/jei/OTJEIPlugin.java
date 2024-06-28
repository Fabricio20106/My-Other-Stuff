package com.junethewoods.myotherstuff.compat.jei;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.block.OTBlocks;
import com.junethewoods.myotherstuff.crafting.OTRecipeSerializers;
import com.junethewoods.myotherstuff.crafting.custom.TailoringRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaRecipeCategoryUid;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.util.ResourceLocation;

import java.util.Objects;
import java.util.stream.Collectors;

@JeiPlugin
public class OTJEIPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return MyOtherStuff.resourceLoc("jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new TailoringRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        registration.addRecipes(recipeManager.getAllRecipesFor(OTRecipeSerializers.TAILORING_RECIPE).stream().filter(recipe -> recipe instanceof TailoringRecipe).collect(Collectors.toList()), TailoringRecipeCategory.UID);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(OTBlocks.TAILORING_BENCH.get()), TailoringRecipeCategory.UID);
        registration.addRecipeCatalyst(new ItemStack(OTBlocks.DRAWN_CRAFTING_TABLE.get()), VanillaRecipeCategoryUid.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(OTBlocks.CRAFTER.get()), VanillaRecipeCategoryUid.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(OTBlocks.DRAWN_SMITHING_TABLE.get()), VanillaRecipeCategoryUid.SMITHING);
        registration.addRecipeCatalyst(new ItemStack(OTBlocks.DRAWN_FURNACE.get()), VanillaRecipeCategoryUid.FURNACE, VanillaRecipeCategoryUid.FUEL);
    }
}
