package net.gamedev.philmythmod.item;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.List;

public class TotemOfConfusion extends Item {

    public TotemOfConfusion(Properties properties) {
        super(properties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.TOOT_HORN; // You can use UseAnim.BOW or NONE if you prefer
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 32; // Duration of "use" before it triggers
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        player.startUsingItem(hand);
        return InteractionResultHolder.consume(player.getItemInHand(hand));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        if (!level.isClientSide && entity instanceof Player player) {
            // Get nearby mobs and apply confusion effects
            List<Mob> mobs = level.getEntitiesOfClass(Mob.class, player.getBoundingBox().inflate(6));
            for (Mob mob : mobs) {
                mob.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 1));
                mob.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 0));
            }

            // Play totem use sound
            BlockPos pos = player.blockPosition();
            level.playSound(null, pos, SoundEvents.TOTEM_USE, SoundSource.PLAYERS, 1.0F, 1.0F);
            // Spawn totem particles around the player
            ((ServerLevel) level).sendParticles(ParticleTypes.TOTEM_OF_UNDYING,
                    player.getX(), player.getY() + 1.0, player.getZ(),
                    30, // count
                    0.5, 1.0, 0.5, // offset X/Y/Z
                    0.1); // speed

            // Consume item if not in Creative
            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }
        }

        return stack;
    }
}
