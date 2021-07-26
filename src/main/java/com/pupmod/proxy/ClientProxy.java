package com.pupmod.proxy;

import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class ClientProxy extends CommonProxy{
	
	@Override
	//@SideOnly(Side.SERVER)
	public void registermodells() {
	
		
		//entitycreater.creatEntity(NiggiEntity.class, new RenderNiggi(), "KIRCHNER", EnumCreatureType.monster , 10, 10, 100, new BiomeGenBase[]	{BiomeGenBase.desert,BiomeGenBase.beach,BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.coldBeach,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.desertHills,BiomeGenBase.extremeHills,BiomeGenBase.swampland,BiomeGenBase.extremeHillsEdge,BiomeGenBase.extremeHillsPlus,BiomeGenBase.forest,BiomeGenBase.hell,BiomeGenBase.jungle,BiomeGenBase.savanna,BiomeGenBase.taigaHills,BiomeGenBase.mesa,BiomeGenBase.stoneBeach,BiomeGenBase.jungleEdge,BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.mushroomIslandShore,BiomeGenBase.sky,BiomeGenBase.jungleHills}, 0xFF51FA, 0xFA219C, true);
		//entitycreater.creatEntity(entity2.class, new Render2(), "klotz", EnumCreatureType.monster , 10, 10, 100, new BiomeGenBase[]	{BiomeGenBase.desert,BiomeGenBase.beach,BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.coldBeach,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.desertHills,BiomeGenBase.extremeHills,BiomeGenBase.swampland,BiomeGenBase.extremeHillsEdge,BiomeGenBase.extremeHillsPlus,BiomeGenBase.forest,BiomeGenBase.hell,BiomeGenBase.jungle,BiomeGenBase.savanna,BiomeGenBase.taigaHills,BiomeGenBase.mesa,BiomeGenBase.stoneBeach,BiomeGenBase.jungleEdge,BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.mushroomIslandShore,BiomeGenBase.sky,BiomeGenBase.jungleHills}, 0xFF56FA, 0xFA219C, true);
		//entitycreater.creatEntity(entity3.class, new Render3(), "klotz2", EnumCreatureType.monster , 10, 10, 100, new BiomeGenBase[]	{BiomeGenBase.desert,BiomeGenBase.beach,BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.coldBeach,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.desertHills,BiomeGenBase.extremeHills,BiomeGenBase.swampland,BiomeGenBase.extremeHillsEdge,BiomeGenBase.extremeHillsPlus,BiomeGenBase.forest,BiomeGenBase.hell,BiomeGenBase.jungle,BiomeGenBase.savanna,BiomeGenBase.taigaHills,BiomeGenBase.mesa,BiomeGenBase.stoneBeach,BiomeGenBase.jungleEdge,BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.mushroomIslandShore,BiomeGenBase.sky,BiomeGenBase.jungleHills}, 0xFF56FA, 0xFA219C, true);
		//entitycreater.creatEntity(PuhEntity.class, new puhRender(), "puh", EnumCreatureType.monster , 10, 10, 100, new BiomeGenBase[]	{BiomeGenBase.desert,BiomeGenBase.beach,BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.coldBeach,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.desertHills,BiomeGenBase.extremeHills,BiomeGenBase.swampland,BiomeGenBase.extremeHillsEdge,BiomeGenBase.extremeHillsPlus,BiomeGenBase.forest,BiomeGenBase.hell,BiomeGenBase.jungle,BiomeGenBase.savanna,BiomeGenBase.taigaHills,BiomeGenBase.mesa,BiomeGenBase.stoneBeach,BiomeGenBase.jungleEdge,BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.mushroomIslandShore,BiomeGenBase.sky,BiomeGenBase.jungleHills}, 0xFF56FA, 0xFA219C, true);
		//entitycreater.creatEntity(puppigEntity.class, new PuppigRender(), "puppig", EnumCreatureType.monster , 10, 10, 100, new BiomeGenBase[]	{BiomeGenBase.desert,BiomeGenBase.beach,BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.coldBeach,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.desertHills,BiomeGenBase.extremeHills,BiomeGenBase.swampland,BiomeGenBase.extremeHillsEdge,BiomeGenBase.extremeHillsPlus,BiomeGenBase.forest,BiomeGenBase.hell,BiomeGenBase.jungle,BiomeGenBase.savanna,BiomeGenBase.taigaHills,BiomeGenBase.mesa,BiomeGenBase.stoneBeach,BiomeGenBase.jungleEdge,BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.mushroomIslandShore,BiomeGenBase.sky,BiomeGenBase.jungleHills}, 0xFF56FA, 0xFA219C, true);
		//entitycreater.creatEntity(entity6.class, new Render6(), "lll", EnumCreatureType.monster , 10, 10, 100, new BiomeGenBase[]	{BiomeGenBase.desert,BiomeGenBase.beach,BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.coldBeach,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.desertHills,BiomeGenBase.extremeHills,BiomeGenBase.swampland,BiomeGenBase.extremeHillsEdge,BiomeGenBase.extremeHillsPlus,BiomeGenBase.forest,BiomeGenBase.hell,BiomeGenBase.jungle,BiomeGenBase.savanna,BiomeGenBase.taigaHills,BiomeGenBase.mesa,BiomeGenBase.stoneBeach,BiomeGenBase.jungleEdge,BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.mushroomIslandShore,BiomeGenBase.sky,BiomeGenBase.jungleHills}, 0xFF56FA, 0xFA219C, true);
		//entitycreater.creatEntity(entity7.class, new Render7(), "stop", EnumCreatureType.monster , 10, 10, 100, new BiomeGenBase[]	{BiomeGenBase.desert,BiomeGenBase.beach,BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.coldBeach,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.desertHills,BiomeGenBase.extremeHills,BiomeGenBase.swampland,BiomeGenBase.extremeHillsEdge,BiomeGenBase.extremeHillsPlus,BiomeGenBase.forest,BiomeGenBase.hell,BiomeGenBase.jungle,BiomeGenBase.savanna,BiomeGenBase.taigaHills,BiomeGenBase.mesa,BiomeGenBase.stoneBeach,BiomeGenBase.jungleEdge,BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.mushroomIslandShore,BiomeGenBase.sky,BiomeGenBase.jungleHills}, 0xFF56FA, 0xFA219C, true);


	}
	
	public void RegisterItemRenders(){
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(pupmod.test), new GenericBlockItemRenderer(new TileEntitytest(),new Rendertest()));
	}
	
	

}
