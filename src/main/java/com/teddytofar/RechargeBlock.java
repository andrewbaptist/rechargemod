package com.teddytofar;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

public class RechargeBlock extends Block {
	public RechargeBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).destroyTime(.1f)
				.explosionResistance(1200));

	}

	@Override
	public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
		if (entity instanceof Player) {
			Player player = (Player) entity;
			player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1));
		}
	}

}
