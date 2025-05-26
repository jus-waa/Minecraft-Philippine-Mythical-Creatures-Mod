package net.gamedev.philmythmod.event;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ModEvents {

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
