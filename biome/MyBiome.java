package mymod.biome;

import mymod.Main;
import net.minecraft.block.Block;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.passive.EntityMooshroom;    
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class MyBiome extends BiomeGenBase
{
    public MyBiome(int par1)
    {
        super(par1);
        
        this.setBiomeName("The Death Head Biome");
        
        this.topBlock = (byte)Block.grass.blockID;
        this.fillerBlock = (byte)Main.MyBlock_1.blockID;
        
        this.theBiomeDecorator.clayPerChunk = 20;
        this.theBiomeDecorator.treesPerChunk = 2;


        this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 20, 4, 80));
        this.spawnableCreatureList.add(new SpawnListEntry(EntityWither.class, 2, 2, 18));
        
        
        this.setMinMaxHeight(0.1F, 0.8F);
        this.setTemperatureRainfall(5.5F, 8.8F);
   
    }
}