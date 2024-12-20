/*
 ** 2013 July 20
 **
 ** The author disclaims copyright to this source code.  In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package net.dragonmounts.entity.ai.ground;

import net.dragonmounts.entity.TameableDragonEntity;
import com.google.common.base.Predicate;
import net.minecraft.entity.ai.EntityAITargetNonTamed;

/**
 *
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public class EntityAIHunt extends EntityAITargetNonTamed {
    
    private final TameableDragonEntity dragon;

    public EntityAIHunt(TameableDragonEntity dragon, Class clazz, boolean p_i45876_3_, Predicate p_i45876_4_) {
        super(dragon, clazz, p_i45876_3_, p_i45876_4_);
        this.dragon = dragon;
    }

    @Override
    public boolean shouldExecute() {
        return dragon.isAdult() && super.shouldExecute();
    }
}
