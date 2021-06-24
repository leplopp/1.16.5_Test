/*package com.pupmod.items;

import java.util.List;

import javax.sound.midi.spi.SoundbankReader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockJukebox;
import net.minecraft.client.audio.SoundList;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import oracle.jrockit.jfr.openmbean.RecordingType;
import sound.soundentity;

public class cd extends ItemRecord{

	
	
	public cd(String cd) {
		super(cd);
		

}
	   public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
	    {
	        if (p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_) == Blocks.jukebox && p_77648_3_.getBlockMetadata(p_77648_4_, p_77648_5_, p_77648_6_) == 0)
	        {
	            if (p_77648_3_.isRemote)
	            {
	                return true;
	            }
	            else
	            {
	                ((BlockJukebox)Blocks.jukebox).func_149926_b(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_1_);
	                p_77648_3_.playAuxSFXAtEntity((EntityPlayer)null, 1005, p_77648_4_, p_77648_5_, p_77648_6_, Item.getIdFromItem(this));
	                --p_77648_1_.stackSize;
	                return true;
	            }
	        }
	        else
	        {
	            return false;
	        }
	    } 
	   public String getRecordNameLocal()
	    {
	     return StatCollector.translateToLocal("chiken_song_Remix");
	    }
	   
	   public ResourceLocation getRecordResource(String name)
	    {
	        return new ResourceLocation(name = "pupmod:soundchiken");
	   
	    }
}
	   */
	     

