package sound;

import com.pupmod.pupmod;

import net.minecraft.block.SoundType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class soundregistry {
	  public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, pupmod.MODID);
	  
	  
	  public static void SoundInit() {
		  SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		  
	    public static final RegistryObject<SoundEvent> NIGGISOUND = SOUNDS.register("niggi", () -> new SoundEvent(new ResourceLocation(pupmod.MODID, "niggi")));
	    public static final RegistryObject<SoundEvent> HUNGERAXEL = SOUNDS.register("hungeraxel", () -> new SoundEvent(new ResourceLocation(pupmod.MODID, "hungeraxel")));
	    public static final RegistryObject<SoundEvent> HIHI = SOUNDS.register("hihi", () -> new SoundEvent(new ResourceLocation(pupmod.MODID, "hihi")));
	    public static final RegistryObject<SoundEvent> PUH = SOUNDS.register("muhmoh", () -> new SoundEvent(new ResourceLocation(pupmod.MODID, "muhmoh")));
	    
	    public static final RegistryObject<SoundEvent> RINGI_STEP = SOUNDS.register("ringi_step", () -> new SoundEvent(new ResourceLocation(pupmod.MODID, "ringi_step")));

	    
	  
	
/*
	 public static final SoundEvent NIGGI_SOUND = register("niggi"); 
	    
	    private static SoundEvent register(String name) {
	        return Registry.register(Registry.SOUND_EVENT, name, new SoundEvent(new ResourceLocation(name)));
	     }
*/
	}
