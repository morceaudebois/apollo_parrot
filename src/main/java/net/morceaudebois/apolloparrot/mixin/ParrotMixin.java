package net.morceaudebois.apolloparrot.mixin;

import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.animal.parrot.Parrot;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.morceaudebois.apolloparrot.sound.ApolloSoundLibrary;

import java.util.Random;

@Mixin(Parrot.class)
public class ParrotMixin {
    @Inject(method = "getAmbient", at = @At("RETURN"), cancellable = true)
    private static void injected(Level level, RandomSource random, CallbackInfoReturnable<SoundEvent> cir) {
        if (cir.getReturnValue() == SoundEvents.PARROT_AMBIENT) {
            SoundEvent[] ApolloSounds = ApolloSoundLibrary.APOLLO_SOUNDS;

            // Create a Random object
            Random rand = new Random();

            if (rand.nextInt(3) < 1) {
                // Generate a random number from 0 to 2 (inclusive) to select one of three values
                int randomNumber = rand.nextInt(ApolloSoundLibrary.APOLLO_SOUNDS.length);
                cir.setReturnValue(ApolloSounds[randomNumber]);
            }
        }
    }
}