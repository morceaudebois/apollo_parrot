
package net.morceaudebois.apolloparrot.sound;

import net.morceaudebois.apolloparrot.ApolloParrot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    // ITEM_METAL_WHISTLE is the name of the custom sound event
    // and is called in the mod to use the custom sound
    public static SoundEvent BOTTLE = registerSound("bottle");
    public static SoundEvent APOLLO = registerSound("apollo");
    public static SoundEvent BOOM = registerSound("boom");
    public static SoundEvent BOOP = registerSound("boop");
    public static SoundEvent CHICKEN = registerSound("chicken");
    public static SoundEvent CORK = registerSound("cork");
    public static SoundEvent GLASK = registerSound("glask");
    public static SoundEvent GLASS_2 = registerSound("glass_2");
    public static SoundEvent GLASS = registerSound("glass");
    public static SoundEvent GOOD_BOY = registerSound("good_boy");
    public static SoundEvent HELLO = registerSound("hello");
    public static SoundEvent LETSGO = registerSound("letsgo");
    public static SoundEvent METAL = registerSound("metal");
    public static SoundEvent NO_CHEWING = registerSound("no_chewing");
    public static SoundEvent NOISE1 = registerSound("noise1");
    public static SoundEvent PAPER = registerSound("paper");
    public static SoundEvent PEEKABOO = registerSound("peekaboo");
    public static SoundEvent PLANT = registerSound("plant");
    public static SoundEvent ROCK = registerSound("rock");
    public static SoundEvent SAWTHEBIRD = registerSound("sawthebird");
    public static SoundEvent SHREK = registerSound("shrek");
    public static SoundEvent SHROCK = registerSound("shrock");
    public static SoundEvent SLURP = registerSound("slurp");
    public static SoundEvent SMALL_SUCK = registerSound("small_suck");
    public static SoundEvent SQUIRREL = registerSound("squirrel");
    public static SoundEvent STEP_UP = registerSound("step_up");
    public static SoundEvent STOP_DOING_THE_CORN = registerSound("stop_doing_the_corn");
    public static SoundEvent SUCK1 = registerSound("suck1");
    public static SoundEvent SUCK2 = registerSound("suck2");
    public static SoundEvent THISISABOWL = registerSound("thisisabowl");
    public static SoundEvent TOUCHYOURBEAK = registerSound("touchyourbeak");
    public static SoundEvent WANNASNACK = registerSound("wannasnack");
    public static SoundEvent WARIO = registerSound("wario");
    public static SoundEvent WHAT_COLOR = registerSound("what_color");
    public static SoundEvent WHATS_THIS = registerSound("whats_this");
    public static SoundEvent WHATS_THIS2 = registerSound("whats_this2");
    public static SoundEvent WOW = registerSound("wow");

    public static SoundEvent MUSIC_BOX = registerSound("music_box");


    // actual registration of all the custom SoundEvents
    static SoundEvent registerSound(String id) {
        SoundEvent sound = SoundEvent.of(new Identifier(ApolloParrot.MOD_ID, id));
        return Registry.register(Registries.SOUND_EVENT, new Identifier(ApolloParrot.MOD_ID, id), sound);
    }

    // called in the ModInitializer implementing class
    // to initialize the ModSounds class
    public static void initializeSounds() {
        ApolloParrot.LOGGER.info("Registering " + ApolloParrot.MOD_ID + " Sounds");
    }


}