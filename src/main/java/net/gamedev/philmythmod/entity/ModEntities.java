package net.gamedev.philmythmod.entity;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.boss.BakunawaBoss;
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
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
