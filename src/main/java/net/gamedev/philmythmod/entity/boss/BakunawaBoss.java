package net.gamedev.philmythmod.entity.boss;

import net.gamedev.philmythmod.entity.ai.BakunawaAttackGoal;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.BossEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import java.util.function.Predicate;


public class BakunawaBoss extends Monster {
    private final ServerBossEvent bossEvent = (ServerBossEvent)(new ServerBossEvent(Component.literal("Bakunawa"), BossEvent.BossBarColor.BLUE, BossEvent.BossBarOverlay.NOTCHED_20)).setDarkenScreen(true);
    private static final EntityDataAccessor<Boolean> ATTACKING =
            SynchedEntityData.defineId(BakunawaBoss.class, EntityDataSerializers.BOOLEAN);
    private static final Predicate<LivingEntity> LIVING_ENTITY_SELECTOR = (otherEntity) -> {
        return otherEntity.getMobType() != MobType.UNDEAD && otherEntity.attackable();
    };
    public BakunawaBoss(EntityType<? extends Monster> pEntityType, Level pLevel) {
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
        if (this.level().isClientSide()) {
            setupAnimationStates();
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
    @Override
    protected void registerGoals() {
        this.targetSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.goalSelector.addGoal(1, new BakunawaAttackGoal(this, 1.0D, true));
        this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setAlertOthers(ZombifiedPiglin.class));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 10.0F));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
    }
    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 500.0D)
                .add(Attributes.FOLLOW_RANGE, 100.0D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1.0D)
                .add(Attributes.ATTACK_KNOCKBACK, 3.0D)
                .add(Attributes.ARMOR, 4.0D)
                .add(Attributes.ATTACK_DAMAGE, 30.0D);
    }
    //bypass drowning
    @Override
    public boolean isInvulnerableTo(DamageSource pDamageSource) {
        if (pDamageSource == this.level().damageSources().drown() || pDamageSource == this.level().damageSources().lightningBolt()) {
            return true;
        }
        return super.isInvulnerableTo(pDamageSource);
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

    @Override
    public void travel(Vec3 travelVector) {
        // Prevent all movement
        if (this.isEffectiveAi()) {
            return;
        }
        super.travel(Vec3.ZERO);
    }

    @Override
    public float getWalkTargetValue(BlockPos pos, LevelReader world) {
        return 0.0F; // No pathfinding preference
    }

}
