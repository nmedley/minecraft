package mymod;

import java.awt.Color;

import mymod.armor.MyArmor;
import mymod.armor.MyNinjaArmor;
import mymod.biome.MyBiome;
import mymod.biome.MySwampBiome;
import mymod.blocks.MyBlock;
import mymod.blocks.MyBlockGen;
import mymod.entity.abe.MyEntityAbe;
import mymod.entity.abe.MyModelAbe;
import mymod.entity.abe.MyRenderAbe;
import mymod.entity.creeper.MyEntityCreeper;
import mymod.entity.creeper.MyRenderCreeper;
import mymod.entity.ghast.MyEntityGhast;
import mymod.entity.ghast.MyRenderGhast;
import mymod.entity.mechne.MyEntityMechne;
import mymod.entity.mechne.MyModelMechne;
import mymod.entity.mechne.MyRenderMechne;
import mymod.entity.minion.MyEnitiyMinion;
import mymod.entity.minion.MyModelMinion;
import mymod.entity.minion.MyRenderMinion;
import mymod.entity.ogre.MyEntityOgre;
import mymod.entity.ogre.MyModelOgre;
import mymod.entity.ogre.MyRenderOgre;
import mymod.entity.pig.MyEntityPig;
import mymod.entity.pig.MyModelPig;
import mymod.entity.pig.MyRenderPig;
import mymod.entity.skeleton.MyEntitySkeleton;
import mymod.entity.skeleton.MyModelSkeleton;
import mymod.entity.skeleton.MyRenderSkeleton;
import mymod.entity.tobo.MyEntityTobo;
import mymod.entity.tobo.MyModelTobo;
import mymod.entity.tobo.MyRenderTobo;
import mymod.entity.wraith.MyEntityWraith;
import mymod.entity.wraith.MyModelWraith;
import mymod.entity.wraith.MyRenderWraith;
import mymod.entity.zombie.MyEntityZombie;
import mymod.entity.zombie.MyRenderZombie;
import mymod.handlers.MyCraftingHandler;
import mymod.handlers.MyPickupHandler;
import mymod.items.MyFood;
import mymod.items.MyItem;
import mymod.items.MyPickaxe;
import mymod.items.MySword;
import mymod.proxies.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.src.ModLoader;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/*If There Is An Error Buy A Tetty Bear!**/

/* 	MOD INFO */
	@Mod( modid = "mymod", name = "Death Attck!", version = "1.0")
	@NetworkMod(clientSideRequired=true, serverSideRequired=false)	


public class Main {

/*	PROXY INFO */
	@SidedProxy(clientSide = "mymod.proxies.ClientProxy", serverSide = "mymod.proxies.CommonProxy")
	public static CommonProxy proxy;
		
	
/**	
 * DECLARATION SECTION 
 * *********************************************************** */

//  DECLARATION THE CREATIVE TAB	
	public static CreativeTabs MyCreativeTab_1;

 //  DECLARE THE DEATH SWORD 
        public static Item MySword_1;
 
 //  DECLARE THE Dager 
 //       public static Item MyDager_1; 
       
 //  DECLARE THE PICKAXE 
        public static Item MyPickaxe_1;

//  DECLARE NEW TOOL MATERIAL
        									/** Harvest Level, Max Uses, Efficiency (f), Damage (f), Enchantability */
        public static EnumToolMaterial MyToolMaterial = EnumHelper.addToolMaterial("MyItem_1", 4, 1588, 18.0F, 18.0F, 10);

//  DECLARE THE ITEM
        public static Item MyItem_1;

//  DECLARE THE FOOD
        public static Item MyFood_1;

//  DECLARE THE LOVE
        public static Item MyFood_2;

//  DECLARE THE DIE
        public static Item MyFood_3;

//  DECLARE THE GOM
        public static Item MyFood_4;

//  DECLARE THE HOT
        public static Item MyFood_5;

//  DECLARE THE BLOCK
        public static Block MyBlock_1;
        
//  DECLARE THE BLOCK 2
        public static Block MyBlock_2;        

//  DECLARE THE ARMOR
        public static Item MyHelmet_1;
        public static Item MyChest_1;
        public static Item MyLeggings_1;
        public static Item MyBoots_1;

//  DECLARE THE Ninja ARMOR
        public static Item MyHelmet_2;
        public static Item MyChest_2;
        public static Item MyLeggings_2;
        public static Item MyBoots_2;

//  DECLARE THE Ninja ARMOR
        public static Item MyHelmet_3;

//  DECLARE THE ARMOR MATERIAL
        															/**maxDamageFactor, damegeReductionAmountArray, enchanability */
        public static EnumArmorMaterial MyArmorMaterial_1 = EnumHelper.addArmorMaterial("Death Head", 200, new int[]{12, 14, 14, 12}, 10);

//  DECLARE THE ARMOR NINJA MATERIAL
        															/**maxDamageFactor, damegeReductionAmountArray, enchanability */
        public static EnumArmorMaterial MyArmorMaterial_2 = EnumHelper.addArmorMaterial("Death Malo", 200, new int[]{8, 12, 12, 8}, 10);



//  DECLARE THE BIOME
        public static  BiomeGenBase MyBiome_1;

//  DECLARE THE BIOME
        public static  BiomeGenBase MySwampBiome_1;

//  DECLARE THE MOB ID
        static int MyEntityID = 300;
    
    //  SEARCH FOR UNIQUE ID    
        public static int getUniqueEntityId() {
            do {
                MyEntityID++;
            }
            while (EntityList.getStringFromID(MyEntityID) != null);
            return MyEntityID++;
        }
    
    //  DECLARE A NEW EGG
        public static void registerEntityEgg(Class <? extends Entity> entity, int primaryColor, int secondaryColor) {
            int id = getUniqueEntityId();
            EntityList.IDtoClassMapping.put(id, entity);
            EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
        }


//	DECLARE THE NEW ACHIEVEMENTS	
    	public static Achievement MyAchievement_1;
        public static Achievement MyAchievement_2;
        public static Achievement MyAchievement_3;
/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */

		//private Object MyCreativeTab_1;


		private CreativeTabs setCreativeTab;	


@EventHandler	
	public  void preInit( FMLPreInitializationEvent event ) 
	{
/**	
 * LOAD SECTION 
 * *********************************************************** */ 

//  LOAD THE CREATIVE TAB
         MyCreativeTab_1 = new CreativeTabs("MyCreativeTab_1") {
            public ItemStack getIconItemStack() {
                return new ItemStack(MyFood_1, 1, 0);   // Icon, Stack Size, Tab Position
            }
        };

//  LOAD THE DEATH SWORD
        MySword_1 = new MySword(2021, MyToolMaterial, "MySword_1").setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MySword_1, "MySword_1");
        LanguageRegistry.addName(MySword_1, "Death Sword");

//  LOAD THE Dager
//        MyDager_1 = new MyDager(2022, MyToolMaterial, "MyDager_1").setCreativeTab(MyCreativeTab_1);
//        GameRegistry.registerItem(MySword_1, "MyDager_1");
//        LanguageRegistry.addName(MySword_1, "Iron Dagger");

//  LOAD THE PICKAXE
        MyPickaxe_1 = new MyPickaxe(2022, MyToolMaterial, "MyPickaxe_1").setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyPickaxe_1, "MyPickaxe_1");
        LanguageRegistry.addName(MyPickaxe_1, "Death Pickaxe");

//  LOAD THE ITEM       
        MyItem_1 = new MyItem(2030, "MyItem_1").setCreativeTab(setCreativeTab).setMaxStackSize(64);setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyItem_1, "MyItem_1");
        LanguageRegistry.addName(MyItem_1, "Blood");	

//  LOAD THE FOOD
   /** itemId, healAmount, saturationModifier (F), isWolfsFavoriteMeat, Texture Name  */ 
        MyFood_1 = new MyFood(2040, 8, 80.8F, true, "MyFood_1").setAlwaysEdible().setPotionEffect(Potion.invisibility.id, 600, 60, 1.0F).setCreativeTab(setCreativeTab).setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyFood_1, "MyFood_1");
        LanguageRegistry.addName(MyFood_1, "Expeiment 1");

//  LOAD THE LOVE
   /** itemId, healAmount, saturationModifier (F), isWolfsFavoriteMeat, Texture Name  */ 
        MyFood_2 = new MyFood(2041, 0, 0.0F, true, "MyFood_2").setAlwaysEdible().setPotionEffect(Potion.nightVision.id, 600, 60, 1.0F).setCreativeTab(setCreativeTab).setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyFood_2, "MyFood_2");
        LanguageRegistry.addName(MyFood_2, "Expeiment 2");

//  LOAD THE die
   /** itemId, healAmount, saturationModifier (F), isWolfsFavoriteMeat, Texture Name  */ 
        MyFood_3 = new MyFood(2042, 8, 80.8F, true, "MyFood_3").setAlwaysEdible().setPotionEffect(Potion.regeneration.id, 600, 60, 1.0F).setCreativeTab(setCreativeTab).setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyFood_3, "MyFood_3");
        LanguageRegistry.addName(MyFood_3, "Expeiment 3");

//  LOAD THE GOM
   /** itemId, healAmount, saturationModifier (F), isWolfsFavoriteMeat, Texture Name  */ 
        MyFood_4 = new MyFood(2043, 0, 00.8F, true, "MyFood_4").setAlwaysEdible().setPotionEffect(Potion.wither.id, 80, 60, 1.0F).setCreativeTab(setCreativeTab).setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyFood_4, "MyFood_4");
        LanguageRegistry.addName(MyFood_4, "Expeiment 4");

//  LOAD THE HOT
   /** itemId, healAmount, saturationModifier (F), isWolfsFavoriteMeat, Texture Name  */ 
        MyFood_5 = new MyFood(2044, 8, 80.8F, true, "MyFood_5").setAlwaysEdible().setPotionEffect(Potion.resistance.id, 60, 60, 1.0F).setCreativeTab(setCreativeTab).setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyFood_5, "MyFood_5");
        LanguageRegistry.addName(MyFood_5, "Expeiment 5");

//  LOAD THE BLOCK 
        MyBlock_1 = new MyBlock(250, Material.rock, "MyBlock_1").setLightValue(50.0F).setResistance(50.0F).setHardness(5.8F).setStepSound(Block.soundGrassFootstep).setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerBlock(MyBlock_1, "MyBlock_1");
        LanguageRegistry.addName(MyBlock_1, "Death Head Ore"); 
		MinecraftForge.setBlockHarvestLevel(MyBlock_1, "pickaxe", 0);

//  LOAD THE BLOCK 2
        MyBlock_2 = new MyBlock(251, Material.rock, "MyBlock_2").setLightValue(0.0F).setResistance(40.0F).setHardness(4.8F).setStepSound(Block.soundGrassFootstep).setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerBlock(MyBlock_2, "MyBlock_2");
        LanguageRegistry.addName(MyBlock_2, "Death Head Ore"); 
		MinecraftForge.setBlockHarvestLevel(MyBlock_2, "pickaxe", 0);

//  LOAD HELMET 
        MyHelmet_1 = new MyArmor(2060, MyArmorMaterial_1, 0, 0, "myarmor").setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyHelmet_1, "MyHelmet_1");
        LanguageRegistry.addName(MyHelmet_1, "Black Helmet");      
    
//  LOAD CHESTPLATE
        MyChest_1 = new MyArmor(2061, MyArmorMaterial_1, 0, 1, "myarmor").setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyChest_1, "MyChest_1");
        LanguageRegistry.addName(MyChest_1, "Black Chest");

//  LOAD LEGGINGS    
        MyLeggings_1 = new MyArmor(2062, MyArmorMaterial_1, 0, 2, "myarmor").setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyLeggings_1, "MyLeggings_1");
        LanguageRegistry.addName(MyLeggings_1, "Black Leggings");

//  LOAD BOOTS   
        MyBoots_1 = new MyArmor(2063, MyArmorMaterial_1, 0, 3, "myarmor").setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyBoots_1, "MyBoots_1");
        LanguageRegistry.addName(MyBoots_1, "Black Boots");
    
//  LOAD N HELMET 
        MyHelmet_2 = new MyNinjaArmor(2064, MyArmorMaterial_1, 0, 0, "myninjaarmor").setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyHelmet_2, "MyHelmet_2");
        LanguageRegistry.addName(MyHelmet_2, "Red Helmet");      
    
//  LOAD N CHESTPLATE
        MyChest_2 = new MyNinjaArmor(2065, MyArmorMaterial_2, 0, 1, "myninjaarmor").setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyChest_2, "MyChest_2");
        LanguageRegistry.addName(MyChest_2, "Red Chest");

//  LOAD N LEGGINGS    
        MyLeggings_2 = new MyNinjaArmor(2066, MyArmorMaterial_2, 0, 2, "myninjaarmor").setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyLeggings_2, "MyLeggings_2");
        LanguageRegistry.addName(MyLeggings_2, "Red Leggings");

//  LOAD N BOOTS   
        MyBoots_2 = new MyNinjaArmor(2067, MyArmorMaterial_2, 0, 3, "myninjaarmor").setCreativeTab(MyCreativeTab_1);
        GameRegistry.registerItem(MyBoots_2, "MyBoots_2");
        LanguageRegistry.addName(MyBoots_2, "Red Boots");       
        
//  LOAD BIOME
        MySwampBiome_1 = new MySwampBiome(31);
        GameRegistry.addBiome(MySwampBiome_1);        
        
//  LOAD BIOME
        MyBiome_1 = new MyBiome(30);
        GameRegistry.addBiome(MyBiome_1);
        
//  REMOVE OTHER BIOMES
        GameRegistry.removeBiome(BiomeGenBase.desertHills);
        GameRegistry.removeBiome(BiomeGenBase.extremeHillsEdge);
        GameRegistry.removeBiome(BiomeGenBase.forestHills);
        GameRegistry.removeBiome(BiomeGenBase.frozenOcean);
        GameRegistry.removeBiome(BiomeGenBase.frozenRiver);
        GameRegistry.removeBiome(BiomeGenBase.iceMountains);
        GameRegistry.removeBiome(BiomeGenBase.icePlains);
        GameRegistry.removeBiome(BiomeGenBase.jungleHills);
        GameRegistry.removeBiome(BiomeGenBase.mushroomIsland);
        GameRegistry.removeBiome(BiomeGenBase.taigaHills);


//  REGISTER YOUR ENTITY
        EntityRegistry.registerGlobalEntityID(MyEntitySkeleton.class, "Death Skele", EntityRegistry.findGlobalUniqueEntityId());
        registerEntityEgg(MyEntitySkeleton.class, (new Color(253, 181, 8)).getRGB(), (new Color(253, 181, 8)).getRGB());       
        RenderingRegistry.registerEntityRenderingHandler(MyEntitySkeleton.class, new MyRenderSkeleton(new MyModelSkeleton(), 0.3F));
        ModLoader.addLocalization("entity.Death Skele.name", "Death Skele");

//  REGISTER YOUR ENTITY
        EntityRegistry.registerGlobalEntityID(MyEnitiyMinion.class, "Lightning Steve", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(MyEnitiyMinion.class, 15, 8, 28, EnumCreatureType.creature, BiomeGenBase.forest);     
        EntityRegistry.addSpawn(MyEnitiyMinion.class, 15, 8, 28, EnumCreatureType.monster, MyBiome_1);  
        registerEntityEgg(MyEnitiyMinion.class, (new Color(239, 231, 23)).getRGB(), (new Color(253, 181, 8)).getRGB());
        RenderingRegistry.registerEntityRenderingHandler(MyEnitiyMinion.class, new MyRenderMinion(new MyModelMinion(), 0.3F));
        ModLoader.addLocalization("entity.Lightning Steve.name", "Lightning Steve");


//	LOAD THE ACHIEVEMENTS                                                   
		MyAchievement_1 = new Achievement(2001, "MyAchievement_1", -1, -1, MyPickaxe_1, AchievementList.openInventory).registerAchievement();
		MyAchievement_1 = new Achievement(2002, "MyAchievement_2", -3, -1, MyItem_1, MyAchievement_1).registerAchievement();
		MyAchievement_1 = new Achievement(2003, "MyAchievement_3", -5, -1, MySword_1, MyAchievement_2).registerAchievement();
		//	(id, "NameOfAchievement", x, y coordinates on Achievement map, icon, Required Achievement to unlock)
		// 	For no Pre-required achievement, use "(Achievement)null"

//  REGISTER YOUR ENTITY
        EntityRegistry.registerGlobalEntityID(MyEntityWraith.class, "Ghost", EntityRegistry.findGlobalUniqueEntityId());  
        registerEntityEgg(MyEntityWraith.class, (new Color(255, 255, 255)).getRGB(), (new Color(255, 0, 0)).getRGB());
        RenderingRegistry.registerEntityRenderingHandler(MyEntityWraith.class, new MyRenderWraith(new MyModelWraith(), 0.3F));
        ModLoader.addLocalization("entity.Ghost.name", "Ghost");
        
//  REGISTER YOUR ENTITY
        EntityRegistry.registerGlobalEntityID(MyEntityZombie.class, "Ghost Soldier", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(MyEntityWraith.class, 6, 1, 2, EnumCreatureType.monster, BiomeGenBase.jungle);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 6, 1, 2, EnumCreatureType.monster, BiomeGenBase.swampland);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 6, 1, 2, EnumCreatureType.monster, BiomeGenBase.plains);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 6, 1, 2, EnumCreatureType.monster, BiomeGenBase.extremeHills);
        EntityRegistry.addSpawn(MyEntityWraith.class, 6, 1, 2, EnumCreatureType.monster, BiomeGenBase.taiga);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 6, 1, 2, EnumCreatureType.monster, BiomeGenBase.forest);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 6, 1, 2, EnumCreatureType.monster, BiomeGenBase.beach);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 6, 1, 2, EnumCreatureType.monster, MyBiome_1);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 6, 1, 2, EnumCreatureType.monster,BiomeGenBase.desert);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 6, 1, 2, EnumCreatureType.monster,BiomeGenBase.sky);  
        registerEntityEgg(MyEntityZombie.class, (new Color(255, 255, 255)).getRGB(), (new Color(255, 0, 0)).getRGB());
        RenderingRegistry.registerEntityRenderingHandler(MyEntityZombie.class, new MyRenderZombie());
        ModLoader.addLocalization("entity.Ghost Soldier.name", "Dead Knight");  

//  REGISTER YOUR ENTITY
        EntityRegistry.registerGlobalEntityID(MyEntityMechne.class, "Ghost Mechne", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(MyEntityWraith.class, 10, 1, 2, EnumCreatureType.monster, BiomeGenBase.jungle);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 10, 1, 2, EnumCreatureType.monster, BiomeGenBase.swampland);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 10, 1, 2, EnumCreatureType.monster, BiomeGenBase.plains);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 10, 1, 2, EnumCreatureType.monster, BiomeGenBase.extremeHills);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 10, 1, 2, EnumCreatureType.monster, BiomeGenBase.taiga);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 10, 1, 2, EnumCreatureType.monster, BiomeGenBase.forest);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 10, 1, 2, EnumCreatureType.monster, BiomeGenBase.beach);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 10, 1, 2, EnumCreatureType.monster, MyBiome_1);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 10, 1, 2, EnumCreatureType.monster,BiomeGenBase.desert);  
        EntityRegistry.addSpawn(MyEntityWraith.class, 10, 1, 2, EnumCreatureType.monster,BiomeGenBase.sky);  
        registerEntityEgg(MyEntityMechne.class, (new Color(255, 255, 255)).getRGB(), (new Color(255, 0, 0)).getRGB());
        RenderingRegistry.registerEntityRenderingHandler(MyEntityMechne.class, new MyRenderMechne(new MyModelMechne(), 0.3F));
        ModLoader.addLocalization("entity.Ghost Mechne.name", "Death Minion");  
     
    //  REGISTER YOUR ENTITY
        EntityRegistry.registerGlobalEntityID(MyEntityGhast.class, "Guardian of Ghasts", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(MyEntityGhast.class, 2, 1, 1, EnumCreatureType.monster, BiomeGenBase.hell);
        EntityRegistry.addSpawn(MyEntityGhast.class, 10, 1, 1, EnumCreatureType.monster, MyBiome_1);     
        registerEntityEgg(MyEntityGhast.class, (new Color(0, 0, 0)).getRGB(), (new Color(255, 0, 0)).getRGB());
        RenderingRegistry.registerEntityRenderingHandler(MyEntityGhast.class, new MyRenderGhast());
        ModLoader.addLocalization("entity.Guardian of Ghasts.name", "Guardian of Ghasts");    
     
 //  REGISTER YOUR ENTITY
        EntityRegistry.registerGlobalEntityID(MyEntityCreeper.class, "Blood", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(MyEntityCreeper.class, 10, 1, 5, EnumCreatureType.monster, BiomeGenBase.swampland); 
        EntityRegistry.addSpawn(MyEntityCreeper.class, 10, 1, 5, EnumCreatureType.monster, MyBiome_1);     
        registerEntityEgg(MyEntityCreeper.class, (new Color(0, 255, 0)).getRGB(), (new Color(255, 0, 0)).getRGB());
        RenderingRegistry.registerEntityRenderingHandler(MyEntityCreeper.class, new MyRenderCreeper());
        ModLoader.addLocalization("entity.Blood.name", "Blood");     

    //  REGISTER YOUR ENTITY
        EntityRegistry.registerGlobalEntityID(MyEntityTobo.class, "Terror Of the Night", EntityRegistry.findGlobalUniqueEntityId());  
        EntityRegistry.addSpawn(MyEntityTobo.class, 1, 1, 1, EnumCreatureType.monster, MyBiome_1);  
        registerEntityEgg(MyEntityTobo.class, (new Color(225, 0, 0)).getRGB(), (new Color(0, 0, 0)).getRGB());
        RenderingRegistry.registerEntityRenderingHandler(MyEntityTobo.class, new MyRenderTobo(new MyModelTobo(), 0.3F));
        ModLoader.addLocalization("entity.Terror Of the Night.name", "Terror Of the Night");     

    //  REGISTER YOUR ENTITY
        EntityRegistry.registerGlobalEntityID(MyEntityOgre.class, "Lord Of The Night", EntityRegistry.findGlobalUniqueEntityId()); 
        registerEntityEgg(MyEntityOgre.class, (new Color(255, 0, 0)).getRGB(), (new Color(255, 216, 0)).getRGB());
        EntityRegistry.addSpawn(MyEntityTobo.class, 1, 1, 1, EnumCreatureType.monster, MyBiome_1);          
        RenderingRegistry.registerEntityRenderingHandler(MyEntityOgre.class, new MyRenderOgre(new MyModelOgre(), 0.3F));
        ModLoader.addLocalization("entity.Lord Of The Night.name", "Lord Of The Night");

    //  REGISTER YOUR ENTITY
        EntityRegistry.registerGlobalEntityID(MyEntityAbe.class, "Abe", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(MyEntityAbe.class, 5, 1, 1, EnumCreatureType.monster, BiomeGenBase.hell);
        EntityRegistry.addSpawn(MyEntityAbe.class, 5, 1, 1, EnumCreatureType.monster, MyBiome_1);     
        registerEntityEgg(MyEntityAbe.class, (new Color(0, 96, 255)).getRGB(), (new Color(255, 0, 0)).getRGB());
        RenderingRegistry.registerEntityRenderingHandler(MyEntityAbe.class, new MyRenderAbe(new MyModelAbe(), 0.3F));
        ModLoader.addLocalization("entity.Abe.name", "Abe");     
     
//  REGISTER YOUR ENTITY
        EntityRegistry.registerGlobalEntityID(MyEntityPig.class, "Mutant Pig", EntityRegistry.findGlobalUniqueEntityId());
        registerEntityEgg(MyEntityPig.class, (new Color(236, 147, 149)).getRGB(), (new Color(255, 255, 255)).getRGB());
        RenderingRegistry.registerEntityRenderingHandler(MyEntityPig.class, new MyRenderPig(new MyModelPig(), 0.3F));
        ModLoader.addLocalization("entity.Mutant Pig.name", "Mutant Pig");     
     
/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */	
	}

private void setCreativeTab(Object myCreativeTab_12) {
	// TODO Auto-generated method stub
}

@EventHandler
	public static void init( FMLInitializationEvent event ) 
	{
	
/**	
 * RECIPES SECTION 
 * *********************************************************** */
 //	DEATH SWORD RECIPE  
        GameRegistry.addRecipe(new ItemStack(MySword_1, 1), new Object[]
        {
                " X ",
                " X ",
                " S ",
            'S', Item.bone,
            'X',MyItem_1,
        }); 



//  PICKAXE RECIPE  
        GameRegistry.addRecipe(new ItemStack(MyPickaxe_1, 1), new Object[]
        {
                "XXX",
                " S ",
                " S ",
            'S', Item.bone,
            'X',MyItem_1,
        });	


//  Item RECIPE  
        GameRegistry.addRecipe(new ItemStack(MyItem_1, 1), new Object[]
        {
                "S",
            'S', Item.ingotIron,
        });
        
//  FOOD RECIPE         
        GameRegistry.addRecipe(new ItemStack(MyFood_1, 2), new Object[]
        {
                "SS",
                "SS",
            'S', MyItem_1,
        });

//  LOVE RECIPE         
        GameRegistry.addRecipe(new ItemStack(MyFood_2, 2), new Object[]
        {
                "S",
            'S', MyItem_1,
        });

//  DIE RECIPE         
        GameRegistry.addRecipe(new ItemStack(MyFood_3, 2), new Object[]
        {
                "S",
        		"S",
            'S', MyItem_1,
        });

//  GOM RECIPE         
        GameRegistry.addRecipe(new ItemStack(MyFood_4, 2), new Object[]
        {
                "S",
        		"S",
        		"S",
            'S', MyItem_1,
        });

//  GOM RECIPE         
        GameRegistry.addRecipe(new ItemStack(MyBlock_2, 2), new Object[]
        {
        		"SS",
            'S', Block.cobblestone,
        });

//  SMELTING RECIPE
        GameRegistry.addSmelting(MyBlock_1.blockID, (new ItemStack(MyItem_1, 1)), 48);

//  HELMET RECIPE   
    GameRegistry.addRecipe(new ItemStack(MyHelmet_1, 1), new Object[]
    {
            "XXX",
            "X X",
            " X ",
        'X', MyItem_1,
    });         

//  CHESTPLATE RECIPE   
    GameRegistry.addRecipe(new ItemStack(MyChest_1, 1), new Object[]
    {
            "X X",
            "XXX",
            "XXX",
        'X', MyItem_1,
    });         

//  LEGGINGS RECIPE 
    GameRegistry.addRecipe(new ItemStack(MyLeggings_1, 1), new Object[]
    {
            "XXX",
            "X X",
            "X X",
        'X', MyItem_1,
    });         

//  BOOTS RECIPE    
    GameRegistry.addRecipe(new ItemStack(MyBoots_1, 1), new Object[]
    {
            "X X",
            "X X",
        'X', MyItem_1,
    });

//  HELMET N RECIPE   
    GameRegistry.addRecipe(new ItemStack(MyHelmet_2, 1), new Object[]
    {
            "XXX",
            "X X",
            " X ",
        'X', MyFood_1,
    });         

//  CHESTPLATE N RECIPE   
    GameRegistry.addRecipe(new ItemStack(MyChest_2, 1), new Object[]
    {
            "X X",
            "XXX",
            "XXX",
        'X', MyFood_1,
    });         

//  LEGGINGS N RECIPE 
    GameRegistry.addRecipe(new ItemStack(MyLeggings_2, 1), new Object[]
    {
            "XXX",
            "X X",
            "X X",
        'X', MyFood_1,
    });         

//  BOOTS N RECIPE    
    GameRegistry.addRecipe(new ItemStack(MyBoots_2, 1), new Object[]
    {
            "X X",
            "X X",
        'X', MyFood_1,
    });
/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */	


	
/**	
 * EXTRA METHODS SECTION 
 * *********************************************************** */

//  REGISTER THE ORE GENERATION 
    GameRegistry.registerWorldGenerator(new MyBlockGen());
        
//	CHANGE THE TEXT OF THE ACHIEVEMENT	
    	LanguageRegistry.instance().addStringLocalization("achievement.MyAchievement_1", "en_US", "Smash-o-rama");
    	LanguageRegistry.instance().addStringLocalization("achievement.MyAchievement_1.desc", "en_US", "Craft A Death Pickaxe");
    	LanguageRegistry.instance().addStringLocalization("achievement.MyAchievement_2", "en_US", "Kill By Head");
    	LanguageRegistry.instance().addStringLocalization("achievement.MyAchievement_2.desc", "en_US", "Smlet Some Death OreHead");
    	LanguageRegistry.instance().addStringLocalization("achievement.MyAchievement_3", "en_US", "Zap Sword");
    	LanguageRegistry.instance().addStringLocalization("achievement.MyAchievement_3.desc", "en_US", "Craft A Death Sword");

//  REGISTER PICKUP HANDLER
        MyPickupHandler MyPickupHandler_1 = new MyPickupHandler();
        GameRegistry.registerPickupHandler(MyPickupHandler_1);

//  REGISTER CRAFTING HANDLER
        MyCraftingHandler MyCraftingHandler_1 = new MyCraftingHandler();
        GameRegistry.registerCraftingHandler(MyCraftingHandler_1);

//  CHANGE TAB NAME
        LanguageRegistry.instance().addStringLocalization("itemGroup.MyCreativeTab_1", "en_US", "Death Land");

/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */	

	
	}

@EventHandler
	public static void postInit( FMLPostInitializationEvent event ) 
	{
	}
	
}
