package net.gamedev.philmythmod.entity.boss;

import net.gamedev.philmythmod.entity.ai.MangkukulamAttackGoal;
import net.gamedev.philmythmod.item.ModItems;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
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

public class MangkukulamEntity extends PathfinderMob implements RangedAttackMob {
    private static final EntityDataAccessor<Boolean> ATTACKING =
            SynchedEntityData.defineId(MangkukulamEntity.class, EntityDataSerializers.BOOLEAN);

    public MangkukulamEntity(EntityType<? extends PathfinderMob> pEntityType, Level pLevel) {
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
    @Override
    public void die(DamageSource cause) {
        super.die(cause);
        if (this.level().isClientSide()) {
            this.deathAnimationState.start(this.tickCount);
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
    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 30.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D);
    }
    public void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.0D, 20, 10.0F));
        this.goalSelector.addGoal(2, new MangkukulamAttackGoal(this, 1.0D, true));
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(ZombifiedPiglin.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }
    @Override
    public void performRangedAttack(LivingEntity pTarget, float pDistanceFactor) {
        Vec3 vec3 = pTarget.getDeltaMovement();
        double d0 = pTarget.getX() + vec3.x - this.getX();
        double d1 = pTarget.getEyeY() - 1.1F - this.getY();
        double d2 = pTarget.getZ() + vec3.z - this.getZ();
        double d3 = Math.sqrt(d0 * d0 + d2 * d2);

        Potion potion = Potions.HARMING;

        if (pTarget instanceof Raider) {
            if (pTarget.getHealth() <= 4.0F) {
                potion = Potions.INVISIBILITY;
            } else {
                potion = Potions.LONG_REGENERATION;
            }
            this.setTarget(null);
        } else if (d3 >= 8.0D && !pTarget.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
            potion = Potions.STRONG_SLOWNESS;
        } else if (pTarget.getHealth() >= 8.0F) {
            potion = Potions.STRONG_HARMING;
        } else if (d3 <= 3.0D && !pTarget.hasEffect(MobEffects.WEAKNESS) && this.random.nextFloat() < 0.25F) {
            potion = Potions.WEAKNESS;
        }

        ThrownPotion potionEntity = new ThrownPotion(this.level(), this);
        potionEntity.setItem(PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), potion));
        potionEntity.setXRot(potionEntity.getXRot() - -20.0F);
        potionEntity.shoot(d0, d1 + d3 * 0.2D, d2, 0.75F, 8.0F);

        if (!this.isSilent()) {
            this.level().playSound(null, this.getX(), this.getY(), this.getZ(),
                    SoundEvents.WITCH_THROW, this.getSoundSource(), 1.0F, 0.8F + this.random.nextFloat() * 0.4F);
        }

        this.level().addFreshEntity(potionEntity);
    }



    protected float getStandingEyeHeight(Pose pPose, EntityDimensions pSize) {
        return 1.62F;
    }


    // mob drops
    @Override
    protected void dropCustomDeathLoot(DamageSource pSource, int pLooting, boolean pRecentlyHit) {
        super.dropCustomDeathLoot(pSource, pLooting, pRecentlyHit);

        if (this.random.nextFloat() < 0.2F + (pLooting * 0.1F)){
            ItemStack potion = new ItemStack(Items.POTION);
            PotionUtils.setPotion(potion, Potions.HEALING); // or Potions.REGENERATION, etc.
            this.spawnAtLocation(potion);        }
        if (this.random.nextFloat() < 0.5F + (pLooting * 0.1F)){ // .5f is 50%, .1f is 10%
            ItemStack potion = new ItemStack(Items.POTION);
            PotionUtils.setPotion(potion, Potions.EMPTY);
            this.spawnAtLocation(potion);
        }
        if (!this.level().isClientSide) {
            int xp = this.getExperienceReward();
            this.level().addFreshEntity(new ExperienceOrb(this.level(), this.getX(), this.getY(), this.getZ(), xp));
        }
    }
    @Override
    protected void tickDeath() {
        ++this.deathTime;

        if (this.deathTime >= 60 && !this.level().isClientSide()) {
            this.remove(RemovalReason.KILLED);
            this.dropExperience(); // Or whatever you want to do post-death
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
