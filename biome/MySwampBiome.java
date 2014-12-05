package mymod.biome;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class MySwampBiome extends BiomeGenBase
{
    public MySwampBiome(int par1)
    {
        super(par1);
        
        this.setBiomeName("The UnderWorld");
        
        this.topBlock = (byte)Block.mycelium.blockID;
        this.fillerBlock = (byte)Block.slowSand.blockID;
        
        this.theBiomeDecorator.clayPerChunk = 20;
        this.theBiomeDecorator.treesPerChunk = 20;
        

        this.spawnableCreatureList.add(new SpawnListEntry(EntityCreeper.class, 20, 4, 80));
        this.spawnableCreatureList.add(new SpawnListEntry(EntityIronGolem.class, 20, 4, 80));
        this.spawnableCreatureList.add(new SpawnListEntry(EntitySkeleton.class, 20, 4, 80));
        
        this.setMinMaxHeight(0.1F, 0.8F);
        this.setTemperatureRainfall(5.5F, 2.0F);
   
    }
}