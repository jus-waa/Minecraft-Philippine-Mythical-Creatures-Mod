package net.gamedev.philmythmod.entity.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public class MangkukulamEntity extends Raider implements RangedAttackMob {

    public MangkukulamEntity(EntityType<? extends Raider> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState deathAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide()) {
            setupAnimationStates();
        }
    }

    private void setupAnimationStates() {
        // Idle animation
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }

        // Death animation
        if (this.getMaxHealth() <= 0) {
            this.deathAnimationState.startIfStopped(this.tickCount);
        } else {
            this.idleAnimationState.stop();
        }
    }

    @Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        if (this.getPose() == Pose.STANDING) {
            f = Math.min(pPartialTick * 6F, 1f);
        } else {
            f = 0f;
        }

        this.walkAnimation.update(f, 0.2f);
    }
    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 30.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    @Override
    public void performRangedAttack(LivingEntity pTarget, float pDistanceFactor) {
        if (this.isDrinking()) {
            Vec3 vec3 = pTarget.getDeltaMovement();
            double d0 = pTarget.getX() + vec3.x - this.getX();
            double d1 = pTarget.getEyeY() - (double)1.1F - this.getY();
            double d2 = pTarget.getZ() + vec3.z - this.getZ();
            double d3 = Math.sqrt(d0 * d0 + d2 * d2);
            Potion potion = Potions.HARMING;
            if (pTarget instanceof Raider) {
                if (pTarget.getHealth() <= 4.0F) {
                    potion = Potions.INVISIBILITY;
                } else {
                    potion = Potions.LONG_REGENERATION;
                }

                this.setTarget((LivingEntity)null);
            } else if (d3 >= 8.0D && !pTarget.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
                potion = Potions.STRONG_SLOWNESS;
            } else if (pTarget.getHealth() >= 8.0F) {
                potion = Potions.STRONG_HARMING;
            } else if (d3 <= 3.0D && !pTarget.hasEffect(MobEffects.WEAKNESS) && this.random.nextFloat() < 0.25F) {
                potion = Potions.WEAKNESS;
            }

            ThrownPotion thrownpotion = new ThrownPotion(this.level(), this);
            thrownpotion.setItem(PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), potion));
            thrownpotion.setXRot(thrownpotion.getXRot() - -20.0F);
            thrownpotion.shoot(d0, d1 + d3 * 0.2D, d2, 0.75F, 8.0F);
            if (!this.isSilent()) {
                this.level().playSound((Player)null, this.getX(), this.getY(), this.getZ(), SoundEvents.WITCH_THROW, this.getSoundSource(), 1.0F, 0.8F + this.random.nextFloat() * 0.4F);
            }

            this.level().addFreshEntity(thrownpotion);
        }
    }

    private boolean isDrinking() {
        return false;
    }

    protected float getStandingEyeHeight(Pose pPose, EntityDimensions pSize) {
        return 1.62F;
    }

    @Override
    public void applyRaidBuffs(int pWave, boolean pUnusedFalse) {

    }

    @Override
    public SoundEvent getCelebrateSound() {
        return null;
    }
    // Sound
    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.WITCH_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.WITCH_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.WITCH_DEATH;
    }
}
