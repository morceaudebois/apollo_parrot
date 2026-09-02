package net.morceaudebois.apolloparrot;

import net.fabricmc.api.ModInitializer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.morceaudebois.apolloparrot.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.world.entity.animal.parrot.Parrot;
import net.minecraft.world.InteractionResult;
import net.minecraft.sounds.SoundEvent;
import net.morceaudebois.apolloparrot.sound.ApolloSoundLibrary;
import java.util.Random;


public class ApolloParrot implements ModInitializer {
	public static final String MOD_ID = "apolloparrot";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModSounds.initializeSounds();

		UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			if (entity instanceof Parrot && hand == InteractionHand.MAIN_HAND && player.getMainHandItem().isEmpty()) {
				Random random = new Random();

				SoundEvent sound = ApolloSoundLibrary.APOLLO_SOUNDS[random.nextInt(ApolloSoundLibrary.APOLLO_SOUNDS.length)];

				world.playSound(
						null,
						entity.blockPosition(),
						sound,
						SoundSource.NEUTRAL,
						1.0f,
						1.0f
				);

				return InteractionResult.SUCCESS;
			}
			return InteractionResult.PASS;
		});
	}
}