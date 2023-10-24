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


    public static void modifyLootTables() {
        // archéologie
        LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {
            if (new Identifier("minecraft", "archaeology/desert_pyramid").equals(id)) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(ModItems.THYLACINE_SKULL).build());

                LootPool.Builder pool = LootPool.builder().with(entries);
                return LootTable.builder().pool(pool).build();
            }

            return null;
        });

        // Hollow Knight
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (
                new Identifier("minecraft", "chests/igloo_chest").equals(id) ||
                new Identifier("minecraft", "chests/abandoned_mineshaft").equals(id) ||
                new Identifier("minecraft", "chests/desert_pyramid").equals(id) ||
                new Identifier("minecraft", "chests/simple_dungeon").equals(id) ||
                new Identifier("minecraft", "chests/stronghold_corridor").equals(id) ||
                new Identifier("minecraft", "chests/stronghold_crossing").equals(id) ||
                new Identifier("minecraft", "chests/stronghold_library").equals(id) ||
                new Identifier("minecraft", "chests/underwater_ruin_small").equals(id) ||
                new Identifier("minecraft", "chests/underwater_ruin_big").equals(id)
                ) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.HARRY_POTTER_MUSIC_DISC))

                        .with(ItemEntry.builder(ModItems.HK_MANTIS_LORDS_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.HK_DUNG_DEFENDER_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.HK_WHITE_PALACE_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.HK_GRIMM_TROUPE_MUSIC_DISC))

                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });

        // smash
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (
                new Identifier("minecraft", "chests/ancient_city").equals(id) ||
                new Identifier("minecraft", "chests/bastion_treasure").equals(id) ||
                new Identifier("minecraft", "chests/buried_treasure").equals(id) ||
                new Identifier("minecraft", "chests/pillager_outpost").equals(id) ||
                new Identifier("minecraft", "chests/ruined_portal").equals(id) ||
                new Identifier("minecraft", "chests/shipwreck_treasure").equals(id) ||
                new Identifier("minecraft", "chests/stronghold_library").equals(id) ||
                new Identifier("minecraft", "chests/woodland_mansion").equals(id)
                ) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time

                        .with(ItemEntry.builder(ModItems.SMASH_MELEE_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.SMASH_BRAWL_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.SMASH_4_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.SMASH_ULTIMATE_MUSIC_DISC))

                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });

        // Hades
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (
                new Identifier("minecraft", "chests/bastion_bridge").equals(id) ||
                new Identifier("minecraft", "chests/bastion_hoglin_stable").equals(id) ||
                new Identifier("minecraft", "chests/bastion_other").equals(id) ||
                new Identifier("minecraft", "chests/bastion_treasure").equals(id) ||
                new Identifier("minecraft", "chests/end_city_treasure").equals(id) ||
                new Identifier("minecraft", "chests/nether_bridge").equals(id) ||
                new Identifier("minecraft", "chests/ruined_portal").equals(id) ||
                new Identifier("incendium", "reactor/treasure").equals(id) ||
                new Identifier("incendium", "pipeline/base/treasure").equals(id) ||
                new Identifier("incendium", "lab/treasure").equals(id)
                ) {

                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 15% of the time

                        .with(ItemEntry.builder(ModItems.H_NO_ESCAPE_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.H_FROM_OLYMPUS_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.H_LAMENT_OF_ORPHEUS_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.H_GOOD_RIDDANCE_MUSIC_DISC))
                        .with(ItemEntry.builder(ModItems.H_THE_UNSEEN_ONE_MUSIC_DISC))

                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
