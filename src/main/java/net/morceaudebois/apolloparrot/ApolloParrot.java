package net.morceaudebois.apolloparrot;

import net.fabricmc.api.ModInitializer;
import net.morceaudebois.apolloparrot.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApolloParrot implements ModInitializer {
	public static final String MOD_ID = "apolloparrot";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModSounds.initializeSounds();

	}
}