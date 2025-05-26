package net.gamedev.philmythmod.event;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.client.*;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PhilippineMythMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.BAKUNAWA_LAYER, Bakunawa::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.ASWANG_LAYER, AswangModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.MANANANGGAL_LAYER, ManananggalModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.KAPRE_LAYER, KapreModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.MANGKUKULAM_LAYER, MangkukulamModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BABAYLAN_LAYER, BabaylanModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BERBEROKA_LAYER, BerberokaModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.DIWATA_LAYER, DiwataModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NUNO_LAYER, NunoModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TIKBALANG_LAYER, TikbalangModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SARIMANOK_LAYER, SarimanokModel::createBodyLayer);
    }
}
