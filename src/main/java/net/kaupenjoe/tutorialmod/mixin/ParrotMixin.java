package net.kaupenjoe.tutorialmod.mixin;

import net.kaupenjoe.tutorialmod.sound.ModSounds;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.sound.SoundEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ParrotEntity.class)
public class ParrotMixin {
    @Inject(method = "getRandomSound", at = @At("RETURN"), cancellable = true)
    private static void injected(CallbackInfoReturnable<SoundEvent> cir) {
        cir.setReturnValue(ModSounds.COOL_SOUND);
    }
}