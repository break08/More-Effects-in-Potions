package com.effect.item;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;

import static com.effect.MoreEffectsInPotions.MOD_ID;

public class MEIPPotion implements ModInitializer {
    public static final Holder<Potion> LEVITATION_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(MOD_ID, "levitation_potion"),
                    new Potion("levitation_potion",
                            new MobEffectInstance(
                                    MobEffects.LEVITATION,
                                    200
                            )
                    )
            );

    public static final Holder<Potion> MINING_FATIGUE_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(MOD_ID, "mining_fatigue_potion"),
                    new Potion("mining_fatigue_potion",
                            new MobEffectInstance(
                                    MobEffects.MINING_FATIGUE,
                                    3600
                            )
                    )
            );

    public static final Holder<Potion> WITHER_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(MOD_ID, "wither_potion"),
                    new Potion("wither_potion",
                            new MobEffectInstance(
                                    MobEffects.WITHER,
                                    200
                            )
                    )
            );

    public static final Holder<Potion> HASTE_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(MOD_ID, "haste_potion"),
                    new Potion("haste_potion",
                            new MobEffectInstance(
                                    MobEffects.HASTE,
                                    3600
                            )
                    )
            );

    public static final Holder<Potion> RESISTANCE_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(MOD_ID, "resistance_potion"),
                    new Potion("resistance_potion",
                            new MobEffectInstance(
                                    MobEffects.RESISTANCE,
                                    1200
                            )
                    )
            );

    public static final Holder<Potion> BLINDNESS_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(MOD_ID, "blindness_potion"),
                    new Potion("blindness_potion",
                            new MobEffectInstance(
                                    MobEffects.BLINDNESS,
                                    400
                            )
                    )
            );

    public static final Holder<Potion> HEALTH_BOOST_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(MOD_ID, "health_boost_potion"),
                    new Potion("health_boost_potion",
                            new MobEffectInstance(
                                    MobEffects.HEALTH_BOOST,
                                    1800
                            )
                    )
            );

    public static final Holder<Potion> HERO_OF_THE_VILLAGE_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(MOD_ID, "hero_of_the_village_potion"),
                    new Potion("hero_of_the_village_potion",
                            new MobEffectInstance(
                                    MobEffects.HERO_OF_THE_VILLAGE,
                                    600
                            )
                    )
            );

    public static final Holder<Potion> CONDUIT_POWER_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(MOD_ID, "conduit_power_potion"),
                    new Potion("conduit_power_potion",
                            new MobEffectInstance(
                                    MobEffects.CONDUIT_POWER,
                                    1800
                            )
                    )
            );

    public static final Holder<Potion> DOLPHINS_GRACE_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(MOD_ID, "dolphin_grace_potion"),
                    new Potion("dolphin_grace_potion",
                            new MobEffectInstance(
                                    MobEffects.DOLPHINS_GRACE,
                                    1600
                            )
                    )
            );

    public static final Holder<Potion> BAD_LUCK_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(MOD_ID, "bad_luck_potion"),
                    new Potion("bad_luck_potion",
                            new MobEffectInstance(
                                    MobEffects.UNLUCK,
                                    3600
                            )
                    )
            );


    @Override
    public void onInitialize() {

    }
}