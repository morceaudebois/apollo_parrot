
package net.kaupenjoe.tutorialmod.sound;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    // ITEM_METAL_WHISTLE is the name of the custom sound event
    // and is called in the mod to use the custom sound
    public static SoundEvent COOL_SOUND = registerSound("cool_sound");

    // actual registration of all the custom SoundEvents
    static SoundEvent registerSound(String id) {
        SoundEvent sound = SoundEvent.of(new Identifier(TutorialMod.MOD_ID, id));
        return Registry.register(Registries.SOUND_EVENT, new Identifier(TutorialMod.MOD_ID, id), sound);
    }

    // called in the ModInitializer implementing class
    // to initialize the ModSounds class
    public static void initializeSounds() {
        TutorialMod.LOGGER.info("Registering " + TutorialMod.MOD_ID + " Sounds");
    }


}