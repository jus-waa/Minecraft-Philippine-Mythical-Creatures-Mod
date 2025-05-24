package net.gamedev.philmythmod.entity.boss;

import net.gamedev.philmythmod.entity.ModEntities;
//import net.gamedev.philmythmod.entity.ai.TikbalangAttackGoal;
import net.gamedev.philmythmod.entity.ai.TikbalangAttackGoal;
import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.level.LightLayer;

import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.At;

public class TikbalangEntity extends Monster {
    private static final EntityDataAccessor<Boolean> ATTACKING =
            SynchedEntityData.defineId(TikbalangEntity.class, EntityDataSerializers.BOOLEAN);

    public TikbalangEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState deathAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    public final AnimationState attackAnimationState = new AnimationState();
    public int attackAnimationTimeout = 0;

    @Override
    public void tick() {
        super.tick();
        //activate animation
        if (this.level().isClientSide()) {
            setupAnimationStates();
        }
        //active mob burn during daytime
        if (!this.level().isClientSide() && this.isAlive()) {
            boolean isDay = this.level().isDay();
            BlockPos pos = this.blockPosition();
            boolean canSeeSky = this.level().canSeeSky(pos);
            float skyBrightness = this.level().getBrightness(LightLayer.SKY, pos);

            if (isDay && canSeeSky && !this.isInWaterRainOrBubble()) {
                // mimic vanilla random chance to catch fire
                float chance = (skyBrightness - 0.4F) * 2.0F;
                if (skyBrightness > 0.5F && this.random.nextFloat() * 30.0F < chance) {
                    this.setSecondsOnFire(8);
                }
            }
        }
    }
    //setting up animations (idle)
    private void setupAnimationStates() {
        // Idle animation
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
        // attack animation
        if (this.isAttacking() && attackAnimationTimeout <= 0) {
            attackAnimationTimeout = 84; // length in ticks of animation, depends on animation
            attackAnimationState.start(this.tickCount);
        } else {
            --this.attackAnimationTimeout;
        }

        //if no longer attacking
        if (!this.isAttacking()) {
            attackAnimationState.stop();
        }
    }
    //die
    @Override
    public void die(DamageSource cause) {
        super.die(cause);
        if (this.level().isClientSide()) {
            this.deathAnimationState.start(this.tickCount);
        }
    }
    //walk
    @Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        if (this.getPose() == Pose.STANDING) {
            f = Math.min(pPartialTick * 6f ,1f);
        } else {
            f = 0f;
        }

        this.walkAnimation.update(f, 0.2f);
    }

    //attacking
    public void setAttacking(boolean attacking) {
        this.entityData.set(ATTACKING, attacking);
    }
    public boolean isAttacking() {
        return this.entityData.get(ATTACKING);
    }
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ATTACKING, false);
    }

    //mob goals
    public void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new TikbalangAttackGoal(this, 1.0D, true));

        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 1.0D));

        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(ZombifiedPiglin.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, AbstractVillager.class, true));

    }
    // attributes
    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 50.0D)
                .add(Attributes.FOLLOW_RANGE, 120.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.5D)
                .add(Attributes.ATTACK_DAMAGE, 15.0D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 0.6D)
                .add(Attributes.ARMOR, 5.0D);
    }
    public boolean canSpawnSprintParticle() {
        return this.getDeltaMovement().horizontalDistanceSqr() > (double)2.5000003E-7F && this.random.nextInt(5) == 0;
    }
    // mob sounds
    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ZOMBIE_HORSE_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.ZOMBIE_HORSE_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.HORSE_DEATH;
    }
}
