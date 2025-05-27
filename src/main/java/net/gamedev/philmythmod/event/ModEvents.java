package net.gamedev.philmythmod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.block.ModBlocks;
import net.gamedev.philmythmod.entity.villager.ModVillagers;
import net.gamedev.philmythmod.item.ModItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = PhilippineMythMod.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == ModVillagers.ALBULARYO_VILLAGER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD_BLOCK, 1),
                    new ItemStack(ModItems.CIGARETTE.get(), 1),
                    16, 8, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD_BLOCK, 2),
                    new ItemStack(ModItems.CURSED_FANG.get(), 1),
                    5, 12, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD_BLOCK, 4),
                    new ItemStack(ModItems.WINGED_HEART.get(), 1),
                    5, 12, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD_BLOCK, 6),
                    new ItemStack(ModItems.ANITO_STONE.get(), 1),
                    5, 12, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD_BLOCK, 8),
                    new ItemStack(ModItems.FLOODGEM_HEART.get(), 1),
                    5, 12, 0.02f));
        }
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;

        if (!player.level().isClientSide && event.phase == TickEvent.Phase.END) {
            if (player.getPersistentData().contains("anito_flight_timer")) {
                int time = player.getPersistentData().getInt("anito_flight_timer");
                time--;

                if (time <= 0) {
                    // Disable flight if not in Creative
                    if (!player.isCreative()) {
                        player.getAbilities().mayfly = false;
                        player.getAbilities().flying = false;
                        player.onUpdateAbilities();
                    }

                    player.getPersistentData().remove("anito_flight_timer");
                    player.removeEffect(MobEffects.HERO_OF_THE_VILLAGE);
                } else {
                    player.getPersistentData().putInt("anito_flight_timer", time);
                }
            }
        }
    }
}
