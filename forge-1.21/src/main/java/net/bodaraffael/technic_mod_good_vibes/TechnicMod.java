package net.bodaraffael.technic_mod_good_vibes;

import com.mojang.logging.LogUtils;
import net.bodaraffael.technic_mod_good_vibes.block.ModBlocks;
import net.bodaraffael.technic_mod_good_vibes.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TechnicMod.MOD_ID)
public class TechnicMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "technic_mod_good_vibes";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public TechnicMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)  {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

            //Tools----------------------------------------------------------------------------------------------------
            event.accept(ModItems.WRENCH);
            event.accept(ModItems.CHAINSAW);
            event.accept(ModItems.ELECTRIC_DRILL);

            //Custom Ores----------------------------------------------------------------------------------------------
            event.accept(ModItems.LITHIUM_INGOT);
            event.accept(ModItems.RAW_LITHIUM);
            event.accept(ModItems.SILICON_INGOT);
            event.accept(ModItems.RAW_SILICON);
            event.accept(ModItems.COAL_DUST);
            event.accept(ModItems.CONTROL_CIRCUIT);
            event.accept(ModItems.SMALL_BATTERY);
            event.accept(ModItems.MKIV_PARTS);
            event.accept(ModItems.ARC_REACTOR);
            event.accept(ModItems.RESIN);
            event.accept(ModItems.RUBBER);

            event.accept(ModItems.REFINED_IRON);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            //Custom Ore Blocks
            event.accept(ModBlocks.LITHIUM_ORE_BLOCK);
            event.accept(ModBlocks.LITHIUM_BLOCK);
            event.accept(ModBlocks.SILICON_ORE_BLOCK);
            event.accept(ModBlocks.SILICON_BLOCK);

            //Custom Machine Blocks

        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
