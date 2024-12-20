package net.dragonmounts.event;

import net.dragonmounts.init.DMItems;
import net.dragonmounts.item.DragonSpawnEggItem;
import net.dragonmounts.util.math.MathX;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by TGG on 29/05/2019.
 */
public class IItemColorRegistration {
    @SubscribeEvent
    public static void registerItemHandlers(ColorHandlerEvent.Item event) {
        // Dragon Whistle String Color
        ItemColors colors = event.getItemColors();
        colors.registerItemColorHandler((stack, tintIndex) -> {
            if (tintIndex == 1) {
                NBTTagCompound root = stack.getTagCompound();
                if (root != null && root.hasKey("Color")) {
                    return root.getInteger("Color");
                }
            }
            return 0xFFFFFF;
        }, DMItems.DRAGON_WHISTLE);

        colors.registerItemColorHandler((stack, tintIndex) -> {
            Item item = stack.getItem();
            return item instanceof DragonSpawnEggItem ? (
                    tintIndex == 0 ? ((DragonSpawnEggItem) item).backgroundColor : ((DragonSpawnEggItem) item).highlightColor
            ) : -1;
        }, DMItems.AETHER_DRAGON_SPAWN_EGG, DMItems.ENCHANT_DRAGON_SPAWN_EGG, DMItems.ENDER_DRAGON_SPAWN_EGG, DMItems.FIRE_DRAGON_SPAWN_EGG, DMItems.FOREST_DRAGON_SPAWN_EGG, DMItems.ICE_DRAGON_SPAWN_EGG, DMItems.MOONLIGHT_DRAGON_SPAWN_EGG, DMItems.NETHER_DRAGON_SPAWN_EGG, DMItems.SKELETON_DRAGON_SPAWN_EGG, DMItems.STORM_DRAGON_SPAWN_EGG, DMItems.SUNLIGHT_DRAGON_SPAWN_EGG, DMItems.TERRA_DRAGON_SPAWN_EGG, DMItems.WATER_DRAGON_SPAWN_EGG, DMItems.WITHER_DRAGON_SPAWN_EGG, DMItems.ZOMBIE_DRAGON_SPAWN_EGG);

        colors.registerItemColorHandler((stack, tintIndex) -> {
            if (tintIndex != 1) return 0xFFFFFF;// claw
            // orb jewel
            final long GLOW_CYCLE_PERIOD_SECONDS = 4;
            final float MIN_GLOW_BRIGHTNESS = 0.4F;
            final float MAX_GLOW_BRIGHTNESS = 1.0F;
            final long NANO_SEC_PER_SEC = 1000L * 1000L * 1000L;
            long cyclePosition = System.nanoTime() % (GLOW_CYCLE_PERIOD_SECONDS * NANO_SEC_PER_SEC);
            double cyclePosRadians = 2 * Math.PI * cyclePosition / (double) (GLOW_CYCLE_PERIOD_SECONDS * NANO_SEC_PER_SEC);
            final float BRIGHTNESS_MIDPOINT = (MIN_GLOW_BRIGHTNESS + MAX_GLOW_BRIGHTNESS) / 2.0F;
            final float BRIGHTNESS_AMPLITUDE = (MAX_GLOW_BRIGHTNESS - BRIGHTNESS_MIDPOINT);
            int brightness = MathHelper.clamp((int) (255 * (BRIGHTNESS_MIDPOINT + BRIGHTNESS_AMPLITUDE * MathX.sin((float) cyclePosRadians))), 0, 255);
            return ((brightness & 0xFF) << 16) | ((brightness & 0xFF) << 8) | (brightness & 0xFF);
        }, DMItems.DRAGON_ORB);
    }
}
