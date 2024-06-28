package com.junethewoods.myotherstuff.compat.jei;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.block.OTBlocks;
import com.junethewoods.myotherstuff.crafting.custom.TailoringRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class TailoringRecipeCategory implements IRecipeCategory<TailoringRecipe> {
    public final static ResourceLocation UID = MyOtherStuff.resourceLoc("tailoring");
    private final IDrawable background;
    private final IDrawable icon;
    private final ITextComponent localizedName;
    private static final int INPUT_SLOT = 0;
    private static final int OUTPUT_SLOT = 1;
    public static final int WIDTH = 82;
    public static final int HEIGHT = 34;

    public TailoringRecipeCategory(IGuiHelper guiHelper) {
        ResourceLocation vanillaGuis = new ResourceLocation("jei", "textures/gui/gui_vanilla.png");
        this.background = guiHelper.createDrawable(vanillaGuis, 0, 220, WIDTH, HEIGHT);
        this.icon = guiHelper.createDrawableIngredient(new ItemStack(OTBlocks.TAILORING_BENCH.get()));
        this.localizedName = new TranslationTextComponent("gui.jei.category.tailoring");
    }

    @Override
    public ResourceLocation getUid() {
        return MyOtherStuff.resourceLoc("tailoring");
    }

    @Override
    public Class<? extends TailoringRecipe> getRecipeClass() {
        return TailoringRecipe.class;
    }

    @Override
    public String getTitle() {
        return getTitleAsTextComponent().getString();
    }

    @Override
    public ITextComponent getTitleAsTextComponent() {
        return this.localizedName;
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setIngredients(TailoringRecipe recipe, IIngredients ingredients) {
        ingredients.setInputIngredients(recipe.getIngredients());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getResultItem());
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, TailoringRecipe recipe, IIngredients ingredients) {
        IGuiItemStackGroup stackGroup = recipeLayout.getItemStacks();
        stackGroup.init(INPUT_SLOT, true, 0, 8);
        stackGroup.init(OUTPUT_SLOT, false, 60, 8);
        stackGroup.set(ingredients);
    }

    @Override
    public boolean isHandled(TailoringRecipe recipe) {
        return !recipe.isSpecial();
    }
}
