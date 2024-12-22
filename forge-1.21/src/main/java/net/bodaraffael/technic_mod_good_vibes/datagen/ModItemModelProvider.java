package net.bodaraffael.technic_mod_good_vibes.datagen;

import net.bodaraffael.technic_mod_good_vibes.TechnicMod;
import net.bodaraffael.technic_mod_good_vibes.block.ModBlocks;
import net.bodaraffael.technic_mod_good_vibes.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TechnicMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //Tools--------------------------------------------------------------------------------------------------------

        basicItem(ModItems.WRENCH.get());
        basicItem(ModItems.CHAINSAW.get());
        basicItem(ModItems.ELECTRIC_DRILL.get());

        //Custom Items-------------------------------------------------------------------------------------------------

        basicItem(ModItems.SMALL_BATTERY.get());
        basicItem(ModItems.RAW_LITHIUM.get());
        basicItem(ModItems.LITHIUM_INGOT.get());
        basicItem(ModItems.RAW_SILICON.get());
        basicItem(ModItems.SILICON_INGOT.get());
        basicItem(ModItems.REFINED_IRON.get());
        basicItem(ModItems.COAL_DUST.get());
        basicItem(ModItems.CONTROL_CIRCUIT.get());
        basicItem(ModItems.RESIN.get());
        basicItem(ModItems.RUBBER.get());

        //Custom Amor Parts--------------------------------------------------------------------------------------------

        basicItem(ModItems.MKIV_PARTS.get());
        basicItem(ModItems.ARC_REACTOR.get());


    }

}
