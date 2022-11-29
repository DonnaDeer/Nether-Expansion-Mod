package net.antlerstudio.emblazingexpansion;

import net.antlerstudio.emblazingexpansion.content.blocks.ModBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmblazingExpansionMain implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("emblazingexpansion");
	public static final String MOD_ID = "emblazingexpansion";

	@Override
	public void onInitialize() {


		//ModItems.registerModItems();

		ModBlocks.registerModBlocks();


		LOGGER.info("it's funny time");
	}
}
