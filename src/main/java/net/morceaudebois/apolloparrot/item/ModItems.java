package net.morceaudebois.apolloparrot.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.MusicDiscItem;
import net.morceaudebois.apolloparrot.ApolloParrot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.morceaudebois.apolloparrot.sound.ModSounds;

public class ModItems {
    public static final Item THYLACINE_SKULL = registerItem("thylacine_skull", new Item(new FabricItemSettings()));

    public static final Item MUSIC_BOX_MUSIC_DISC = registerItem("music_box_music_disc",
            new MusicDiscItem(6, ModSounds.MUSIC_BOX, new FabricItemSettings().maxCount(1), 2));



    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(THYLACINE_SKULL);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ApolloParrot.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ApolloParrot.LOGGER.info("Registering Mod Items for " + ApolloParrot.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToIngredientItemGroup);
    }
}
