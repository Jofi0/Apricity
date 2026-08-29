package net.jofi.apricity;

import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;

import net.jofi.apricity.config.ApricityConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Apricity implements ModInitializer {
	public static final String MOD_ID = "apricity";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        MidnightConfig.init(MOD_ID, ApricityConfig.class);

		LOGGER.info("bleh :3");
	}
}