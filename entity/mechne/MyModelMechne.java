// Date: 11/20/2013 11:42:58 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package mymod.entity.mechne;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class MyModelMechne extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer head;
    ModelRenderer rightarmdetail;
    ModelRenderer leftarm;
    ModelRenderer rightlegtop;
    ModelRenderer waist;
    ModelRenderer leftlegup;
    ModelRenderer leftleglower;
    ModelRenderer rightarm;
    ModelRenderer rightleglower;
    ModelRenderer righttoe1;
    ModelRenderer lefttoe1;
    ModelRenderer lefttoe2;
    ModelRenderer righttoe2;
    ModelRenderer rightforearm;
    ModelRenderer bodylower;
    ModelRenderer headdetail;
    ModelRenderer leftarmdetail;
  
  public MyModelMechne()
  {
    textureWidth = 120;
    textureHeight = 100;
    
      body = new ModelRenderer(this, 31, 11);
      body.addBox(-9F, -12F, -7F, 17, 6, 12);
      body.setRotationPoint(0F, 13F, 1F);
      body.setTextureSize(120, 100);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      head = new ModelRenderer(this, 46, 0);
      head.addBox(-5F, -14F, -8F, 8, 4, 6);
      head.setRotationPoint(0F, 13F, 0F);
      head.setTextureSize(120, 100);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      rightarmdetail = new ModelRenderer(this, 3, 43);
      rightarmdetail.addBox(-3F, 6F, -9F, 2, 2, 10);
      rightarmdetail.setRotationPoint(-10F, 3F, 0F);
      rightarmdetail.setTextureSize(120, 100);
      rightarmdetail.mirror = true;
      setRotation(rightarmdetail, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 70, 10);
      leftarm.addBox(0F, 0F, -12F, 3, 5, 20);
      leftarm.setRotationPoint(8F, 3F, 0F);
      leftarm.setTextureSize(120, 100);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightlegtop = new ModelRenderer(this, 50, 64);
      rightlegtop.addBox(-2F, -1F, -1F, 4, 6, 5);
      rightlegtop.setRotationPoint(-5F, 10F, -1F);
      rightlegtop.setTextureSize(120, 100);
      rightlegtop.mirror = true;
      setRotation(rightlegtop, -0.1115358F, 0F, 0F);
      waist = new ModelRenderer(this, 46, 52);
      waist.addBox(-3F, -2F, -3F, 7, 5, 6);
      waist.setRotationPoint(-1F, 10F, 0F);
      waist.setTextureSize(120, 100);
      waist.mirror = true;
      setRotation(waist, 0F, 0F, 0F);
      leftlegup = new ModelRenderer(this, 50, 64);
      leftlegup.addBox(-2F, -1F, -1F, 4, 6, 5);
      leftlegup.setRotationPoint(4F, 10F, -1F);
      leftlegup.setTextureSize(120, 100);
      leftlegup.mirror = true;
      setRotation(leftlegup, -0.1115358F, 0F, 0F);
      leftleglower = new ModelRenderer(this, 60, 77);
      leftleglower.addBox(0F, 5F, -2F, 2, 9, 4);
      leftleglower.setRotationPoint(3F, 10F, -1F);
      leftleglower.setTextureSize(120, 100);
      leftleglower.mirror = true;
      setRotation(leftleglower, 0.3490659F, 0F, 0F);
      rightarm = new ModelRenderer(this, 18, 22);
      rightarm.addBox(-1F, 0F, -4F, 2, 8, 8);
      rightarm.setRotationPoint(-10F, 2F, 0F);
      rightarm.setTextureSize(120, 100);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      rightleglower = new ModelRenderer(this, 46, 77);
      rightleglower.addBox(-2F, 5F, -2F, 2, 9, 4);
      rightleglower.setRotationPoint(-4F, 10F, -1F);
      rightleglower.setTextureSize(120, 100);
      rightleglower.mirror = true;
      setRotation(rightleglower, 0.3490659F, 0F, 0F);
      righttoe1 = new ModelRenderer(this, 52, 91);
      righttoe1.addBox(0F, 13F, -2F, 2, 1, 5);
      righttoe1.setRotationPoint(-4F, 10F, -1F);
      righttoe1.setTextureSize(120, 100);
      righttoe1.mirror = true;
      setRotation(righttoe1, 0.051637F, 0F, 0F);
      lefttoe1 = new ModelRenderer(this, 52, 91);
      lefttoe1.addBox(1F, 13F, -2F, 2, 1, 5);
      lefttoe1.setRotationPoint(4F, 10F, -1F);
      lefttoe1.setTextureSize(120, 100);
      lefttoe1.mirror = true;
      setRotation(lefttoe1, 0.051637F, 0F, 0F);
      lefttoe2 = new ModelRenderer(this, 52, 91);
      lefttoe2.addBox(-3F, 13F, -2F, 2, 1, 5);
      lefttoe2.setRotationPoint(4F, 10F, -1F);
      lefttoe2.setTextureSize(120, 100);
      lefttoe2.mirror = true;
      setRotation(lefttoe2, 0.051637F, 0F, 0F);
      righttoe2 = new ModelRenderer(this, 52, 91);
      righttoe2.addBox(-4F, 13F, -2F, 2, 1, 5);
      righttoe2.setRotationPoint(-4F, 10F, -1F);
      righttoe2.setTextureSize(120, 100);
      righttoe2.mirror = true;
      setRotation(righttoe2, 0.051637F, 0F, 0F);
      rightforearm = new ModelRenderer(this, 1, 27);
      rightforearm.addBox(-2F, 6F, -10F, 2, 3, 12);
      rightforearm.setRotationPoint(-10F, 2F, 0F);
      rightforearm.setTextureSize(120, 100);
      rightforearm.mirror = true;
      setRotation(rightforearm, 0F, 0F, 0F);
      bodylower = new ModelRenderer(this, 37, 36);
      bodylower.addBox(-7F, -9F, -6F, 13, 6, 9);
      bodylower.setRotationPoint(0F, 13F, 1F);
      bodylower.setTextureSize(120, 100);
      bodylower.mirror = true;
      setRotation(bodylower, 0F, 0F, 0F);
      headdetail = new ModelRenderer(this, 75, 0);
      headdetail.addBox(-1F, -14.5F, -8.5F, 5, 2, 4);
      headdetail.setRotationPoint(0F, 13F, 0F);
      headdetail.setTextureSize(120, 100);
      headdetail.mirror = true;
      setRotation(headdetail, 0F, 0F, 0F);
      leftarmdetail = new ModelRenderer(this, 73, 36);
      leftarmdetail.addBox(1.5F, 0.5F, -11F, 2, 4, 20);
      leftarmdetail.setRotationPoint(8F, 3F, 0F);
      leftarmdetail.setTextureSize(120, 100);
      leftarmdetail.mirror = true;
      setRotation(leftarmdetail, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    body.render(f5);
    head.render(f5);
    rightarmdetail.render(f5);
    leftarm.render(f5);
    rightlegtop.render(f5);
    waist.render(f5);
    leftlegup.render(f5);
    leftleglower.render(f5);
    rightarm.render(f5);
    rightleglower.render(f5);
    righttoe1.render(f5);
    lefttoe1.render(f5);
    lefttoe2.render(f5);
    righttoe2.render(f5);
    rightforearm.render(f5);
    bodylower.render(f5);
    headdetail.render(f5);
    leftarmdetail.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
      this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.headdetail.rotateAngleY = this.head.rotateAngleY;
      this.headdetail.rotateAngleX = this.head.rotateAngleX;
      
      this.rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
      this.leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
      this.rightarm.rotateAngleZ = 0.0F;
      this.leftarm.rotateAngleZ = 0.0F;
      this.rightarmdetail.rotateAngleX = this.rightarm.rotateAngleX;
      this.leftarmdetail.rotateAngleX = this.leftarm.rotateAngleX;
      this.rightarmdetail.rotateAngleZ = 0.0F;
      this.leftarmdetail.rotateAngleZ = 0.0F;
      this.rightforearm.rotateAngleX = this.rightarm.rotateAngleX;
      this.rightforearm.rotateAngleZ = 0.0F;
            
      this.rightlegtop.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2 + -0.1115358F;
      this.leftlegup.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2 + -0.1115358F;
      this.rightlegtop.rotateAngleY = 0.0F;
      this.leftleglower.rotateAngleY = 0.0F;
      this.rightleglower.rotateAngleX = this.rightlegtop.rotateAngleX + 0.3490659F;
      this.leftleglower.rotateAngleX = this.leftlegup.rotateAngleX + 0.3490659F;
      this.rightleglower.rotateAngleY = 0.0F;
      this.leftleglower.rotateAngleY = 0.0F;
      this.righttoe1.rotateAngleX = this.rightlegtop.rotateAngleX + 0.051637F;
      this.lefttoe1.rotateAngleX = this.leftlegup.rotateAngleX + 0.051637F;
      this.righttoe1.rotateAngleY = 0.0F;
      this.lefttoe2.rotateAngleY = 0.0F;
      this.righttoe2.rotateAngleX = this.rightlegtop.rotateAngleX + 0.051637F;
      this.lefttoe2.rotateAngleX = this.leftlegup.rotateAngleX + 0.051637F;
      this.righttoe2.rotateAngleY = 0.0F;
      this.lefttoe2.rotateAngleY = 0.0F;
  }

}
