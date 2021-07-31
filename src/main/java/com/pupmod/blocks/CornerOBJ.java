package com.pupmod.blocks;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CornerOBJ extends Block{

	 protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
	
	public CornerOBJ(Properties p_49795_) {
		super(p_49795_);
	}
	
	   public VoxelShape getShape(BlockState p_57100_, BlockGetter p_57101_, BlockPos p_57102_, CollisionContext p_57103_) {
		      return SHAPE;
		   }
	   
		   public boolean useShapeForLightOcclusion(BlockState p_57109_) {
		      return false;
		   }

		   public RenderShape getRenderShape(BlockState p_57098_) {
		      return RenderShape.MODEL;
		   }

}
