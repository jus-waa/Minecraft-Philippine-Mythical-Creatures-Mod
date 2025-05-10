package net.gamedev.philmythmod.event;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.client.Bakunawa;
import net.gamedev.philmythmod.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PhilippineMythMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.BAKUNAWA_LAYER, Bakunawa::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.ASWANG_LAYER, Bakunawa::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.MANANANGGAL_LAYER, Bakunawa::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.KAPRE_LAYER, Bakunawa::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BAKUNAWA_LAYER, Bakunawa::createBodyLayer);
    }
}
