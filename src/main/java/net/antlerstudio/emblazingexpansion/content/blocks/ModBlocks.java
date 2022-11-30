package net.antlerstudio.emblazingexpansion.content.blocks;

import net.antlerstudio.emblazingexpansion.EmblazingExpansionMain;
import net.antlerstudio.emblazingexpansion.content.blocks.custom.WarpedBerryCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(EmblazingExpansionMain.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(EmblazingExpansionMain.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }
    public static void registerModBlocks() {}
}