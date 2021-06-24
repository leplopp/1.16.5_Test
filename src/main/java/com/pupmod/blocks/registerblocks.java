package com.pupmod.blocks;

import com.pupmod.names;
import com.pupmod.properties;
import com.pupmod.pupmod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BarrierBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.HoneyBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import sound.soundregistry;
import sound.soundtype;

public class registerblocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, pupmod.MODID);
	//original MC 1.7/1.7.10 
	
	//blocks
	public static final RegistryObject<Block> PINK_BLOCK = BLOCKS.register(names.BLOCK_PINK, () -> new Block(properties.Propertieone()));
	
	public static final RegistryObject<Block> PINK_BLOCK_TROLL = BLOCKS.register("pink_block_troll",
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).strength(100f, 10000000).sound(SoundType.STONE).noCollission()));
	
	public static final RegistryObject<Block> KIRCHNER_BLOCK = BLOCKS.register("kirchner_block",
			() -> new invisibleblock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3)
					.harvestTool(ToolType.PICKAXE).strength(3f, 20).sound(SoundType.ANVIL)));
	
	public static final RegistryObject<Block> KIRCHNER_BLOCK_NORMAL = BLOCKS.register("kirchner_block_normal",
			() -> new invisibleblock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3)
					.harvestTool(ToolType.PICKAXE).strength(2f, 20).sound(SoundType.ANVIL).noOcclusion()));
	
	public static final RegistryObject<Block> SCHMUMLER_BLOCK = BLOCKS.register("schmumler_block",
			() -> new BarrierBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3)
					.harvestTool(ToolType.PICKAXE).strength(3f, 10).sound(SoundType.NETHER_SPROUTS)));
	
	public static final RegistryObject<Block> SCHMUMLER_BLOCK_NORMAL = BLOCKS.register("schmumler_block_normal",
			() -> new BarrierBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3)
					.harvestTool(ToolType.PICKAXE).strength(3f, 10).sound(SoundType.NETHER_SPROUTS).noOcclusion()));
	
	public static final RegistryObject<Block> SNOT_BLOCK = BLOCKS.register("snot_block",
			() -> new snot_block(AbstractBlock.Properties.of(Material.EGG, MaterialColor.COLOR_LIGHT_GREEN).harvestLevel(0)
					.strength(0.5f, 2000).sound(SoundType.HONEY_BLOCK)));
	
	public static final RegistryObject<Block> PUKE_BLOCK = BLOCKS.register("puke_block",
			() -> new Block(AbstractBlock.Properties.of(Material.EGG, MaterialColor.COLOR_GREEN).harvestLevel(0)
					.strength(0f, 0).sound(SoundType.SLIME_BLOCK)));
	
	// MC 1.8 objects
	
	public static final RegistryObject<Block> PINK_CLAY_BLOCK = BLOCKS.register("pink_teracotta",
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).strength(3f, 1000).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> BLOOD_BLOCK = BLOCKS.register("blood_block",
			() -> new Block(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.COLOR_RED).harvestLevel(0)
					.strength(0f, 10).sound(SoundType.ROOTS)));
	
	public static final RegistryObject<Block> PINK_BRICKS = BLOCKS.register("pink_bricks",
			() -> new block_pink_bricks(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).harvestLevel(2)
					.harvestTool(ToolType.PICKAXE).strength(6f).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> PINK_SAND = BLOCKS.register("pink_sand",
			() -> new Block(AbstractBlock.Properties.of(Material.SAND, MaterialColor.TERRACOTTA_PINK).harvestLevel(0)
					.harvestTool(ToolType.SHOVEL).sound(SoundType.SAND).strength(0.5f, 1)));
	//rotate block test
	public static final RegistryObject<Block> TOILET_BLOCK = BLOCKS.register("toilet",
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).strength(3f).sound(SoundType.STONE).noOcclusion().dynamicShape()));
	
	// new MC 1.16.5
	public static final RegistryObject<Block> STONE_LADDER = BLOCKS.register("ledder_stone",
			() -> new pupLadderBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).strength(3f).sound(SoundType.STONE).noOcclusion()));
	
	public static final RegistryObject<Block> IlluBlock_EINGESTELLT_OBJ = BLOCKS.register("ball_obj",
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).strength(3f).sound(SoundType.STONE).noOcclusion()));

	public static final RegistryObject<Block> MACHAUGEBLOCK = BLOCKS.register("eyeball",
			() -> new invisibleblock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).strength(3f).sound(SoundType.STONE).noOcclusion()));
	
	public static final RegistryObject<Block> PINK_ORE = BLOCKS.register("pink_ore",
			() -> new invisibleblock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).strength(3f).sound(SoundType.STONE).noOcclusion()));
		
	public static final RegistryObject<Block> SOUR_MILK_BLOCK = BLOCKS.register("sour_milk_block",
			() -> new invisibleblock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).strength(3f).sound(SoundType.STONE).noOcclusion()));
	
	public static final RegistryObject<Block> HARD_MILK_BLOCK = BLOCKS.register("hard_milk_block",
			() -> new invisibleblock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).strength(3f).sound(SoundType.STONE).noOcclusion()));
	
	public static final RegistryObject<Block> HARD_MILK_BRICKS = BLOCKS.register("hard_milk_bricks",
			() -> new invisibleblock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).strength(3f).sound(SoundType.STONE).noOcclusion()));
	
	public static final RegistryObject<Block> PINK_STONE = BLOCKS.register("pink_stone",
			() -> new invisibleblock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).strength(3f).sound(SoundType.STONE).noOcclusion()));


}
