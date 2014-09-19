package mymod.handlers;

import mymod.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class MyCraftingHandler implements ICraftingHandler 
{

        @Override
        public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
        
            if (item.itemID == Main.MyPickaxe_1.itemID)
            {
                player.addStat(Main.MyAchievement_2, 1);
            }
        
        }
        
        public void onSmelting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
            
            if (item.itemID == Main.MyItem_1.itemID)
            {
                player.addStat(Main.MyAchievement_3, 1);
            }
            
        }

		@Override
		public void onSmelting(EntityPlayer player, ItemStack item) {
			// TODO Auto-generated method stub
			
		}


		

}