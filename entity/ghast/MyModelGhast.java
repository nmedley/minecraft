package mymod.entity.ghast;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class MyModelGhast extends ModelBase
{
    ModelRenderer body;
    ModelRenderer[] tentacles = new ModelRenderer[9];

    public MyModelGhast()
    {
        byte b0 = -16;
        this.body = new ModelRenderer(this, 0, 0);
        this.body.addBox(-8.0F, -8.0F, -8.0F, 16, 16, 16);
        this.body.rotationPointY += (float)(24 + b0);
        Random random = new Random(1660L);

        for (int i = 0; i < this.tentacles.length; ++i)
        {
            this.tentacles[i] = new ModelRenderer(this, 0, 0);
            float f = (((float)(i % 3) - (float)(i / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
            float f1 = ((float)(i / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
            int j = random.nextInt(7) + 8;
            this.tentacles[i].addBox(-1.0F, 0.0F, -1.0F, 2, j, 2);
            this.tentacles[i].rotationPointX = f;
            this.tentacles[i].rotationPointZ = f1;
            this.tentacles[i].rotationPointY = (float)(31 + b0);
        }
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
    {
        for (int i = 0; i < this.tentacles.length; ++i)
        {
            this.tentacles[i].rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F + (float)i) + 0.4F;
        }
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, 0.6F, 0.0F);
        this.body.render(par7);
        ModelRenderer[] amodelrenderer = this.tentacles;
        int i = amodelrenderer.length;

        for (int j = 0; j < i; ++j)
        {
            ModelRenderer modelrenderer = amodelrenderer[j];
            modelrenderer.render(par7);
        }

        GL11.glPopMatrix();
    }
}
