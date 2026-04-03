/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreeffectsinpotions.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.moreeffectsinpotions.MoreEffectsInPotionsMod;

public class MoreEffectsInPotionsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, MoreEffectsInPotionsMod.MODID);
	public static final DeferredHolder<Potion, Potion> LEVITATION_POTION = REGISTRY.register("levitation_potion", () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 200, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> MINING_FATIGUE_POTION = REGISTRY.register("mining_fatigue_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> WITHER_POTION = REGISTRY.register("wither_potion", () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 200, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> HASTE_POTION = REGISTRY.register("haste_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> RESISTANT = REGISTRY.register("resistant", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> BLINDNESS_POTION = REGISTRY.register("blindness_potion", () -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 400, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> HEALTH_BOOST_POTION = REGISTRY.register("health_boost_potion", () -> new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> HERO_OF_THE_VILLAGE_POTION = REGISTRY.register("hero_of_the_village_potion", () -> new Potion(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> CONDUIT_POWER_POTION = REGISTRY.register("conduit_power_potion", () -> new Potion(new MobEffectInstance(MobEffects.CONDUIT_POWER, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> DOLPHIN_GRACE_POTION = REGISTRY.register("dolphin_grace_potion", () -> new Potion(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2400, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> BAD_LUCK_POTION = REGISTRY.register("bad_luck_potion", () -> new Potion(new MobEffectInstance(MobEffects.UNLUCK, 3600, 0, false, true)));
}