package net.bodaraffael.technic_mod_good_vibes.worldgen;

import net.bodaraffael.technic_mod_good_vibes.TechnicMod;
import net.bodaraffael.technic_mod_good_vibes.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LITHIUM_ORE_KEY = registerKey("lithium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILICON_ORE_KEY = registerKey("silicon_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldLithiumOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.LITHIUM_ORE_BLOCK.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldSiliconOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.SILICON_ORE_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_SILICON_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLithiumOres, 9));
        register(context, OVERWORLD_LITHIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSiliconOres, 9));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(TechnicMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
