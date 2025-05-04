package net.gamedev.philmythmod.entity.boss;

import net.gamedev.philmythmod.entity.ai.BakunawaSwimGoal;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.BossEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.world.phys.AABB;
import java.util.function.Predicate;

public class BakunawaBoss extends Mob implements Enemy {
    private final ServerBossEvent bossEvent = (ServerBossEvent)(new ServerBossEvent(Component.literal("Bakunawa"), BossEvent.BossBarColor.BLUE, BossEvent.BossBarOverlay.NOTCHED_20)).setDarkenScreen(true);
    private static final Predicate<LivingEntity> LIVING_ENTITY_SELECTOR = (otherEntity) -> {
        return otherEntity.getMobType() != MobType.UNDEAD && otherEntity.attackable();
    };
    public BakunawaBoss(EntityType<? extends Mob> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState swimAnimationState = new AnimationState();
    public final AnimationState deathAnimationState = new AnimationState();

    private int idleAnimationTimeout = 0;

    @Override
    public void tick() {
        super.tick();

        if (this.isInWater()) {
            this.setPos(this.getX(), this.getY() + 0.05, this.getZ()); // small upward motion
        }

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

        // Swim animation
        if (this.isInWater() && this.getDeltaMovement().lengthSqr() > 0.01) {
            this.swimAnimationState.startIfStopped(this.tickCount);
        } else {
            this.swimAnimationState.stop();
        }

        // Death animation
        if (this.getMaxHealth() <= 0) {
            this.deathAnimationState.startIfStopped(this.tickCount);
        } else {
            this.swimAnimationState.stop();
        }
    }

    @Override
    public void updateSwimming() {
        super.updateSwimming();
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 10.0F));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(1, new BakunawaSwimGoal(this, 0.5D));
        this.targetSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }
    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 500.0D)
                .add(Attributes.FOLLOW_RANGE, 100.0D)
                .add(Attributes.MOVEMENT_SPEED,1.0D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1.0D)
                .add(Attributes.ATTACK_KNOCKBACK, 3.0D)
                .add(Attributes.ARMOR, 4.0D)
                .add(Attributes.ATTACK_DAMAGE, 30.0D);
    }
    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.6F; // or whatever proportion fits your model
    }

    //bypass drowning
    @Override
    public boolean isInvulnerableTo(DamageSource pDamageSource) {
        if (pDamageSource == this.level().damageSources().drown() || pDamageSource == this.level().damageSources().lightningBolt()) {
            return true;
        }
        return super.isInvulnerableTo(pDamageSource);
    }
    @Override
    public void travel(Vec3 travelVector) {
        if (this.isInWater()) {
            this.moveRelative(0.05F, travelVector); // smoother motion control
            this.move(MoverType.SELF, this.getDeltaMovement());
            this.setDeltaMovement(this.getDeltaMovement().scale(0.9D)); // water drag
        } else {
            super.travel(travelVector);
        }
    }
    // Sound

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENDER_DRAGON_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.ENDER_DRAGON_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.WITHER_DEATH;
    }

    // Boss Bar 3 methods
    @Override
    public void startSeenByPlayer(ServerPlayer pServerPlayer) {
        super.startSeenByPlayer(pServerPlayer);
        this.bossEvent.addPlayer(pServerPlayer);
    }

    @Override
    public void stopSeenByPlayer(ServerPlayer pServerPlayer) {
        super.stopSeenByPlayer(pServerPlayer);
        this.bossEvent.removePlayer(pServerPlayer);
    }

    @Override
    public void aiStep() {
        super.aiStep();
        this.bossEvent.setProgress(this.getHealth() / this.getMaxHealth());
    }
}
