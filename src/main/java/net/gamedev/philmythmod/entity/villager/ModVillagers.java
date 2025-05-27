package net.gamedev.philmythmod.entity.villager;

import com.google.common.collect.ImmutableSet;
import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers {
        public static final DeferredRegister<PoiType> POI_TYPES =
                DeferredRegister.create(ForgeRegistries.POI_TYPES, PhilippineMythMod.MOD_ID);
        public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
                DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, PhilippineMythMod.MOD_ID);

        public static final RegistryObject<PoiType> INCENSE_TABLE_POI = POI_TYPES.register("incense_table_poi",
                () -> new PoiType(ImmutableSet.copyOf(ModBlocks.INCENSE_TABLE_BLOCK.get().getStateDefinition().getPossibleStates()),
                        1, 1));

        public static final RegistryObject<VillagerProfession> ALBULARYO_VILLAGER =
                VILLAGER_PROFESSIONS.register("albularyo_villager", () -> new VillagerProfession("albularyo_villager",
                        holder -> holder.get() == INCENSE_TABLE_POI.get(), holder ->  holder.get() == INCENSE_TABLE_POI.get(),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_LIBRARIAN));

        public static void register(IEventBus eventBus) {
                POI_TYPES.register(eventBus);
                VILLAGER_PROFESSIONS.register(eventBus);
        }


}
