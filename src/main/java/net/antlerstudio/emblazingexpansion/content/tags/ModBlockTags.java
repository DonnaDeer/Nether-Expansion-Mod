package net.antlerstudio.emblazingexpansion.content.tags;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockTags {
    public static final TagKey<Block> WARPED_BERRY_PLANTABLES = TagKey.of(Registry.BLOCK_KEY, new Identifier("emblazingexpansion", "warped_berry_plantables"));
}