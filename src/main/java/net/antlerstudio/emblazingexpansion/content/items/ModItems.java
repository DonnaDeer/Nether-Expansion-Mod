package net.antlerstudio.emblazingexpansion.content.items;

import net.antlerstudio.emblazingexpansion.EmblazingExpansionMain;
import net.antlerstudio.emblazingexpansion.content.blocks.ModMiscBlocks;
import net.antlerstudio.emblazingexpansion.content.items.custom.ModFoodComponents;
import net.antlerstudio.emblazingexpansion.content.items.custom.WarpedBerryItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item WARPED_SEED = registerItem("warped_seed",
            new AliasedBlockItem(ModMiscBlocks.WILD_WARPED_BERRY, new FabricItemSettings()
                    .group(ItemGroup.MISC)
                    .fireproof()
                    .maxCount(16)));

    public static final Item WARPED_BERRY = registerItem("warped_berry",
            new WarpedBerryItem(new FabricItemSettings()
                    .group(ItemGroup.FOOD)
                    .food(ModFoodComponents.WARPED_BERRY)
                    .fireproof()));

    public static final Item CRIMSON_ROOT = registerItem("crimson_root",
            new Item(new FabricItemSettings()
                    .group(ItemGroup.FOOD)
                    .food(ModFoodComponents.CRIMSON_ROOT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EmblazingExpansionMain.MOD_ID, name), item);
    }

    public static void registerModItems() {}
}