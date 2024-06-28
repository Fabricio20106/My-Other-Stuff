package com.junethewoods.myotherstuff.container;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.container.custom.TailoringBenchContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OTContainerTypes {
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MyOtherStuff.MOD_ID);

    public static final RegistryObject<ContainerType<TailoringBenchContainer>> TAILORING_BENCH = CONTAINERS.register("tailoring_bench", () -> new ContainerType<>(TailoringBenchContainer::new));
}
