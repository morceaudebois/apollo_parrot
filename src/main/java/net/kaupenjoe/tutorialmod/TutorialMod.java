package net.kaupenjoe.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.kaupenjoe.tutorialmod.item.ModItems;
import net.kaupenjoe.tutorialmod.mixin.ParrotMixin;
import net.kaupenjoe.tutorialmod.sound.ModSounds;
import net.kaupenjoe.tutorialmod.util.ModLootTableModifiers;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModLootTableModifiers.modifyLootTables();

		ModSounds.initializeSounds();

		// Register the right-click interaction with cows
		UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			if (entity instanceof CowEntity && hand == Hand.MAIN_HAND) {
				// Play your custom sound when right-clicking on a cow
				player.playSound(ModSounds.COOL_SOUND, 1.0f, 1.0f);
				return ActionResult.SUCCESS; // Indicate that the interaction was successful
			}
			return ActionResult.PASS; // Continue with default interaction
		});
	}
}