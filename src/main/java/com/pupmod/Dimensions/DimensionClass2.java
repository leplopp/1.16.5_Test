package pupmod.Dimensions;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import pupmod.pupmod;

public class DimensionClass2 extends WorldProvider{
	
	@Override
	public String getDimensionName() {
		return "Kirchners Dimension!";
	
	}
	
	public boolean isSurfaceWorld(){
	    return true;
	    }
	
	@SideOnly(Side.CLIENT)
	public boolean doesXZShowFog(int p_76568_1_, int p_76568_2_){
	   return false;
	    }

	@Override
	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerHell(pupmod.biome2, 1.0F);
		this.dimensionId = pupmod.dimensionid2;
		
	}
	 @SideOnly(Side.CLIENT)
	 public Vec3 getFogColor(float p_76562_1_, float p_76562_2_){
		 return Vec3.createVectorHelper(0.20000000061224D, 0.20000000061024D, 0.2000000006124D);//return Vec3.createVectorHelper(0.20000000298023224D, 0.029999999329447746D, 0.029999999329447746D);
	    }
	 												
}
