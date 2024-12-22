package net.bodaraffael.technic_mod_good_vibes.item;

import net.bodaraffael.technic_mod_good_vibes.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {

    public static final Tier ELECTRIC = new ForgeTier(1400, 4, 3f, 18,
            ModTags.Blocks.NEEDS_ELECTRIC_TOOL, () -> Ingredient.of(Items.DIAMOND), ModTags.Blocks.INCORRECT_FOR_ELECTRIC_TOOL);

}
