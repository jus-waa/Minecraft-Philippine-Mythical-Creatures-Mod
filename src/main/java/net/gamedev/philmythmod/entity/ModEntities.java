package net.gamedev.philmythmod.entity;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.boss.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PhilippineMythMod.MOD_ID);

    public static final RegistryObject<EntityType<BakunawaBoss>> BAKUNAWA =
            ENTITY_TYPES.register("bakunawa", () -> EntityType.Builder.of(BakunawaBoss::new, MobCategory.WATER_CREATURE)
                    .sized(25.0f, 25.0f).build("bakunawa"));
    public static final RegistryObject<EntityType<AswangEntity>> ASWANG =
            ENTITY_TYPES.register("aswang", () -> EntityType.Builder.of(AswangEntity::new, MobCategory.MONSTER)
                    .sized(0.8f, 1.7f).build("aswang"));
    public static final RegistryObject<EntityType<ManananggalEntity>> MANANANGGAL =
            ENTITY_TYPES.register("manananggal", () -> EntityType.Builder.of(ManananggalEntity::new, MobCategory.MONSTER)
                    .sized(2f, 3.6f).build("manananggal"));
    public static final RegistryObject<EntityType<KapreEntity>> KAPRE =
            ENTITY_TYPES.register("kapre", () -> EntityType.Builder.of(KapreEntity::new, MobCategory.MONSTER)
                    .sized(2.5f, 5.4f).build("kapre"));
    public static final RegistryObject<EntityType<MangkukulamEntity>> MANGKUKULAM =
            ENTITY_TYPES.register("mangkukulam", () -> EntityType.Builder.of(MangkukulamEntity::new, MobCategory.MONSTER)
                    .sized(1.0f, 2.0f).build("mangkukulam"));
    public static final RegistryObject<EntityType<BabaylanEntity>> BABAYLAN =
            ENTITY_TYPES.register("babaylan", () -> EntityType.Builder.of(BabaylanEntity::new, MobCategory.MONSTER)
                    .sized(1.0f, 2.5f).build("babaylan"));
    public static final RegistryObject<EntityType<BerberokaEntity>> BERBEROKA =
            ENTITY_TYPES.register("berberoka", () -> EntityType.Builder.of(BerberokaEntity::new, MobCategory.MONSTER)
                    .sized(2.0f, 2.8f).build("berberoka"));
    public static final RegistryObject<EntityType<DiwataEntity>> DIWATA =
            ENTITY_TYPES.register("diwata", () -> EntityType.Builder.of(DiwataEntity::new, MobCategory.MONSTER)
                    .sized(1.0f, 2.5f).build("diwata"));
    public static final RegistryObject<EntityType<NunoEntity>> NUNO =
            ENTITY_TYPES.register("nuno", () -> EntityType.Builder.of(NunoEntity::new, MobCategory.MONSTER)
                    .sized(0.5f, 1.5f).build("nuno"));
    public static final RegistryObject<EntityType<TikbalangEntity>> TIKBALANG =
            ENTITY_TYPES.register("tikbalang", () -> EntityType.Builder.of(TikbalangEntity::new, MobCategory.MONSTER)
                    .sized(1.0f, 2.8f).build("tikbalang"));
    public static final RegistryObject<EntityType<SarimanokEntity>> SARIMANOK =
            ENTITY_TYPES.register("sarimanok", () -> EntityType.Builder.of(SarimanokEntity::new, MobCategory.MONSTER)
                    .sized(0.5f, 0.5f).build("sarimanok"));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
