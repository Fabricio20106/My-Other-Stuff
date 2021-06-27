package com.others;

import com.others.init.BlockInit;
import com.others.init.StuffInit;
import com.others.init.WeaponryInit;
import com.others.misc.OreGeneration;
import com.others.misc.OtherSounds;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Mod(MyOtherStuff.mod_id)
public class MyOtherStuff {
    // 16773874 <- inno decimal color fff2f2 <- inno hexadecimal color
    // WeaponryInit.weapons.register(Registring);
    // .maxStackSize(1)

    public static final Logger logger = LogManager.getLogManager().getLogger(MyOtherStuff.mod_id);

    public static final String mod_id = "others";

    public MyOtherStuff() {
        final IEventBus Registring = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
        /*Some Other Stuff*/
        register();

        StuffInit.items.register(Registring);
        BlockInit.blocks.register(Registring);
        WeaponryInit.register();
        StuffInit.register();
        BlockInit.register();
        OtherSounds.register();
        OtherSounds.registerSounds();
    }

    public static void register() {}

    public void setup(final FMLCommonSetupEvent event) {}

    public void doClientStuff(final FMLClientSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {}
}
