package net.bodaraffael.technic_mod_good_vibes.datagen;

import net.bodaraffael.technic_mod_good_vibes.TechnicMod;
import net.bodaraffael.technic_mod_good_vibes.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.tags.TagEntry.tag;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TechnicMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.LITHIUM_ORE_BLOCK.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.SILICON_ORE_BLOCK.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.LITHIUM_BLOCK.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.SILICON_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.LITHIUM_ORE_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.SILICON_ORE_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.LITHIUM_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.SILICON_BLOCK.get());
    }

}
