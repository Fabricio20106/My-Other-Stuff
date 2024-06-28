package com.junethewoods.myotherstuff.crafting;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.crafting.custom.TailoringRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OTRecipeSerializers {
    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MyOtherStuff.MOD_ID);

    public static IRecipeType<TailoringRecipe> TAILORING_RECIPE = new TailoringRecipe.TailoringRecipeType();

    public static final RegistryObject<TailoringRecipe.Serializer> TAILORING = RECIPE_SERIALIZERS.register("tailoring", TailoringRecipe.Serializer::new);
}
