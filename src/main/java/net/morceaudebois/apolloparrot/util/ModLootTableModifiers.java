package net.morceaudebois.apolloparrot.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
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

    public static void modifyLootTables() {
        LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {
            if(SUSPICIOUS_SAND_ID.equals(id)) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(ModItems.THYLACINE_SKULL).build());

                LootPool.Builder pool = LootPool.builder().with(entries);
                return LootTable.builder().pool(pool).build();
            }

            return null;
        });
    }
}
