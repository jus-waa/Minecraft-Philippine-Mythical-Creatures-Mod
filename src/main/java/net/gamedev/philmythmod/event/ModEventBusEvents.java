package net.gamedev.philmythmod.event;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.ModEntities;
import net.gamedev.philmythmod.entity.boss.*;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
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
        event.put(ModEntities.SARIMANOK.get(), SarimanokEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(ModEntities.BAKUNAWA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                BakunawaBoss::canSpawn, SpawnPlacementRegisterEvent.Operation.OR);
        event.register(ModEntities.ASWANG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.OR);
        event.register(ModEntities.MANANANGGAL.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.OR);
        event.register(ModEntities.KAPRE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.OR);
        event.register(ModEntities.MANGKUKULAM.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.OR);
        event.register(ModEntities.BABAYLAN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.OR);
        event.register(ModEntities.BERBEROKA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.OR);
        event.register(ModEntities.DIWATA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.OR);
        event.register(ModEntities.NUNO.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.OR);
        event.register(ModEntities.TIKBALANG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.OR);
        event.register(ModEntities.SARIMANOK.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.OR);
    }
}
