package com.example.vanillaarms;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.BiConsumer;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VanillaArms.MODID);

    /** Молот: дополнительно отбрасывает цель и применяет эффект материала. */
    private static BiConsumer<LivingEntity, LivingEntity> smash(BiConsumer<LivingEntity, LivingEntity> extra) {
        return (target, attacker) -> {
            target.knockback(0.9D, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
            extra.accept(target, attacker);
        };
    }

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new EffectSword(ModTier.COPPER, 3, -2.4f, new Item.Properties(), (t, a) -> {}));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new EffectAxe(ModTier.COPPER, 5.0f, -3.1f, new Item.Properties(), (t, a) -> {}));

    public static final RegistryObject<Item> COPPER_DAGGER = ITEMS.register("copper_dagger",
            () -> new EffectSword(ModTier.COPPER, 1, -1.6f, new Item.Properties(), (t, a) -> {}));

    public static final RegistryObject<Item> COPPER_HAMMER = ITEMS.register("copper_hammer",
            () -> new EffectSword(ModTier.COPPER, 8, -3.3f, new Item.Properties(),
                    smash((t, a) -> {})));

    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword",
            () -> new EffectSword(ModTier.BONE, 3, -2.4f, new Item.Properties(), (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.HUNGER, 100, 0))));

    public static final RegistryObject<Item> BONE_AXE = ITEMS.register("bone_axe",
            () -> new EffectAxe(ModTier.BONE, 5.0f, -3.1f, new Item.Properties(), (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.HUNGER, 100, 0))));

    public static final RegistryObject<Item> BONE_DAGGER = ITEMS.register("bone_dagger",
            () -> new EffectSword(ModTier.BONE, 1, -1.6f, new Item.Properties(), (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.HUNGER, 100, 0))));

    public static final RegistryObject<Item> BONE_HAMMER = ITEMS.register("bone_hammer",
            () -> new EffectSword(ModTier.BONE, 8, -3.3f, new Item.Properties(),
                    smash((t, a) -> t.addEffect(new MobEffectInstance(MobEffects.HUNGER, 100, 0)))));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new EffectSword(ModTier.AMETHYST, 3, -2.4f, new Item.Properties(), (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 0))));

    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new EffectAxe(ModTier.AMETHYST, 5.0f, -3.1f, new Item.Properties(), (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 0))));

    public static final RegistryObject<Item> AMETHYST_DAGGER = ITEMS.register("amethyst_dagger",
            () -> new EffectSword(ModTier.AMETHYST, 1, -1.6f, new Item.Properties(), (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 0))));

    public static final RegistryObject<Item> AMETHYST_HAMMER = ITEMS.register("amethyst_hammer",
            () -> new EffectSword(ModTier.AMETHYST, 8, -3.3f, new Item.Properties(),
                    smash((t, a) -> t.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 0)))));

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new EffectSword(ModTier.EMERALD, 3, -2.4f, new Item.Properties(), (t, a) -> {}));

    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new EffectAxe(ModTier.EMERALD, 5.0f, -3.1f, new Item.Properties(), (t, a) -> {}));

    public static final RegistryObject<Item> EMERALD_DAGGER = ITEMS.register("emerald_dagger",
            () -> new EffectSword(ModTier.EMERALD, 1, -1.6f, new Item.Properties(), (t, a) -> {}));

    public static final RegistryObject<Item> EMERALD_HAMMER = ITEMS.register("emerald_hammer",
            () -> new EffectSword(ModTier.EMERALD, 8, -3.3f, new Item.Properties(),
                    smash((t, a) -> {})));

    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new EffectSword(ModTier.OBSIDIAN, 3, -3.0f, new Item.Properties(), (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 0))));

    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe",
            () -> new EffectAxe(ModTier.OBSIDIAN, 6.0f, -3.3f, new Item.Properties(), (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 0))));

    public static final RegistryObject<Item> OBSIDIAN_DAGGER = ITEMS.register("obsidian_dagger",
            () -> new EffectSword(ModTier.OBSIDIAN, 1, -1.6f, new Item.Properties(), (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 0))));

    public static final RegistryObject<Item> OBSIDIAN_HAMMER = ITEMS.register("obsidian_hammer",
            () -> new EffectSword(ModTier.OBSIDIAN, 9, -3.5f, new Item.Properties(),
                    smash((t, a) -> t.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 0)))));

    public static final RegistryObject<Item> FROST_SWORD = ITEMS.register("frost_sword",
            () -> new EffectSword(ModTier.FROST, 3, -2.4f, new Item.Properties(), (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 1))));

    public static final RegistryObject<Item> FROST_AXE = ITEMS.register("frost_axe",
            () -> new EffectAxe(ModTier.FROST, 5.0f, -3.1f, new Item.Properties(), (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 1))));

    public static final RegistryObject<Item> FROST_DAGGER = ITEMS.register("frost_dagger",
            () -> new EffectSword(ModTier.FROST, 1, -1.6f, new Item.Properties(), (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 1))));

    public static final RegistryObject<Item> FROST_HAMMER = ITEMS.register("frost_hammer",
            () -> new EffectSword(ModTier.FROST, 8, -3.3f, new Item.Properties(),
                    smash((t, a) -> t.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 1)))));

    public static final RegistryObject<Item> BLAZE_SWORD = ITEMS.register("blaze_sword",
            () -> new EffectSword(ModTier.BLAZE, 3, -2.4f, new Item.Properties(), (t, a) -> t.setSecondsOnFire(5)));

    public static final RegistryObject<Item> BLAZE_AXE = ITEMS.register("blaze_axe",
            () -> new EffectAxe(ModTier.BLAZE, 5.0f, -3.1f, new Item.Properties(), (t, a) -> t.setSecondsOnFire(5)));

    public static final RegistryObject<Item> BLAZE_DAGGER = ITEMS.register("blaze_dagger",
            () -> new EffectSword(ModTier.BLAZE, 1, -1.6f, new Item.Properties(), (t, a) -> t.setSecondsOnFire(5)));

    public static final RegistryObject<Item> BLAZE_HAMMER = ITEMS.register("blaze_hammer",
            () -> new EffectSword(ModTier.BLAZE, 8, -3.3f, new Item.Properties(),
                    smash((t, a) -> t.setSecondsOnFire(5))));
}
