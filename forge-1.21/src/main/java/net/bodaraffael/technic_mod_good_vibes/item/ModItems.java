package net.bodaraffael.technic_mod_good_vibes.item;

import net.bodaraffael.technic_mod_good_vibes.TechnicMod;
import net.bodaraffael.technic_mod_good_vibes.item.custom.ElectricDrill;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TechnicMod.MOD_ID);

    //Tools
    public static final RegistryObject<Item> WRENCH = ITEMS.register("wrench",
            () -> new Item(new Item.Properties()));

    //Custom Items
    public static final RegistryObject<Item> RAW_LITHIUM = ITEMS.register("raw_lithium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LITHIUM_INGOT = ITEMS.register("lithium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SILICON = ITEMS.register("raw_silicon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILICON_INGOT = ITEMS.register("silicon_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REFINED_IRON = ITEMS.register("refined_iron_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CONTROL_CIRCUIT = ITEMS.register("control_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SMALL_BATTERY = ITEMS.register("small_battery",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MKIV_PARTS = ITEMS.register("mkiv_parts",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ARC_REACTOR = ITEMS.register("arc_reactor",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHAINSAW = ITEMS.register("chainsaw",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBBER = ITEMS.register("resin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RESIN = ITEMS.register("rubber",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ELECTRIC_DRILL = ITEMS.register("electric_drill",
            () -> new ElectricDrill(ModToolTiers.ELECTRIC, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ELECTRIC, 7.0F, -3.5F))));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
