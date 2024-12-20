package net.dragonmounts.entity.breath;

import net.dragonmounts.util.math.MathX;
import net.minecraft.util.math.Vec3d;

/**
* Created by TGG on 7/08/2015.
 *  * Models an entity which is being affected by the breath weapon
 * Every tick that an entity is exposed to the breath weapon, its "hit density" increases.
 *  Keeps track of the number of ticks that the entity has been exposed to the breath.
 *  Typical usage:
 *  1) Create a new BreathAffectedEntity for the entity
 *  2) Each time it is hit, call addHitDensity() proportional to the exposure + strength of the weapon
 *  3) Every tick, call decayEntityEffectTick
 *
 *  Query the entity's damage by
 *  1) getHitDensity
 *  2) isUnaffected
 *  3) each tick: if applyDamageThisTick() is true, apply the weapon damage now.  (This is used to space out the
 *     damage so that armour doesn't protect so much (eg 20 damage delivered once per second instead of 1 damage
 *     delivered twenty times per second - (a player with armour is invulnerable to that)  )
 */
public class BreathAffectedEntity implements IBreathEffectHandler {
	

  private float hitDensity;
  private int timeSinceLastHit;
  private int ticksUntilDamageApplied;
  private Vec3d averageDirection = new Vec3d(0, 0, 0);

  public BreathAffectedEntity() {
    hitDensity = 0.0F;
    timeSinceLastHit = 0;
    ticksUntilDamageApplied = TICKS_BETWEEN_DAMAGE_APPLICATION;
  }

  /**
   * increases the hit density of the entity
   * @param increase the amount to increase the hit density by
   */
  public void addHitDensity(Vec3d beamDirection, float increase) {
    Vec3d oldWeightedDirection = MathX.multiply(averageDirection.normalize(), hitDensity);
    Vec3d addedWeightedDirection = MathX.multiply(beamDirection.normalize(), increase);
    Vec3d newAverageDirection = oldWeightedDirection.add(addedWeightedDirection);
    averageDirection = newAverageDirection;

    hitDensity += increase;
    timeSinceLastHit = 0;
  }

  public float getHitDensity() {
    return hitDensity;
  }

  /**
   * Gets the average direction of the applied hitDensity (--> for example: if the breath weapon is a stream of water,
   *   this returns the average direction the water is travelling in).
   * @return the direction with density (i.e. not normalised - magnitude equals the hitDensity)
   */
  public Vec3d getHitDensityDirection()
  {
    return averageDirection;
  }

  /**
   *  returns true if damage should be applied this tick
   *  @return true if damage should be applied.  Resets after the call (repeated calls return false)
   */
  public boolean applyDamageThisTick() {
    if (ticksUntilDamageApplied > 0) return false;
    ticksUntilDamageApplied = TICKS_BETWEEN_DAMAGE_APPLICATION;
    return true;
  }

  private float ENTITY_DECAY_PERCENTAGE_PER_TICK = 5.0F;
  private float ENTITY_RESET_EFFECT_THRESHOLD = 0.01F;
  private final int TICKS_BEFORE_DECAY_STARTS = 7; // 40
  private final int TICKS_BETWEEN_DAMAGE_APPLICATION = 50;  // apply damage every x ticks

  /** updates the breath weapon's effect for a given entity
   *   called every tick; used to decay the cumulative effect on the entity
   *   for example - an entity being gently bathed in flame might gain 0.2 every time from the beam, and lose 0.2 every
   *     tick in this method.
   */
  @Override
  public boolean decayEffectTick() {
    if (timeSinceLastHit == 0 && ticksUntilDamageApplied > 0) {
      ticksUntilDamageApplied = 0;
    }
    if (++timeSinceLastHit < TICKS_BEFORE_DECAY_STARTS) return this.isUnaffected();
//    hitDensity *= (1.0F - ENTITY_DECAY_PERCENTAGE_PER_TICK / 100.0F);
    hitDensity = 0.0F;
    if (hitDensity < ENTITY_RESET_EFFECT_THRESHOLD){
      hitDensity = 0.0F;
      return true;
    }
    ++ticksUntilDamageApplied;
    ticksUntilDamageApplied = Math.min(ticksUntilDamageApplied, TICKS_BETWEEN_DAMAGE_APPLICATION);
    return false;
  }

  /**
   * Check if this block is unaffected by the breath weapon
   * @return true if the block is currently unaffected
   */
  @Override
  public boolean isUnaffected() {
    return hitDensity < ENTITY_RESET_EFFECT_THRESHOLD;
  }
}
