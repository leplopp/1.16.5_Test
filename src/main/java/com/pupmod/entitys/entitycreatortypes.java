package com.pupmod.entitys;

import com.pupmod.items.Registeritems;
import com.pupmod.items.pupEggs;
import com.pupmod.*;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.chunk.LevelChunk.EntityCreationType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.server.command.ModIdArgument;

public class entitycreatortypes {
	
	public static final DeferredRegister<EntityType<?>> ENTITIE_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, pupmod.MODID);
		
	public static void EntityInit() {
		ENTITIE_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());}
	
	  public static final RegistryObject<EntityType<NiggiEntity>> NIGGI = ENTITIE_TYPES.register("niggi", () -> EntityType.Builder.of(NiggiEntity::new, EntityClassification.MONSTER)
	            .sized(1f, 2.3f)
	            .setShouldReceiveVelocityUpdates(true)
	            .fireImmune()
	            .build(new ResourceLocation(pupmod.MODID, "niggi").toString()));
	 
	  public static final RegistryObject<EntityType<testEntity>> TEST_MODEL = ENTITIE_TYPES.register("test", () -> EntityType.Builder.of(testEntity::new, .CREATURE)
	            .sized(.5f, .6f)
	            .setShouldReceiveVelocityUpdates(true)
	            .build(new ResourceLocation(pupmod.MODID, "test").toString()));
	  
	  public static final RegistryObject<EntityType<PuhEntity>> PUH = ENTITIE_TYPES.register("puh", () -> EntityType.Builder.of(PuhEntity::new, EntityClassification.CREATURE)
	            .sized(1.5f, 1.6f)
	            .setShouldReceiveVelocityUpdates(true)
	            .build(new ResourceLocation(pupmod.MODID, "puh").toString()));
	
	  public static final RegistryObject<EntityType<puppigEntity>> PUPPIG = ENTITIE_TYPES.register("puppig", () -> EntityType.Builder.of(puppigEntity::new, EntityClassification.CREATURE)
	            .sized(6f, 8f)
	            .fireImmune()
	            .setShouldReceiveVelocityUpdates(true)
	            .build(new ResourceLocation(pupmod.MODID, "puppig").toString()));
	  
	  public static final RegistryObject<EntityType<gumpalanBigEntity>> GUMPALAN_BIG = ENTITIE_TYPES.register("gumpalanbig", () -> EntityType.Builder.of(gumpalanBigEntity::new, EntityClassification.MISC)
	            .sized(6 * 1f, 20f)            
	            .setShouldReceiveVelocityUpdates(true)
	            .build(new ResourceLocation(pupmod.MODID, "gumpalanbig").toString()));
	  
	  public static final RegistryObject<EntityType<gumpalanEntity>> GUMPALAN = ENTITIE_TYPES.register("gumpalan", () -> EntityType.Builder.of(gumpalanEntity::new, EntityClassification.MISC)
	            .sized(6f, 5f)            
	            .setShouldReceiveVelocityUpdates(true)
	            .build(new ResourceLocation(pupmod.MODID, "gumpalan").toString()));
	  
	  public static final RegistryObject<EntityType<lllEntity>> LLL = ENTITIE_TYPES.register("lll", () -> EntityType.Builder.of(lllEntity::new, EntityClassification.CREATURE)
	            .sized(1f, 1f)            
	            .setShouldReceiveVelocityUpdates(false)
	            .build(new ResourceLocation(pupmod.MODID, "lll").toString()));
	  
	  public static final RegistryObject<EntityType<ringEntity>> RINGENTITY = ENTITIE_TYPES.register("ringi", () -> EntityType.Builder.of(ringEntity::new, EntityClassification.CREATURE)
	            .sized(1.2f, 2f)            
	            .setShouldReceiveVelocityUpdates(true)
	            .build(new ResourceLocation(pupmod.MODID, "ringi").toString()));
	  
	  /*public static final RegistryObject<EntityType<stopEntity>> STOPI = ENTITIE_TYPES.register("stopi", () -> EntityType.Builder.of(stopEntity::new, EntityClassification.MISC)
	            .sized(1f, 1f)            
	            .setShouldReceiveVelocityUpdates(false)
	            .build(new ResourceLocation(pupmod.MODID, "stopi").toString()));*/
}