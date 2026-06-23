package com.effect.item;

import com.effect.MoreEffectsInPotions;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;

public class MEIPPotion implements ModInitializer {
    public static final Holder<Potion> LEVITATION_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(MoreEffectsInPotions.MOD_ID, "levitation_potion"),
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
                    Identifier.fromNamespaceAndPath(MoreEffectsInPotions.MOD_ID, "mining_fatigue_potion"),
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
                    Identifier.fromNamespaceAndPath(MoreEffectsInPotions.MOD_ID, "wither_potion"),
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
                    Identifier.fromNamespaceAndPath(MoreEffectsInPotions.MOD_ID, "haste_potion"),
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
                    Identifier.fromNamespaceAndPath(MoreEffectsInPotions.MOD_ID, "resistance_potion"),
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
                    Identifier.fromNamespaceAndPath(MoreEffectsInPotions.MOD_ID, "blindness_potion"),
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
                    Identifier.fromNamespaceAndPath(MoreEffectsInPotions.MOD_ID, "health_boost_potion"),
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
                    Identifier.fromNamespaceAndPath(MoreEffectsInPotions.MOD_ID, "hero_of_the_village_potion"),
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
                    Identifier.fromNamespaceAndPath(MoreEffectsInPotions.MOD_ID, "conduit_power_potion"),
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
                    Identifier.fromNamespaceAndPath(MoreEffectsInPotions.MOD_ID, "dolphin_grace_potion"),
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
                    Identifier.fromNamespaceAndPath(MoreEffectsInPotions.MOD_ID, "bad_luck_potion"),
                    new Potion("bad_luck_potion",
                            new MobEffectInstance(
                                    MobEffects.UNLUCK,
                                    3600
                            )
                    )
            );


    @Override
    public void onInitialize() {
        FabricPotionBrewingBuilder.BUILD.register(builder -> {
            builder.addMix(
                    // Input potion.
                    Potions.AWKWARD,
                    // Ingredient
                    Items.SHULKER_SHELL,
                    // Output potion.
                    LEVITATION_POTION
            );
            builder.addMix(
                    // Input potion.
                    Potions.AWKWARD,
                    // Ingredient
                    Items.STRING,
                    // Output potion.
                    MINING_FATIGUE_POTION
            );
            builder.addMix(
                    // Input potion.
                    Potions.AWKWARD,
                    // Ingredient
                    Items.COAL,
                    // Output potion.
                    WITHER_POTION
            );
            builder.addMix(
                    // Input potion.
                    Potions.AWKWARD,
                    // Ingredient
                    Items.LAPIS_LAZULI,
                    // Output potion.
                    HASTE_POTION
            );
            builder.addMix(
                    // Input potion.
                    Potions.AWKWARD,
                    // Ingredient
                    Items.TURTLE_SCUTE,
                    // Output potion.
                    RESISTANCE_POTION
            );
            builder.addMix(
                    // Input potion.
                    Potions.AWKWARD,
                    // Ingredient
                    Items.INK_SAC,
                    // Output potion.
                    BLINDNESS_POTION
            );
            builder.addMix(
                    // Input potion.
                    Potions.AWKWARD,
                    // Ingredient
                    Items.GOLDEN_APPLE,
                    // Output potion.
                    HEALTH_BOOST_POTION
            );
            builder.addMix(
                    // Input potion.
                    Potions.AWKWARD,
                    // Ingredient
                    Items.EMERALD,
                    // Output potion.
                    HERO_OF_THE_VILLAGE_POTION
            );
            builder.addMix(
                    // Input potion.
                    Potions.AWKWARD,
                    // Ingredient
                    Items.HEART_OF_THE_SEA,
                    // Output potion.
                    CONDUIT_POWER_POTION
            );
            builder.addMix(
                    // Input potion.
                    Potions.AWKWARD,
                    // Ingredient
                    Items.NAUTILUS_SHELL,
                    // Output potion.
                    DOLPHINS_GRACE_POTION
            );
            builder.addMix(
                    // Input potion.
                    Potions.AWKWARD,
                    // Ingredient
                    Items.FERMENTED_SPIDER_EYE,
                    // Output potion.
                    BAD_LUCK_POTION
            );
            builder.addMix(
                    // Input potion.
                    Potions.AWKWARD,
                    // Ingredient
                    Items.GOLD_NUGGET,
                    // Output potion.
                    Potions.LUCK
            );
        });
    }
}