package net.gamedev.philmythmod.entity.boss;

//import net.gamedev.philmythmod.entity.ai.BerberokaAttackGoal;
import net.gamedev.philmythmod.entity.ai.BerberokaAttackGoal;
import net.gamedev.philmythmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
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
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.Nullable;
import java.util.function.Predicate;


public class BerberokaEntity extends Monster {
    private final ServerBossEvent bossEvent = (ServerBossEvent)(new ServerBossEvent(Component.literal("Berberoka"), BossEvent.BossBarColor.GREEN, BossEvent.BossBarOverlay.NOTCHED_10)).setDarkenScreen(true);
    private static final EntityDataAccessor<Boolean> ATTACKING =
            SynchedEntityData.defineId(BerberokaEntity.class, EntityDataSerializers.BOOLEAN);
    private static final Predicate<LivingEntity> LIVING_ENTITY_SELECTOR = (otherEntity) -> {
        return otherEntity.getMobType() != MobType.UNDEAD && otherEntity.attackable();
    };
    public BerberokaEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
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
    public static boolean canSpawn(EntityType<BerberokaEntity> type, LevelAccessor level, MobSpawnType reason, BlockPos pos, RandomSource random) {
        int radius = 2048;
        AABB checkArea = new AABB(pos).inflate(radius);
        boolean alreadyExists = !level.getEntitiesOfClass(BerberokaEntity.class, checkArea).isEmpty();
        if (pos.getY() < level.getSeaLevel()) return false;

        return !alreadyExists && Mob.checkMobSpawnRules(type, level, reason, pos, random);
    }
    @Override
    protected void registerGoals() {
        this.targetSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new BerberokaAttackGoal(this, 1.0D, true));

        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 1.0D));

        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(ZombifiedPiglin.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }
    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 300.0D)
                .add(Attributes.FOLLOW_RANGE, 500.0D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 5.0D)
                .add(Attributes.ATTACK_KNOCKBACK, 20.0D)
                .add(Attributes.ARMOR, 8.0D)
                .add(Attributes.ATTACK_DAMAGE, 20.0D);
    }
    @Override
    protected void dropCustomDeathLoot(DamageSource pSource, int pLooting, boolean pRecentlyHit) {
        super.dropCustomDeathLoot(pSource, pLooting, pRecentlyHit);
        //loot
        if (this.random.nextFloat() < 0.25F + (pLooting * 0.1F)){
            int diamondCount = 3 + this.random.nextInt(10);
            this.spawnAtLocation(new ItemStack(Items.DIAMOND, diamondCount));
        }
        if (this.random.nextFloat() < 0.25F + (pLooting * 0.1F)){
            int goldCount = 3 + this.random.nextInt(10);
            this.spawnAtLocation(new ItemStack(Items.GOLD_INGOT, goldCount));
        }
        if (this.random.nextFloat() < 0.05F + (pLooting * 0.1F)){
            this.spawnAtLocation(new ItemStack(Items.GOLDEN_APPLE));
        }
        if (this.random.nextFloat() < 0.5F + (pLooting * 0.1F)){
            int moonCoreCount = 3 + this.random.nextInt(8);
            this.spawnAtLocation(new ItemStack(ModItems.MOONCORE_SCALE.get(), moonCoreCount));
        }
        //exp
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
        return 2000 + this.random.nextInt(7000);
    }

    @Override
    public boolean shouldDropExperience() {
        return true;
    }
    //bypass drowning
    @Override
    public boolean isInvulnerableTo(DamageSource pDamageSource) {
        if (pDamageSource == this.level().damageSources().drown() || pDamageSource == this.level().damageSources().lightningBolt()) {
            return true;
        }
        return super.isInvulnerableTo(pDamageSource);
    }
    //by pass fire
    public boolean fireImmune(){
        return true;
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
        return SoundEvents.IRON_GOLEM_HURT;
    }
    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.IRON_GOLEM_DEATH;
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
