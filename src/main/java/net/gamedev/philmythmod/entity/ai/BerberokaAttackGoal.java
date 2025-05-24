package net.gamedev.philmythmod.entity.ai;

import net.gamedev.philmythmod.entity.boss.BerberokaEntity;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;

public class BerberokaAttackGoal extends MeleeAttackGoal {
    private final BerberokaEntity entity;
    //again ticks depends on the animation 12 cause animation needs 12 ticks
    private int attackDelay = 30;
    private int ticksUntilNextAttack = 30;
    private boolean shouldCountTillNextAttack = false;
    public BerberokaAttackGoal(PathfinderMob pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
        super(pMob, pSpeedModifier, pFollowingTargetEvenIfNotSeen);
        entity = ((BerberokaEntity) pMob);
    }

    //start attack
    @Override
    public void start() {
        super.start();
        attackDelay = 30;
        ticksUntilNextAttack = 30;
    }
    //performs the attack
    @Override
    protected void checkAndPerformAttack(LivingEntity pEnemy, double pDistToEnemySqr) {
        //check if target inrange
        if (isEnemyWithinAttackDistance(pEnemy, pDistToEnemySqr)) {
            shouldCountTillNextAttack = true;
            //triggers the attack
            if(isTimeToStartAttackAnimation()) {
                entity.setAttacking(true);
            }
            //performs the actual attack
            if(isTimeToAttack()) {
                this.mob.getLookControl().setLookAt(pEnemy.getX(), pEnemy.getEyeY(), pEnemy.getZ());
                performAttack(pEnemy);
            }
        } else {
            //if not inrange stop attack, reset timer, prevent any attack
            resetAttackCooldown();
            shouldCountTillNextAttack = false;
            entity.setAttacking(false);
            entity.attackAnimationTimeout = 0;
        }
    }
    //func for checking range
    private boolean isEnemyWithinAttackDistance(LivingEntity pEnemy, double pDistToEnemySqr) {
        return pDistToEnemySqr <= this.getAttackReachSqr(pEnemy);
    }
    //resets the timer
    protected void resetAttackCooldown() {
        this.ticksUntilNextAttack = this.adjustedTickDelay(attackDelay * 2);
    }
    //return if mob will attack
    protected boolean isTimeToAttack() {
        return this.ticksUntilNextAttack <= 0;
    }
    //start the attack animation
    protected boolean isTimeToStartAttackAnimation() {
        return this.ticksUntilNextAttack <= attackDelay;
    }
    //just returns the value
    protected int getTicksUntilNextAttack() {
        return this.ticksUntilNextAttack;
    }
    //swings the mob's main hand (how they actually attack)
    protected void performAttack(LivingEntity pEnemy) {
        this.resetAttackCooldown();
        this.mob.swing(InteractionHand.MAIN_HAND);
        this.mob.doHurtTarget(pEnemy);
    }

    @Override
    public void tick() {
        super.tick();
        if (shouldCountTillNextAttack) {
            this. ticksUntilNextAttack = Math.max(this.ticksUntilNextAttack - 1, 0);
        }
    }
    // stop attack
    @Override
    public void stop() {
        entity.setAttacking(false);
        super.stop();
    }
}
