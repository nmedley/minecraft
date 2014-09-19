package mymod.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MyLavaArmor extends ItemArmor{

    private String texturePath = "mymod:textures/armor/";
    private String iconPath = "mymod:";

    public MyLavaArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String myArmorName) {
        super(par1, par2EnumArmorMaterial, par3, par4);
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.SetArmorType(myArmorName, par4);
    }


    private void SetArmorType(String myArmorName, int par4)
    {
        switch(par4)
        {
        case 0:
            this.setUnlocalizedName("MyHelmet_3");
            this.texturePath += myArmorName + "_1.png";
            this.iconPath += "MyHelmet_3";
            break;
        case 1:
            this.setUnlocalizedName("MyChest_3");
            this.texturePath += myArmorName + "_1.png";
            this.iconPath += "MyChest_3";
            break;
        case 2:
            this.setUnlocalizedName("MyLeggings_3");
            this.texturePath += myArmorName + "_2.png";
            this.iconPath += "MyLeggings_3";
            break;
        case 3:
            this.setUnlocalizedName("MyBoots_3");
            this.texturePath += myArmorName + "_1.png";
            this.iconPath += "MyBoots_3";
            break;
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg)
    {
        this.itemIcon = reg.registerIcon(this.iconPath);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int layer, int slot)
    {
        return this.texturePath;
    }

}

