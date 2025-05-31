package net.gamedev.philmythmod.worldgen.dimension;

import com.mojang.datafixers.util.Pair;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;

import java.util.List;
import java.util.OptionalLong;

public class ModDimensions {
    public static final ResourceKey<LevelStem> CELESTIAL_OCEAN_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            new ResourceLocation(PhilippineMythMod.MOD_ID, "celestial_ocean"));
    public static final ResourceKey<Level> CELESTIAL_OCEAN_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(PhilippineMythMod.MOD_ID, "celestial_ocean"));
    public static final ResourceKey<DimensionType> CELESTIAL_OCEAN_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            new ResourceLocation(PhilippineMythMod.MOD_ID, "celestial_ocean_type"));

    public static void bootstrapType(BootstapContext<DimensionType> context) {
        context.register(CELESTIAL_OCEAN_TYPE, new DimensionType(
                OptionalLong.of(18000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                false, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.OVERWORLD_EFFECTS, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, ConstantInt.of(0), 0)));
    }

    public static void bootstrapStem(BootstapContext<LevelStem> context) {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

        LevelStem stem = new LevelStem(
                dimTypes.getOrThrow(CELESTIAL_OCEAN_TYPE),
                new NoiseBasedChunkGenerator(
                        new FixedBiomeSource(biomeRegistry.getOrThrow(Biomes.COLD_OCEAN)),
                        noiseGenSettings.getOrThrow(NoiseGeneratorSettings.LARGE_BIOMES)
                )
        );

        context.register(CELESTIAL_OCEAN_KEY, stem);
    }
}