package net.morceaudebois.apolloparrot;

import net.fabricmc.api.ModInitializer;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.morceaudebois.apolloparrot.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.sound.SoundEvent;

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
			if (entity instanceof ParrotEntity && hand == Hand.MAIN_HAND) {
				SoundEvent[] apolloSounds = new SoundEvent[] {
						ModSounds.BOTTLE,
						ModSounds.APOLLO,
						ModSounds.BOOM,
						ModSounds.BOOP,
						ModSounds.CHICKEN,
						ModSounds.CORK,
						ModSounds.GLASK,
						ModSounds.GLASS_2,
						ModSounds.GLASS,
						ModSounds.GOOD_BOY,
						ModSounds.HELLO,
						ModSounds.LETSGO,
						ModSounds.METAL,
						ModSounds.NO_CHEWING,
						ModSounds.NOISE1,
						ModSounds.PAPER,
						ModSounds.PEEKABOO,
						ModSounds.PLANT,
						ModSounds.ROCK,
						ModSounds.SAWTHEBIRD,
						ModSounds.SHREK,
						ModSounds.SHROCK,
						ModSounds.SLURP,
						ModSounds.SMALL_SUCK,
						ModSounds.SQUIRREL,
						ModSounds.STEP_UP,
						ModSounds.STOP_DOING_THE_CORN,
						ModSounds.SUCK1,
						ModSounds.SUCK2,
						ModSounds.THISISABOWL,
						ModSounds.TOUCHYOURBEAK,
						ModSounds.WANNASNACK,
						ModSounds.WARIO,
						ModSounds.WHAT_COLOR,
						ModSounds.WHATS_THIS,
						ModSounds.WHATS_THIS2,
						ModSounds.WOW,
						ModSounds.BLOCK,
						ModSounds.ITS_A_BELL,
						ModSounds.BOWL,
						ModSounds.ITS_A_BUG,
						ModSounds.BALL,
						ModSounds.SHROCK_QUESTION,
						ModSounds.BURP,
						ModSounds.FIRE,
						ModSounds.HAT,
						ModSounds.TOUCH_OH,
						ModSounds.DROPLET,
						ModSounds.SNAPCHAT,
						ModSounds.WORT_WORT_WORT,
						ModSounds.THIS_IS_A_RAG,
						ModSounds.WANT_FRESH_WATER,
						ModSounds.COLOR_ORANGE,
						ModSounds.WRENCH,
						ModSounds.COME_HERE,
						ModSounds.DOOTDOOT
				};

				Random random = new Random();

				SoundEvent sound = apolloSounds[random.nextInt(apolloSounds.length)];

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