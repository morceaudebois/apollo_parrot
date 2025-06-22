package net.morceaudebois.apolloparrot.mixin;

import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.morceaudebois.apolloparrot.sound.ApolloSoundLibrary;

import java.util.Random;

@Mixin(ParrotEntity.class)
public class ParrotMixin {
    @Inject(method = "getRandomSound", at = @At("RETURN"), cancellable = true)
    private static void injected(CallbackInfoReturnable<SoundEvent> cir) {
        if (cir.getReturnValue() == SoundEvents.ENTITY_PARROT_AMBIENT) {
            SoundEvent[] ApolloSounds = ApolloSoundLibrary.APOLLO_SOUNDS;

            // Create a Random object
            Random random = new Random();

            if (random.nextInt(3) < 1) {
                // Generate a random number from 0 to 2 (inclusive) to select one of three values
                int randomNumber = random.nextInt(ApolloSoundLibrary.APOLLO_SOUNDS.length);
                cir.setReturnValue(ApolloSounds[randomNumber]);
            }

        }
    }
}