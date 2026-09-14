
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreeffectsinpotions.init;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.Item;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.moreeffectsinpotions.MoreEffectsInPotionsMod;

public class MoreEffectsInPotionsModPotions {
	public static Potion MINING_FATIGUE_POTION;
	public static Potion LEVITATION_POTION;
	public static Potion WITHER_POTION;
	public static Potion HASTE_POTION;

	public static void load() {
		MINING_FATIGUE_POTION = register("mining_fatigue_potion", new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 0, false, true)));
		LEVITATION_POTION = register("levitation_potion", new Potion(new MobEffectInstance(MobEffects.LEVITATION, 200, 0, false, true)));
		WITHER_POTION = register("wither_potion", new Potion(new MobEffectInstance(MobEffects.WITHER, 200, 0, false, true)));
		HASTE_POTION = register("haste_potion", new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, false, true)));
	}

	private static Item register(String registryName, Potion element) {
		return Registry.register(BuiltInRegistries.POTION, new ResourceLocation(MoreEffectsInPotionsMod.MODID, registryName), element);
	}
}
