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

    // fonction basique pour register l'item
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ApolloParrot.MOD_ID, name), item);
    }

    // appelé dans fichier initialiser
    public static void registerModItems() {
        ApolloParrot.LOGGER.info("Registering Mod Items for " + ApolloParrot.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }

    public static final Item THYLACINE_SKULL = registerItem("thylacine_skull",
            new Item(new FabricItemSettings())
    );

    // liste tous les items à mettre dans natural? genre un array
    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(THYLACINE_SKULL);
    }



    public static final Item HARRY_POTTER_MUSIC_DISC = registerItem("harry_potter_music_disc",
            new MusicDiscItem(6, ModSounds.NEVER_GONNA_GIVE_YOU_UP, new FabricItemSettings().maxCount(1), 211));


    public static final Item HK_MANTIS_LORDS_MUSIC_DISC = registerItem("hk_mantis_lords_music_disc",
            new MusicDiscItem(6, ModSounds.HK_MANTIS_LORDS, new FabricItemSettings().maxCount(1), 105));

    public static final Item HK_DUNG_DEFENDER_MUSIC_DISC = registerItem("hk_dung_defender_music_disc",
            new MusicDiscItem(6, ModSounds.HK_DUNG_DEFENDER, new FabricItemSettings().maxCount(1), 78));

    public static final Item HK_WHITE_PALACE_MUSIC_DISC = registerItem("hk_white_palace_music_disc",
            new MusicDiscItem(6, ModSounds.HK_WHITE_PALACE, new FabricItemSettings().maxCount(1), 259));

    public static final Item HK_GRIMM_TROUPE_MUSIC_DISC = registerItem("hk_grimm_troupe_music_disc",
            new MusicDiscItem(6, ModSounds.HK_GRIMM_TROUPE, new FabricItemSettings().maxCount(1), 139));


    public static final Item H_NO_ESCAPE_MUSIC_DISC = registerItem("h_no_escape_music_disc",
            new MusicDiscItem(6, ModSounds.H_NO_ESCAPE, new FabricItemSettings().maxCount(1), 146));

    public static final Item H_FROM_OLYMPUS_MUSIC_DISC = registerItem("h_from_olympus_music_disc",
            new MusicDiscItem(6, ModSounds.H_FROM_OLYMPUS, new FabricItemSettings().maxCount(1), 192));

    public static final Item H_LAMENT_OF_ORPHEUS_MUSIC_DISC = registerItem("h_lament_of_orpheus_music_disc",
            new MusicDiscItem(6, ModSounds.H_LAMENT_OF_ORPHEUS, new FabricItemSettings().maxCount(1), 193));

    public static final Item H_GOOD_RIDDANCE_MUSIC_DISC = registerItem("h_good_riddance_music_disc",
            new MusicDiscItem(6, ModSounds.H_GOOD_RIDDANCE, new FabricItemSettings().maxCount(1), 178));

    public static final Item H_THE_UNSEEN_ONE_MUSIC_DISC = registerItem("h_the_unseen_one_music_disc",
            new MusicDiscItem(6, ModSounds.H_THE_UNSEEN_ONE, new FabricItemSettings().maxCount(1), 259));


    public static final Item SMASH_MELEE_MUSIC_DISC = registerItem("smash_melee_music_disc",
            new MusicDiscItem(6, ModSounds.SMASH_MELEE, new FabricItemSettings().maxCount(1), 196));

    public static final Item SMASH_BRAWL_MUSIC_DISC = registerItem("smash_brawl_music_disc",
            new MusicDiscItem(6, ModSounds.SMASH_BRAWL, new FabricItemSettings().maxCount(1), 140));

    public static final Item SMASH_4_MUSIC_DISC = registerItem("smash_4_music_disc",
            new MusicDiscItem(6, ModSounds.SMASH_4, new FabricItemSettings().maxCount(1), 127));

    public static final Item SMASH_ULTIMATE_MUSIC_DISC = registerItem("smash_ultimate_music_disc",
            new MusicDiscItem(6, ModSounds.SMASH_ULTIMATE, new FabricItemSettings().maxCount(1), 226));





    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(HARRY_POTTER_MUSIC_DISC);

        entries.add(HK_MANTIS_LORDS_MUSIC_DISC);
        entries.add(HK_DUNG_DEFENDER_MUSIC_DISC);
        entries.add(HK_WHITE_PALACE_MUSIC_DISC);
        entries.add(HK_GRIMM_TROUPE_MUSIC_DISC);

        entries.add(H_NO_ESCAPE_MUSIC_DISC);
        entries.add(H_FROM_OLYMPUS_MUSIC_DISC);
        entries.add(H_LAMENT_OF_ORPHEUS_MUSIC_DISC);
        entries.add(H_GOOD_RIDDANCE_MUSIC_DISC);
        entries.add(H_THE_UNSEEN_ONE_MUSIC_DISC);

        entries.add(SMASH_MELEE_MUSIC_DISC);
        entries.add(SMASH_BRAWL_MUSIC_DISC);
        entries.add(SMASH_4_MUSIC_DISC);
        entries.add(SMASH_ULTIMATE_MUSIC_DISC);
    }
}
