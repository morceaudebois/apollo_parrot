package net.morceaudebois.apolloparrot.mixin;

import net.morceaudebois.apolloparrot.sound.ModSounds;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(ParrotEntity.class)
public class ParrotMixin {
    @Inject(method = "getRandomSound", at = @At("RETURN"), cancellable = true)
    private static void injected(CallbackInfoReturnable<SoundEvent> cir) {
        if (cir.getReturnValue() == SoundEvents.ENTITY_PARROT_AMBIENT) {
            SoundEvent[] ApolloSounds = {
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
                    ModSounds.BALL,
                    ModSounds.BURP,
                    ModSounds.FIRE,
                    ModSounds.HAT
            };

            // Create a Random object
            Random random = new Random();

            if (random.nextInt(3) < 1) {
                // Generate a random number from 0 to 2 (inclusive) to select one of three values
                int randomNumber = random.nextInt(46);
                cir.setReturnValue(ApolloSounds[randomNumber]);
            }

        }
    }
}