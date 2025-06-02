package net.gamedev.philmythmod.worldgen;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.ModEntities;
import net.gamedev.philmythmod.worldgen.dimension.ModDimensions;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> SPAWN_BAKUNAWA = registerKey("spawn_bakunawa");
    public static final ResourceKey<BiomeModifier> SPAWN_ASWANG = registerKey("spawn_aswang");
    public static final ResourceKey<BiomeModifier> SPAWN_MANANANGGAL = registerKey("spawn_manananggal");
    public static final ResourceKey<BiomeModifier> SPAWN_MANGKUKULAM = registerKey("spawn_mangkukulam");
    public static final ResourceKey<BiomeModifier> SPAWN_BABAYLAN = registerKey("spawn_babaylan");
    public static final ResourceKey<BiomeModifier> SPAWN_BERBEROKA = registerKey("spawn_berberoka");
    public static final ResourceKey<BiomeModifier> SPAWN_DIWATA = registerKey("spawn_diwata");
    public static final ResourceKey<BiomeModifier> SPAWN_KAPRE = registerKey("spawn_kapre");
    public static final ResourceKey<BiomeModifier> SPAWN_NUNO = registerKey("spawn_nuno");
    public static final ResourceKey<BiomeModifier> SPAWN_TIKBALANG = registerKey("spawn_tikbalang");
    public static final ResourceKey<BiomeModifier> SPAWN_SARIMANOK = registerKey("spawn_sarimanok");


    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var biomes = context.lookup(Registries.BIOME);

        context.register(SPAWN_BAKUNAWA, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.OCEAN)),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.BAKUNAWA.get(), 1, 1, 1))
        ));
        context.register(SPAWN_ASWANG, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS), biomes.getOrThrow(Biomes.FOREST)),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.ASWANG.get(), 15, 2, 4))));

        context.register(SPAWN_MANANANGGAL, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS), biomes.getOrThrow(Biomes.JUNGLE), biomes.getOrThrow(Biomes.PLAINS)),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.MANANANGGAL.get(), 15, 1, 2))));

        context.register(SPAWN_MANGKUKULAM, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SWAMP), biomes.getOrThrow(Biomes.JUNGLE)),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.MANGKUKULAM.get(), 10, 1, 2))));

        context.register(SPAWN_BABAYLAN, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.FOREST), biomes.getOrThrow(Biomes.BIRCH_FOREST)),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.BABAYLAN.get(), 10, 1, 1))));

        context.register(SPAWN_BERBEROKA, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SWAMP), biomes.getOrThrow(Biomes.MANGROVE_SWAMP)),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.BERBEROKA.get(), 4, 1, 1))));

        context.register(SPAWN_DIWATA, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.FOREST), biomes.getOrThrow(Biomes.BIRCH_FOREST)),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.DIWATA.get(), 10, 1, 2))));

        context.register(SPAWN_KAPRE, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.FOREST), biomes.getOrThrow(Biomes.JUNGLE)),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.KAPRE.get(), 10, 1, 3))));

        context.register(SPAWN_NUNO, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS), biomes.getOrThrow(Biomes.FOREST)),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.NUNO.get(), 15, 2, 4))));

        context.register(SPAWN_TIKBALANG, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS), biomes.getOrThrow(Biomes.FOREST), biomes.getOrThrow(Biomes.JUNGLE), biomes.getOrThrow(Biomes.STONY_PEAKS)),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.TIKBALANG.get(), 10, 1, 2))));

        context.register(SPAWN_SARIMANOK, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.FOREST)),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.SARIMANOK.get(), 5, 1, 1))));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(PhilippineMythMod.MOD_ID, name));
    }
}