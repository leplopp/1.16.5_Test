package com.pupmod.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

public class pupEggs extends SpawnEggItem{

	protected static final List<pupEggs> UNADDED_EGGS = new ArrayList<>();
	
	protected static DefaultDispenseItemBehavior behavior = new DefaultDispenseItemBehavior() {

		protected ItemStack execute(IBlockSource source, ItemStack stack) {
			Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
			EntityType<?> eType = ((SpawnEggItem) stack.getItem()).getType(stack.getTag());

			eType.spawn(source.getLevel(), stack, null, source.getPos().relative(direction), SpawnReason.DISPENSER,
					direction != Direction.UP, false);
			stack.shrink(1);
			return stack;
		}
	};
	
	private final Lazy<? extends EntityType<?>> entityTypeSupplier;

	public pupEggs(final RegistryObject<? extends EntityType<?>> entity, final int p_i48465_2_, final int p_i48465_3_, final Properties p_i48465_4_) {
		super(null, p_i48465_2_, p_i48465_3_, p_i48465_4_);
		this.entityTypeSupplier = Lazy.of(entity::get);
		UNADDED_EGGS.add(this);
	}

	public static void initSpawnEggs() {
		final Map<EntityType<?>, SpawnEggItem> EGGS = ObfuscationReflectionHelper.getPrivateValue(SpawnEggItem.class,
				null, "field_195987_b");

		for (final SpawnEggItem item : UNADDED_EGGS) {
			EGGS.put(item.getType(null), item);
			DispenserBlock.registerBehavior(item, behavior);
		}

		UNADDED_EGGS.clear();
	}
		@Override
		public EntityType<?> getType(CompoundNBT p_208076_1_) {
			return this.entityTypeSupplier.get();
		}
}