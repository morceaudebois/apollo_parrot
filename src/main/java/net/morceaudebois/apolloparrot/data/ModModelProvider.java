package net.morceaudebois.apolloparrot.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.morceaudebois.apolloparrot.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) { super(output); }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.HARRY_POTTER_MUSIC_DISC, Models.GENERATED);

        itemModelGenerator.register(ModItems.HK_MANTIS_LORDS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HK_DUNG_DEFENDER_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HK_WHITE_PALACE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HK_GRIMM_TROUPE_MUSIC_DISC, Models.GENERATED);

        itemModelGenerator.register(ModItems.H_NO_ESCAPE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.H_FROM_OLYMPUS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.H_LAMENT_OF_ORPHEUS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.H_GOOD_RIDDANCE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.H_THE_UNSEEN_ONE_MUSIC_DISC, Models.GENERATED);

        itemModelGenerator.register(ModItems.SMASH_MELEE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMASH_BRAWL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMASH_4_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMASH_ULTIMATE_MUSIC_DISC, Models.GENERATED);
    }
}
