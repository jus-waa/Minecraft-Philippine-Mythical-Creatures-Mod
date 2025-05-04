package net.gamedev.philmythmod.entity.ai;

import net.gamedev.philmythmod.entity.boss.BakunawaBoss;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.phys.Vec3;

import java.util.EnumSet;

public class BakunawaSwimGoal extends Goal {
    private final BakunawaBoss mob;
    private Vec3 target;
    private final double speed;
    private int ticksUntilNewTarget = 0;

    public BakunawaSwimGoal(BakunawaBoss mob, double speed) {
        this.mob = mob;
        this.speed = speed;
    }

    @Override
    public boolean canUse() {
        return this.mob.isInWater();
    }

    @Override
    public void tick() {
        if (ticksUntilNewTarget <= 0 || target == null || mob.distanceToSqr(target) < 4.0D) {
            // Set a new random target every 100 ticks or when close to target
            double x = mob.getX() + (mob.getRandom().nextDouble() * 2.0D - 1.0D) * 32.0D;
            double y = mob.getY() + (mob.getRandom().nextDouble() * 2.0D - 1.0D) * 16.0D;
            double z = mob.getZ() + (mob.getRandom().nextDouble() * 2.0D - 1.0D) * 32.0D;

            target = new Vec3(x, y, z);
            ticksUntilNewTarget = 100 + mob.getRandom().nextInt(40); // Adds slight randomness
        } else {
            ticksUntilNewTarget--;
        }

        Vec3 direction = target.subtract(mob.position()).normalize().scale(1.0D);
        mob.setDeltaMovement(direction);

        // Smoothly rotate Bakunawa to face movement direction
        Vec3 movement = mob.getDeltaMovement();
        if (movement.lengthSqr() > 0.0001) {
            float targetYaw = (float) (Mth.atan2(movement.z, movement.x) * (180F / Math.PI)) - 90F;
            float newYaw = rotlerp(mob.getYRot(), targetYaw, 4F); // 4F = smoothing factor
            mob.setYRot(newYaw);
            mob.yBodyRot = newYaw;
            mob.yHeadRot = newYaw;
        }
    }
    private float rotlerp(float currentYaw, float targetYaw, float maxTurn) {
        float f = Mth.wrapDegrees(targetYaw - currentYaw);
        if (f > maxTurn) f = maxTurn;
        if (f < -maxTurn) f = -maxTurn;
        return currentYaw + f;
    }
}
