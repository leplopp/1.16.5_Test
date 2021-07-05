package com.pupmod.items;

import com.pupmod.pupmod;
import com.pupmod.entitys.entitycreatortypes;
import com.pupmod.lists.liquid;
import com.pupmod.render.RenderNiggi;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
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
			() -> new puppickaxe(100, 100f, ItemTier.PUP, new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_SPADE = ITEMS.register("spade",
			() -> new pup_spade(100, 100f, ItemTier.PUP, new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_AXE = ITEMS.register("axe",
			() -> new pup_axe(100, 100f, ItemTier.PUP, new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_HOE = ITEMS.register("hoe",
			() -> new pup_hoe(100, 100f, ItemTier.PUP, new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	// armor
	public static final RegistryObject<Item> PUP_HELMET = ITEMS.register("helmet",
			() -> new armoritem(armormaterial.PUP, EquipmentSlotType.HEAD,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_CHESTPLATE = ITEMS.register("chestplate",
			() -> new armoritem(armormaterial.PUP, EquipmentSlotType.CHEST,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_LEGGINGS = ITEMS.register("hose",
			() -> new armoritem(armormaterial.PUP, EquipmentSlotType.LEGS,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	public static final RegistryObject<Item> PUP_BOOTS = ITEMS.register("boots", 
			() -> new armoritem(armormaterial.PUP,EquipmentSlotType.FEET, 
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS)));
	// Liquid
	public static final RegistryObject<Item> PINK_LIQUID = ITEMS.register("pink_liquid",
			() -> new BucketItem(liquid.pink_fluid, new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<Item> PUKE_LIQUIT = ITEMS.register("puke_liquid",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<Item> SNOT_LIQUID = ITEMS.register("snot_liquid",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<Item> BLOOD_LIQUID = ITEMS.register("blood_liquid",
			() -> new Item(new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	// Eggs
	public static final RegistryObject<pupEggs> NIGGI_EGG = ITEMS.register("niggi_egg",
			() -> new pupEggs(entitycreatortypes.NIGGI, 0x00000, 0x00000,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<pupEggs> TEST_EGG = ITEMS.register("test_egg",
			() -> new pupEggs(entitycreatortypes.TEST_MODEL, 0x00000, 0x00000,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<pupEggs> PUH_EGG = ITEMS.register("puh_egg",
			() -> new pupEggs(entitycreatortypes.PUH, 0x00000, 0x00000,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<pupEggs> PUPPIG_EGG = ITEMS.register("puppig_egg",
			() -> new pupEggs(entitycreatortypes.PUPPIG, 0x00000, 0x00000,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<pupEggs> GUMPALAN_BIG_EGG = ITEMS.register("gumpalanbig_egg",
			() -> new pupEggs(entitycreatortypes.GUMPALAN_BIG, 0x00000, 0x00000,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<pupEggs> GUMPALAN_EGG = ITEMS.register("gumpalan_egg",
			() -> new pupEggs(entitycreatortypes.GUMPALAN, 0x00000, 0x00000,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<pupEggs> LLL_EGG = ITEMS.register("lll_egg",
			() -> new pupEggs(entitycreatortypes.LLL, 0x00000, 0x00000,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	public static final RegistryObject<pupEggs> RING_EGG = ITEMS.register("ringi_egg",
			() -> new pupEggs(entitycreatortypes.RINGENTITY, 0x00000, 0x00000,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));
	/*public static final RegistryObject<pupEggs> STOP_EGG = ITEMS.register("stop_egg",
			() -> new pupEggs(entitycreatortypes.STOPI, 0x00000, 0x00000,
					new Item.Properties().tab(pupmod.PUP_TAB_ITEMS).stacksTo(1)));**/
}
