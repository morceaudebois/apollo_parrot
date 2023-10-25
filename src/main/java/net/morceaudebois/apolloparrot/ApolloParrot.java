package net.morceaudebois.apolloparrot;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.morceaudebois.apolloparrot.item.ModItems;
import net.morceaudebois.apolloparrot.sound.ModSounds;
import net.morceaudebois.apolloparrot.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApolloParrot implements ModInitializer {
	public static final String MOD_ID = "apolloparrot";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModSounds.initializeSounds();

		ModItems.registerModItems();

		ModLootTableModifiers.modifyLootTables();
		// Register the right-click interaction with cows
		UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			if (entity instanceof CowEntity && hand == Hand.MAIN_HAND) {
				// Play your custom sound when right-clicking on a cow
				// player.playSound(ModSounds.COOL_SOUND, 1.0f, 1.0f);
				return ActionResult.SUCCESS; // Indicate that the interaction was successful
			}
			return ActionResult.PASS; // Continue with default interaction
		});

	}
}