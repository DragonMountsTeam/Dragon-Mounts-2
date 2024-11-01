package com.TheRPGAdventurer.ROTD.client.render;

import com.TheRPGAdventurer.ROTD.client.model.ModelDragonShulker;
import com.TheRPGAdventurer.ROTD.objects.blocks.BlockDragonShulker;
import com.TheRPGAdventurer.ROTD.objects.tileentities.TileEntityDragonShulker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.TheRPGAdventurer.ROTD.DragonMounts.makeId;

@SideOnly(Side.CLIENT)
public class TileEntityDragonShulkerRenderer extends TileEntitySpecialRenderer<TileEntityDragonShulker> {

    private static final ResourceLocation TEXTURE = makeId("textures/blocks/dragon_shulker.png");
    private static final ModelDragonShulker MODEL = new ModelDragonShulker();
   

    @Override
    public void render(TileEntityDragonShulker te, double x, double y, double z, float partialTicks, int destroyStage, float alpha)
    {
        GlStateManager.enableDepth();
        GlStateManager.depthFunc(515);
        GlStateManager.depthMask(true);
        GlStateManager.disableCull();
        
        ModelDragonShulker model = MODEL;

        if (destroyStage >= 0)
        {
            this.bindTexture(DESTROY_STAGES[destroyStage]);
            GlStateManager.matrixMode(5890);
            GlStateManager.pushMatrix();
            GlStateManager.scale(4.0F, 4.0F, 1.0F);
            GlStateManager.translate(0.0625F, 0.0625F, 0.0625F);
            GlStateManager.matrixMode(5888);
            GlStateManager.disableCull();
        }
        
        else
        {	
        	this.bindTexture(TEXTURE);
        }

        GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();

        GlStateManager.translate((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        GlStateManager.scale(1.0F, -1.0F, -1.0F);
        GlStateManager.translate(0.0F, 1.0F, 0.0F);
        float f = 0.9995F;
        GlStateManager.scale(f, f, f);
        GlStateManager.translate(0.0F, -1.0F, 0.0F);

        
        
        model.base.render(0.0625F);
        
        GlStateManager.translate(0.0F, -te.getProgress(partialTicks) * 0.5F, 0.0F);
        GlStateManager.rotate(270.0F * te.getProgress(partialTicks), 0.0F, 1.0F, 0.0F);
        
        model.lid.render(0.0625F);
        
        GlStateManager.enableCull();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

        if (destroyStage >= 0)
        {
            GlStateManager.matrixMode(5890);
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(5888);
        }
    }

    public static class ItemStackRenderer extends TileEntityItemStackRenderer {
        public void renderByItem(ItemStack stack, float partialTicks) {
            Item item = stack.getItem();
            if (item instanceof ItemBlock && ((ItemBlock) item).getBlock() instanceof BlockDragonShulker) {
                TextureManager textures = Minecraft.getMinecraft().renderEngine;
                if (textures == null) return;
                GlStateManager.enableDepth();
                GlStateManager.depthFunc(515);
                GlStateManager.depthMask(true);
                GlStateManager.disableCull();
                textures.bindTexture(TEXTURE);
                ModelDragonShulker model = MODEL;
                GlStateManager.pushMatrix();
                GlStateManager.enableRescaleNormal();
                GlStateManager.translate(0.5F, 1.5F, 0.5F);
                GlStateManager.scale(1.0F, -1.0F, -1.0F);
                GlStateManager.translate(0.0F, 1.0F, 0.0F);
                float f = 0.9995F;
                GlStateManager.scale(f, f, f);
                GlStateManager.translate(0.0F, -1.0F, 0.0F);
                model.base.render(0.0625F);
                model.lid.render(0.0625F);
                GlStateManager.enableCull();
                GlStateManager.disableRescaleNormal();
                GlStateManager.popMatrix();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            }
        }
    }
}