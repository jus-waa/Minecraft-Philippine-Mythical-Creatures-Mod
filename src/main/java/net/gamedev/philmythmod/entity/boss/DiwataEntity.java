package net.gamedev.philmythmod.entity.boss;

import net.gamedev.philmythmod.entity.ModEntities;

import net.gamedev.philmythmod.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Pose;

import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class DiwataEntity extends Monster {
    public DiwataEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState deathAnimationState = new AnimationState();
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

    //mob goals
    public void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));

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
                .add(Attributes.MAX_HEALTH, 35.0D)
                .add(Attributes.FOLLOW_RANGE, 75.0D)
                .add(Attributes.MOVEMENT_SPEED, (double)0.5F)
                .add(Attributes.ATTACK_DAMAGE, 15.0D)
                .add(Attributes.ARMOR, 2.0D)
                .add(Attributes.SPAWN_REINFORCEMENTS_CHANCE);
    }
    public boolean canSpawnSprintParticle() {
        return this.getDeltaMovement().horizontalDistanceSqr() > (double)2.5000003E-7F && this.random.nextInt(5) == 0;
    }
    @Override
    protected void dropCustomDeathLoot(DamageSource pSource, int pLooting, boolean pRecentlyHit) {
        super.dropCustomDeathLoot(pSource, pLooting, pRecentlyHit);

        if (this.random.nextFloat() < 0.3F + (pLooting * 0.1F)){
            this.spawnAtLocation(new ItemStack(ModItems.FLOODGEM_HEART.get()));
        }
        if (!this.level().isClientSide) {
            int xp = this.getExperienceReward();
            this.level().addFreshEntity(new ExperienceOrb(this.level(), this.getX(), this.getY(), this.getZ(), xp));
        }
    }
    //exp
    @Override
    public int getExperienceReward() {
        super.getExperienceReward();
        return 5 + this.random.nextInt(6);
    }

    @Override
    public boolean shouldDropExperience() {
        return true;
    }
    // mob sounds
    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.BEACON_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.AXOLOTL_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.AXOLOTL_HURT;
    }
}
