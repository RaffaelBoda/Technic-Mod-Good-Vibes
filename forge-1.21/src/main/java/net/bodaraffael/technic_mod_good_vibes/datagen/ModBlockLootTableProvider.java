package net.bodaraffael.technic_mod_good_vibes.datagen;

import net.bodaraffael.technic_mod_good_vibes.block.ModBlocks;
import net.bodaraffael.technic_mod_good_vibes.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {

        dropSelf(ModBlocks.LITHIUM_BLOCK.get());
        dropSelf(ModBlocks.SILICON_BLOCK.get());


        this.add(ModBlocks.LITHIUM_ORE_BLOCK.get(),
                block -> createOreDrop(ModBlocks.LITHIUM_ORE_BLOCK.get(), ModItems.RAW_LITHIUM.get()));
        this.add(ModBlocks.SILICON_ORE_BLOCK.get(),
                block -> createOreDrop(ModBlocks.SILICON_ORE_BLOCK.get(), ModItems.RAW_SILICON.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
