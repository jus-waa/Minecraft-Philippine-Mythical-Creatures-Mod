package net.gamedev.philmythmod.event;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.ModEntities;
import net.gamedev.philmythmod.entity.boss.BakunawaBoss;
import net.gamedev.philmythmod.entity.custom.AswangEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PhilippineMythMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.BAKUNAWA.get(), BakunawaBoss.createAttributes().build());
        event.put(ModEntities.ASWANG.get(), AswangEntity.createAttributes().build());
        event.put(ModEntities.MANANANGGAL.get(), AswangEntity.createAttributes().build());
        event.put(ModEntities.KAPRE.get(), AswangEntity.createAttributes().build());
        event.put(ModEntities.MANGKUKULAM.get(), AswangEntity.createAttributes().build());

    }

}
