package com.junethewoods.myotherstuff.crafting.custom;

import com.google.gson.*;
import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.block.OTBlocks;
import com.junethewoods.myotherstuff.crafting.OTRecipeSerializers;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistryEntry;

import javax.annotation.Nullable;

public class TailoringRecipe implements IRecipe<IInventory> {
    public static final ResourceLocation TYPE_ID = MyOtherStuff.resourceLoc("tailoring");
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    protected final Ingredient ingredient;
    protected final ItemStack result;
    private final IRecipeType<?> type;
    private final IRecipeSerializer<?> serializer;
    protected final ResourceLocation id;
    protected final String group;

    public TailoringRecipe(IRecipeType<?> recipeType, IRecipeSerializer<?> recipeSerializer, ResourceLocation recipeID, String group, Ingredient ingredient, ItemStack result) {
        this.ingredient = ingredient;
        this.result = result;
        this.type = recipeType;
        this.serializer = recipeSerializer;
        this.id = recipeID;
        this.group = group;
    }

    @Override
    public boolean matches(IInventory inventory, World world) {
        return this.ingredient.test(inventory.getItem(0));
    }

    @Override
    public ItemStack assemble(IInventory inventory) {
        return this.result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResultItem() {
        return this.result;
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(OTBlocks.TAILORING_BENCH.get());
    }

    @Override
    public ResourceLocation getId() {
        return this.id;
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return this.serializer;
    }

    @Override
    public IRecipeType<?> getType() {
        return OTRecipeSerializers.TAILORING_RECIPE;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> nonNullList = NonNullList.create();
        nonNullList.add(this.ingredient);
        return nonNullList;
    }

    public static class TailoringRecipeType implements IRecipeType<TailoringRecipe> {
        @Override
        public String toString() {
            return TailoringRecipe.TYPE_ID.toString();
        }
    }

    public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<TailoringRecipe> {
        @Override
        public TailoringRecipe fromJson(ResourceLocation recipeID, JsonObject object) {
            String group = JSONUtils.getAsString(object, "group", "");
            Ingredient ingredient1;
            if (JSONUtils.isArrayNode(object, "ingredient")) {
                ingredient1 = Ingredient.fromJson(JSONUtils.getAsJsonArray(object, "ingredient"));
            } else {
                ingredient1 = Ingredient.fromJson(JSONUtils.getAsJsonObject(object, "ingredient"));
            }

            String result = JSONUtils.getAsString(object, "result");
            int count = JSONUtils.getAsInt(object, "count");
            ItemStack resultStack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(result)), count);
            // Adds NBT to the result item.
            if (object.has("nbt")) {
                // Copied from CraftingHelper.java.
                try {
                    JsonElement nbt = object.get("nbt");
                    CompoundNBT tag;
                    if (nbt.isJsonObject()) {
                        tag = JsonToNBT.parseTag(GSON.toJson(nbt));
                    } else {
                        tag = JsonToNBT.parseTag(JSONUtils.convertToString(nbt, "nbt"));
                    }

                    CompoundNBT tag1 = new CompoundNBT();
                    if (tag.contains("ForgeCaps")) {
                        if (tag.get("ForgeCaps") != null) tag1.put("ForgeCaps", tag.get("ForgeCaps"));
                        tag.remove("ForgeCaps");
                    }

                    tag1.put("tag", tag);
                    tag1.putString("id", new ResourceLocation(result).toString());
                    tag1.putInt("Count", JSONUtils.getAsInt(object, "count", 1));
                    resultStack = ItemStack.of(tag1);
                } catch (CommandSyntaxException syntaxException) {
                    throw new JsonSyntaxException("My Other Stuff: Invalid NBT entry: " + syntaxException);
                }
            }

            return new TailoringRecipe(OTRecipeSerializers.TAILORING_RECIPE, this, recipeID, group, ingredient1, resultStack);
        }

        @Nullable
        @Override
        public TailoringRecipe fromNetwork(ResourceLocation recipeID, PacketBuffer buffer) {
            Ingredient ingredient1 = Ingredient.fromNetwork(buffer);
            ItemStack networkStack = buffer.readItem();
            return new TailoringRecipe(OTRecipeSerializers.TAILORING_RECIPE, this, recipeID, "", ingredient1, networkStack);
        }

        @Override
        public void toNetwork(PacketBuffer buffer, TailoringRecipe recipe) {
            buffer.writeUtf(recipe.group);
            recipe.ingredient.toNetwork(buffer);
            buffer.writeItem(recipe.result);
        }
    }
}
