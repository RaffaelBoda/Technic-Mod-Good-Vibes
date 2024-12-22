package net.bodaraffael.technic_mod_good_vibes.datagen;

import net.bodaraffael.technic_mod_good_vibes.block.ModBlocks;
import net.bodaraffael.technic_mod_good_vibes.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;


import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        //Custom Tools-------------------------------------------------------------------------------------------------

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRIC_DRILL.get())
                .pattern("III")
                .pattern(" I ")
                .pattern("RBR")
                .define('I', ModItems.REFINED_IRON.get())
                .define('B', ModItems.SMALL_BATTERY.get())
                .define('R', ModItems.RUBBER.get())
                .unlockedBy(getHasName(ModItems.SMALL_BATTERY.get()), has(ModItems.REFINED_IRON.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHAINSAW.get())
                .pattern(" I ")
                .pattern(" I ")
                .pattern("RBR")
                .define('I', ModItems.REFINED_IRON.get())
                .define('B', ModItems.SMALL_BATTERY.get())
                .define('R', ModItems.RUBBER.get())
                .unlockedBy(getHasName(ModItems.SMALL_BATTERY.get()), has(ModItems.REFINED_IRON.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WRENCH.get())
                .pattern("A A")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.REFINED_IRON.get())
                .unlockedBy(getHasName(ModItems.REFINED_IRON.get()), has(ModItems.REFINED_IRON.get())).save(pRecipeOutput);

        //Custom Blocks------------------------------------------------------------------------------------------------

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LITHIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LITHIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.LITHIUM_INGOT.get()), has(ModItems.LITHIUM_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILICON_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SILICON_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILICON_INGOT.get()), has(ModItems.SILICON_INGOT.get())).save(pRecipeOutput);


        //Custom Items-------------------------------------------------------------------------------------------------

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SMALL_BATTERY.get())
                .pattern(" B ")
                .pattern("BAB")
                .pattern("BAB")
                .define('A', ModItems.LITHIUM_INGOT.get())
                .define('B', ModItems.REFINED_IRON.get())
                .unlockedBy(getHasName(ModItems.LITHIUM_INGOT.get()), has(ModItems.LITHIUM_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CONTROL_CIRCUIT.get())
                .pattern("RSR")
                .pattern("SBS")
                .pattern("RSR")
                .define('S', ModItems.SILICON_INGOT.get())
                .define('R', Items.REDSTONE)
                .define('B', ModItems.SMALL_BATTERY.get())
                .unlockedBy(getHasName(ModItems.SILICON_INGOT.get()), has(ModItems.SILICON_INGOT.get())).save(pRecipeOutput);

        SimpleCookingRecipeBuilder.blasting(
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.MISC,
                        ModItems.REFINED_IRON.get(),
                        0.7f,
                        200
                ).unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(pRecipeOutput);


        //Custom Armor Parts-------------------------------------------------------------------------------------------

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARC_REACTOR.get())
                .pattern("BSB")
                .pattern("SBS")
                .pattern("BSB")
                .define('S', ModItems.SILICON_INGOT.get())
                .define('B', ModItems.SMALL_BATTERY.get())
                .unlockedBy(getHasName(ModItems.SILICON_INGOT.get()), has(ModItems.SILICON_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MKIV_PARTS.get())
                .pattern("GRG")
                .pattern("RAR")
                .pattern("GRG")
                .define('G', Items.GOLD_INGOT)
                .define('R', ModItems.REFINED_IRON.get())
                .define('A', ModItems.ARC_REACTOR.get())
                .unlockedBy(getHasName(ModItems.REFINED_IRON.get()), has(ModItems.SILICON_INGOT.get())).save(pRecipeOutput);

    }
}
