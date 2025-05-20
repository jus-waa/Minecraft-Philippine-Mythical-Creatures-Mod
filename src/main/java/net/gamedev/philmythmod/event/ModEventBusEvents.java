package net.gamedev.philmythmod.event;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.ModEntities;
import net.gamedev.philmythmod.entity.boss.BakunawaBoss;
import net.gamedev.philmythmod.entity.boss.AswangEntity;
import net.gamedev.philmythmod.entity.boss.KapreEntity;
import net.gamedev.philmythmod.entity.boss.ManananggalEntity;
import net.gamedev.philmythmod.entity.boss.MangkukulamEntity;
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

    }

}
