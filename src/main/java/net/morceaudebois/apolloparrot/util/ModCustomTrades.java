package net.morceaudebois.apolloparrot.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.morceaudebois.apolloparrot.item.ModItems;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;

public class ModCustomTrades {
    public static void registerCustomTrades() {

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 2),
                            createWrittenBook(0),
                            1, 5, 0.05f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 2),
                            createWrittenBook(1),
                            1, 5, 0.05f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 2),
                            createWrittenBook(2),
                            1, 5, 0.05f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 2),
                            createWrittenBook(3),
                            1, 5, 0.05f
                    ));
                }
        );

        TradeOfferHelper.registerWanderingTraderOffers(2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.DIAMOND, 2),
                    new ItemStack(ModItems.HARRY_POTTER_MUSIC_DISC, 1),
                    1, 5, 0.05f
            ));
        });
    }

    // Method to generate a written book ItemStack
    private static ItemStack createWrittenBook(int which) {
        ItemStack writtenBook = new ItemStack(Items.WRITTEN_BOOK, 1);
        NbtCompound bookData = new NbtCompound();
        NbtList pages = new NbtList();

        // Switch to switch between different random values
        switch (which) {
            case 0:
                bookData.putString("title", "Spider Invasion · 1/4");
                pages.add(NbtString.of("{'text':'-6496 -2768'}"));
                break;
            case 1:
                bookData.putString("title", "Diamonds! · 2/4");
                pages.add(NbtString.of("{'text':'4836 183'}"));
                break;
            case 2:
                bookData.putString("title", "Nether Overflow · 3/4");
                pages.add(NbtString.of("{'text':'4304 4141'}"));
                break;
            case 3:
                bookData.putString("title", "LV-426 · 4/4");
                pages.add(NbtString.of("{'text':'-5000 2248'}"));
                break;
            default:
                break;
        }

        bookData.putString("author", "");
        bookData.put("pages", pages);

        writtenBook.setNbt(bookData);

        return writtenBook;
    }
}
