package net.morceaudebois.apolloparrot.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FilledMapItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.morceaudebois.apolloparrot.ApolloParrot;
import net.morceaudebois.apolloparrot.item.ModItems;

public class ModCustomTrades {
    public static void registerCustomTrades(ServerWorld world) {


        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 2),
                            new ItemStack(ModItems.HARRY_POTTER_MUSIC_DISC, 1),
                            1, 5, 0.05f
                    ));
                }
        );

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.DIAMOND, 2),
                        FilledMapItem.createMap("i don't know", 12, 12, 2, true, true)
                        6, 5, 0.05f
                    ));
                }
        );
    }
}
