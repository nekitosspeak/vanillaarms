package com.example.vanillaarms;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VanillaArms.MODID);

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new EffectSword(ModTier.COPPER, 3, -2.4f, new Item.Properties(),
                    (t, a) -> {}));

    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword",
            () -> new EffectSword(ModTier.BONE, 3, -2.4f, new Item.Properties(),
                    (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.HUNGER, 100, 0))));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new EffectSword(ModTier.AMETHYST, 3, -2.4f, new Item.Properties(),
                    (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 0))));

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new EffectSword(ModTier.EMERALD, 3, -2.4f, new Item.Properties(),
                    (t, a) -> {}));

    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new EffectSword(ModTier.OBSIDIAN, 3, -3.0f, new Item.Properties(),
                    (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 0))));

    public static final RegistryObject<Item> FROST_SWORD = ITEMS.register("frost_sword",
            () -> new EffectSword(ModTier.FROST, 3, -2.4f, new Item.Properties(),
                    (t, a) -> t.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 1))));

    public static final RegistryObject<Item> BLAZE_SWORD = ITEMS.register("blaze_sword",
            () -> new EffectSword(ModTier.BLAZE, 3, -2.4f, new Item.Properties(),
                    (t, a) -> t.setSecondsOnFire(5)));
}
