package net.bodaraffael.technic_mod_good_vibes.util;

import net.bodaraffael.technic_mod_good_vibes.TechnicMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> NEEDS_ELECTRIC_TOOL = createTag("needs_electric_tool");
        public static final TagKey<Block> INCORRECT_FOR_ELECTRIC_TOOL = createTag("incorrect_for_electric_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(TechnicMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(TechnicMod.MOD_ID, name));
        }
    }

}
