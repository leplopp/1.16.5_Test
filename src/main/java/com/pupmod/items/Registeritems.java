package com.pupmod.items;

import com.pupmod.pupmod;
import com.pupmod.entitys.entitycreatortypes;
import com.pupmod.lists.liquid;
import com.pupmod.render.RenderNiggi;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MilkBucketItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registeritems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, pupmod.MODID);
	
	// items
	public static final RegistryObject<Item> BLACK_TEA = ITEMS.register("black_tea",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> SNOT = ITEMS.register("snot",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> BLOOD = ITEMS.register("blood",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> SNOT_STICK = ITEMS.register("snot_stick",
			() -> new snoot_stick(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<Item> SNOT_STICK_HYPER = ITEMS.register("snot_stick_hyper",
			() -> new hyper_snoot_stick(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<Item> MAGIC_STICK = ITEMS.register("magic_stick",
			() -> new magic_stick(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<Item> SNOT_STICK_CRAHSER = ITEMS.register("snot_stick_crasher",
			() -> new crasher_stick(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<Item> PUH_STICK = ITEMS.register("aa_stick",
			() -> new aa_stick(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<Item> PINK_CLAY_ITEM = ITEMS.register("pink_clay_item",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PINK_BRICK = ITEMS.register("pink_brick",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_STICK_ORIGINAL = ITEMS.register("pup_stick",
			() -> new pup_stick(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<Item> PUKE = ITEMS.register("puke",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<MilkBucketItem> MILK = ITEMS.register("milk_bottle",
			() -> new MilkBucketItem(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(16)));
	public static final RegistryObject<Item> SOUR_MILK = ITEMS.register("sour_milk_bottle",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(16)));
	public static final RegistryObject<Item> SOUR_MILK_CLUMP = ITEMS.register("sour_milk_clump",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> SCHNIGGI_COIN = ITEMS.register("schniggi_coin",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PINK_TEA_RAW = ITEMS.register("pink_tea",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(16)));
	public static final RegistryObject<Item> BLOOD_BOTTLE = ITEMS.register("blood_bottle",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(16)));
	public static final RegistryObject<Item> SALT = ITEMS.register("salt",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	// public static final RegistryObject<Item> PINK_CAN =
	// ITEMS.register("pink_can", () -> new Item(new
	// Item.Properties().tab(pupmod.PUP_TAB_ITEMS))) ;
	public static final RegistryObject<Item> STONEBALL = ITEMS.register("stoneball",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(32)));
	// tools
	public static final RegistryObject<Item> PUP_SWORD = ITEMS.register("sword",
			() -> new pupsword(ItemTier.PUP, 100, 100f, new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_PICKAXE = ITEMS.register("pickaxe",
			() -> new puppickaxe(ItemTier.PUP, 100, 100f, new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_SPADE = ITEMS.register("spade",
			() -> new pup_spade(ItemTier.PUP, 100, 100f, new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_AXE = ITEMS.register("axe",
			() -> new pup_axe(ItemTier.PUP, 100, 100f, new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_HOE = ITEMS.register("hoe",
			() -> new pup_hoe(ItemTier.PUP, 100, 100f, new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	// armor
	public static final RegistryObject<Item> PUP_HELMET = ITEMS.register("helmet",
			() -> new armoritem(armormaterial.PUP, EquipmentSlot.HEAD,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_CHESTPLATE = ITEMS.register("chestplate",
			() -> new armoritem(armormaterial.PUP, EquipmentSlot.CHEST,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_LEGGINGS = ITEMS.register("hose",
			() -> new armoritem(armormaterial.PUP, EquipmentSlot.LEGS,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_BOOTS = ITEMS.register("boots", 
			() -> new armoritem(armormaterial.PUP,EquipmentSlot.FEET, 
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	// Liquid
	/*public static final RegistryObject<Item> PINK_LIQUID = ITEMS.register("pink_liquid",
			() -> new BucketItem(liquid.pink_fluid, new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));*/
	public static final RegistryObject<Item> PUKE_LIQUIT = ITEMS.register("puke_liquid",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<Item> SNOT_LIQUID = ITEMS.register("snot_liquid",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<Item> BLOOD_LIQUID = ITEMS.register("blood_liquid",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	// Eggs
	public static final RegistryObject<ForgeSpawnEggItem> NIGGI_EGG = ITEMS.register("niggi_egg",
			() -> new ForgeSpawnEggItem(entitycreatortypes.NIGGI, 0x898989, 0xb4b289,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<ForgeSpawnEggItem> DINGI_EGG = ITEMS.register("dingi_egg",
			() -> new ForgeSpawnEggItem(entitycreatortypes.DINGI, 0x000000, 0x5a5a5a,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<ForgeSpawnEggItem> GUMPALAN_BIG_EGG = ITEMS.register("gumpalanbig_egg",
			() -> new ForgeSpawnEggItem(entitycreatortypes.GUMPALAN_BIG, 0xA901DB, 0x26d300,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<ForgeSpawnEggItem> PUH_EGG = ITEMS.register("puh_egg",
			() -> new ForgeSpawnEggItem(entitycreatortypes.PUH,  0x3c2601, 0x784a00,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(99999)));
	public static final RegistryObject<ForgeSpawnEggItem> RING_EGG = ITEMS.register("ringi_egg",
			() -> new ForgeSpawnEggItem(entitycreatortypes.RINGENTITY, 0xdf0000, 0xe43535,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<ForgeSpawnEggItem> PUPPIG_EGG = ITEMS.register("puppig_egg",
			() -> new ForgeSpawnEggItem(entitycreatortypes.PUPPIG, 0xc75c84, 0xff6ca3,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	/*public static final RegistryObject<pupEggs> TEST_EGG = ITEMS.register("test_egg",
			() -> new pupEggs(entitycreatortypes.TEST_MODEL, 0x00000, 0x00000,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<pupEggs> GUMPALAN_EGG = ITEMS.register("gumpalan_egg",
			() -> new pupEggs(entitycreatortypes.GUMPALAN, 0x00000, 0x00000,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<pupEggs> LLL_EGG = ITEMS.register("lll_egg",
			() -> new pupEggs(entitycreatortypes.LLL, 0x00000, 0x00000,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	/*public static final RegistryObject<pupEggs> STOP_EGG = ITEMS.register("stop_egg",
			() -> new pupEggs(entitycreatortypes.STOPI, 0x00000, 0x00000,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));**/
}
