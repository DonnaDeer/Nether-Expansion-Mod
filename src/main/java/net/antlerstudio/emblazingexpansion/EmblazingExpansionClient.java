package net.antlerstudio.emblazingexpansion;

import net.antlerstudio.emblazingexpansion.content.blocks.ModBlocks;
import net.antlerstudio.emblazingexpansion.content.blocks.ModMiscBlocks;
import net.antlerstudio.emblazingexpansion.content.items.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmblazingExpansionClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlock(ModMiscBlocks.WILD_WARPED_BERRY, RenderLayer.getCutout());

	}
}
