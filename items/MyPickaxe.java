package mymod.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class MyPickaxe extends ItemPickaxe {
    
    private String texturePath = "mymod:";
    
    public MyPickaxe(int ItemID, EnumToolMaterial material, String textureName)
    {
        super(ItemID, material);
        this.setUnlocalizedName(textureName);
        texturePath += textureName;
    }

@Override   
@SideOnly(Side.CLIENT)

    public void registerIcons(IconRegister iconRegister)
    {
        this.itemIcon = iconRegister.registerIcon(texturePath);
    }  
       
    /** Makes your Item Enchanted when it is crafted */
        public void onCreated(ItemStack item, World world, EntityPlayer player) 
        {
            item.addEnchantment(Enchantment.fortune, 10);
            // Replace the "." after "Enchantment" to see options
            // The number is the Enchantment Level
        }

}