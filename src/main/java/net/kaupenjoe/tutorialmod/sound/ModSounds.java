
package net.kaupenjoe.tutorialmod.sound;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    // ITEM_METAL_WHISTLE is the name of the custom sound event
    // and is called in the mod to use the custom sound
    public static SoundEvent GLASK = registerSound("glask");
    public static SoundEvent NO_CHEWING = registerSound("no_chewing");
    public static SoundEvent WARIO = registerSound("wario");

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