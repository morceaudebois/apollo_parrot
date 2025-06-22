package net.morceaudebois.apolloparrot;

import net.fabricmc.api.ModInitializer;
import net.minecraft.sound.SoundCategory;
import net.morceaudebois.apolloparrot.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.sound.SoundEvent;
import net.morceaudebois.apolloparrot.sound.ApolloSoundLibrary;
import java.util.Random;


public class ApolloParrot implements ModInitializer {
	public static final String MOD_ID = "apolloparrot";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// ambient sounds
		ModSounds.initializeSounds();

		// when interacting on parrot
		UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			if (entity instanceof ParrotEntity && player.getStackInHand(hand).isEmpty()) {
				Random random = new Random();

				SoundEvent sound = ApolloSoundLibrary.APOLLO_SOUNDS[random.nextInt(ApolloSoundLibrary.APOLLO_SOUNDS.length)];

				world.playSound(
						null,
						entity.getBlockPos(),
						sound,
						SoundCategory.NEUTRAL,
						1.0f,
						1.0f
				);

				return ActionResult.SUCCESS;
			}
			return ActionResult.PASS; // Continue with default interaction
		});
	}
}