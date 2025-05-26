package net.gamedev.philmythmod.entity.boss;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.BossEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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

public class SarimanokEntity extends Monster {
    private final ServerBossEvent bossEvent = (ServerBossEvent)(new ServerBossEvent(Component.literal("Sarimanok"), BossEvent.BossBarColor.RED, BossEvent.BossBarOverlay.NOTCHED_20).setDarkenScreen(true));
    public SarimanokEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;


    @Override
    public void tick() {
        super.tick();
        //activate animation
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
    //mob goals
    public void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 2.0f));
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 1.0D));
    }
    // attributes
    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 600.0D)
                .add(Attributes.FOLLOW_RANGE, 75.0D)
                .add(Attributes.MOVEMENT_SPEED, (double)0.4F)
                .add(Attributes.ARMOR, 2.0D)
                .add(Attributes.SPAWN_REINFORCEMENTS_CHANCE);
    }
    public boolean canSpawnSprintParticle() {
        return this.getDeltaMovement().horizontalDistanceSqr() > (double)2.5000003E-7F && this.random.nextInt(5) == 0;
    }

    // mob drops
    @Override
    protected void dropCustomDeathLoot(DamageSource pSource, int pLooting, boolean pRecentlyHit) {
        super.dropCustomDeathLoot(pSource, pLooting, pRecentlyHit);
        //loot
        if (this.random.nextFloat() < 0.2F + (pLooting * 0.1F)){
            this.spawnAtLocation(new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
        }

        //exp
        if (!this.level().isClientSide) {
            int xp = this.getExperienceReward();
            this.level().addFreshEntity(new ExperienceOrb(this.level(), this.getX(), this.getY(), this.getZ(), xp));
        }

        //give buff to player
        if (!this.level().isClientSide && pSource.getEntity() instanceof Player player) {
            int maxDuration = Integer.MAX_VALUE;
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, maxDuration, 1, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, maxDuration, 1, false, false));
        }
        this.level().playSound(null, this.blockPosition(), SoundEvents.PLAYER_LEVELUP, SoundSource.PLAYERS, 1.0F, 1.0F);
    }
    @Override
    protected void tickDeath() {
        ++this.deathTime;

        if (this.deathTime >= 30 && !this.level().isClientSide()) {
            this.remove(RemovalReason.KILLED);
            this.dropExperience(); //
        }
    }
    //exp
    @Override
    public int getExperienceReward() {
        super.getExperienceReward();
        return 500 + this.random.nextInt(600);
    }

    // Sound
    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.CHICKEN_AMBIENT;
    }
    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.CHICKEN_HURT;
    }
    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.CHICKEN_DEATH;
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

        // mob is moving and on the ground, spawn custom particles
        if (!this.level().isClientSide && this.isAlive() && this.onGround() && this.getDeltaMovement().horizontalDistanceSqr() > 0.01) {
            if (this.random.nextInt(4) == 0) { // how often it spawns
                ServerLevel level = (ServerLevel)this.level();

                double x = this.getX();
                double y = this.getY() + 0.5D;
                double z = this.getZ();

                level.sendParticles(ParticleTypes.END_ROD, x, y, z, 3, 0.2, 0.1, 0.2, 0.01);
                level.sendParticles(ParticleTypes.WITCH, x, y, z, 2, 0.2, 0.1, 0.2, 0.01);
                level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 2, 0.3, 0.2, 0.3, 0.01);
                level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 1, 0.2, 0.2, 0.2, 0.05);
                level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 1, 0.2, 0.1, 0.2, 0.01);
                level.sendParticles(ParticleTypes.FLAME, x, y, z, 2, 0.15, 0.05, 0.15, 0.01);
                level.sendParticles(ParticleTypes.GLOW, x, y, z, 2, 0.2, 0.1, 0.2, 0.005);
                level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 2, 0.2, 0.1, 0.2, 0.01);
                level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 2, 0.2, 0.1, 0.2, 0.02);
            }
        }
    }
}
