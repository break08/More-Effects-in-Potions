
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
	public static Potion RESISTANCE_POTION;
	public static Potion BLINDNESS_POTION;
	public static Potion HEALTH_BOOST_POTION;
	public static Potion HERO_OF_THE_VILLAGE_POTION;
	public static Potion CONDUIT_POWER_POTION;
	public static Potion DOLPHIN_GRACE_POTION;
	public static Potion BAD_LUCK_POTION;

	public static void load() {
		MINING_FATIGUE_POTION = register("mining_fatigue_potion", new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 0, false, true)));
		LEVITATION_POTION = register("levitation_potion", new Potion(new MobEffectInstance(MobEffects.LEVITATION, 200, 0, false, true)));
		WITHER_POTION = register("wither_potion", new Potion(new MobEffectInstance(MobEffects.WITHER, 200, 0, false, true)));
		HASTE_POTION = register("haste_potion", new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, false, true)));
		RESISTANCE_POTION = register("resistance_potion", new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 0, false, true)));
		BLINDNESS_POTION = register("blindness_potion", new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 400, 0, false, true)));
		HEALTH_BOOST_POTION = register("health_boost_potion", new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1800, 0, false, true)));
		HERO_OF_THE_VILLAGE_POTION = register("hero_of_the_village_potion", new Potion(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 600, 0, false, true)));
		CONDUIT_POWER_POTION = register("conduit_power_potion", new Potion(new MobEffectInstance(MobEffects.CONDUIT_POWER, 1800, 0, false, true)));
		DOLPHIN_GRACE_POTION = register("dolphin_grace_potion", new Potion(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600, 0, false, true)));
		BAD_LUCK_POTION = register("bad_luck_potion", new Potion(new MobEffectInstance(MobEffects.UNLUCK, 3600, 0, false, true)));
	}

	private static Item register(String registryName, Potion element) {
		return Registry.register(BuiltInRegistries.POTION, new ResourceLocation(MoreEffectsInPotionsMod.MODID, registryName), element);
	}
}
