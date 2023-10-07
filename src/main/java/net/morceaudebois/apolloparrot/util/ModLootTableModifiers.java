package net.morceaudebois.apolloparrot.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.morceaudebois.apolloparrot.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModLootTableModifiers {
    private static final Identifier SUSPICIOUS_SAND_ID =
            new Identifier("minecraft", "archaeology/desert_pyramid");

    private static final Identifier IGLOO_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/igloo_chest");

    public static void modifyLootTables() {
        // archéologie
        LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {
            if (SUSPICIOUS_SAND_ID.equals(id)) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(ModItems.THYLACINE_SKULL).build());

                LootPool.Builder pool = LootPool.builder().with(entries);
                return LootTable.builder().pool(pool).build();
            }

            return null;
        });

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (IGLOO_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.HARRY_POTTER_MUSIC_DISC))

                        .with(ItemEntry.builder(ModItems.HK_MANTIS_LORDS_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.HK_DUNG_DEFENDER_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.HK_WHITE_PALACE_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.HK_GRIMM_TROUPE_MUSIC_DISC))

                        .with(ItemEntry.builder(ModItems.H_NO_ESCAPE_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.H_FROM_OLYMPUS_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.H_LAMENT_OF_ORPHEUS_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.H_GOOD_RIDDANCE_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.H_THE_UNSEEN_ONE_MUSIC_DISC))

                        .with(ItemEntry.builder(ModItems.SMASH_MELEE_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.SMASH_BRAWL_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.SMASH_4_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.SMASH_ULTIMATE_MUSIC_DISC))

                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
