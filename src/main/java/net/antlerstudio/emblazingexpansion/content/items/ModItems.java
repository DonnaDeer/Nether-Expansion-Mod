package net.antlerstudio.emblazingexpansion.content.items;

import net.antlerstudio.emblazingexpansion.EmblazingExpansionMain;
import net.antlerstudio.emblazingexpansion.content.blocks.ModBlocks;
import net.antlerstudio.emblazingexpansion.content.blocks.ModMiscBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item WARPED_SEED = registerItem("warped_seed",
            new AliasedBlockItem(ModMiscBlocks.WILD_WARPED_BERRY, new FabricItemSettings().group(ItemGroup.FOOD)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EmblazingExpansionMain.MOD_ID, name), item);
    }

    public static void registerModItems() {}
}