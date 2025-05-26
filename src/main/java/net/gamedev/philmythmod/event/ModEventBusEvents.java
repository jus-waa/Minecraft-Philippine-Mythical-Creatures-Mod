package net.gamedev.philmythmod.event;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.ModEntities;
import net.gamedev.philmythmod.entity.boss.*;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PhilippineMythMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.BAKUNAWA.get(), BakunawaBoss.createAttributes().build());
        event.put(ModEntities.ASWANG.get(), AswangEntity.createAttributes().build());
        event.put(ModEntities.MANANANGGAL.get(), ManananggalEntity.createAttributes().build());
        event.put(ModEntities.KAPRE.get(), KapreEntity.createAttributes().build());
        event.put(ModEntities.MANGKUKULAM.get(), MangkukulamEntity.createAttributes().build());
        event.put(ModEntities.BABAYLAN.get(), BabaylanEntity.createAttributes().build());
        event.put(ModEntities.BERBEROKA.get(), BerberokaEntity.createAttributes().build());
        event.put(ModEntities.DIWATA.get(), DiwataEntity.createAttributes().build());
        event.put(ModEntities.NUNO.get(), NunoEntity.createAttributes().build());
        event.put(ModEntities.TIKBALANG.get(), TikbalangEntity.createAttributes().build());
    }

}
