package com.example.vanillaarms;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModTier implements Tier {
    COPPER(190, 5.0f, 1.5f, 2, 10, () -> Ingredient.of(Items.COPPER_INGOT)),
    BONE(150, 4.0f, 1.0f, 1, 8, () -> Ingredient.of(Items.BONE)),
    AMETHYST(400, 6.0f, 2.0f, 2, 22, () -> Ingredient.of(Items.AMETHYST_SHARD)),
    EMERALD(1000, 7.0f, 3.0f, 3, 25, () -> Ingredient.of(Items.EMERALD)),
    OBSIDIAN(1800, 5.0f, 4.0f, 4, 5, () -> Ingredient.of(Items.OBSIDIAN)),
    FROST(500, 6.0f, 2.0f, 2, 12, () -> Ingredient.of(Items.PACKED_ICE)),
    BLAZE(700, 7.0f, 3.0f, 3, 15, () -> Ingredient.of(Items.BLAZE_ROD));

    private final int uses;
    private final float speed;
    private final float damage;
    private final int level;
    private final int enchantability;
    private final Supplier<Ingredient> repair;

    ModTier(int uses, float speed, float damage, int level, int enchantability, Supplier<Ingredient> repair) {
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.level = level;
        this.enchantability = enchantability;
        this.repair = repair;
    }

    @Override public int getUses() { return uses; }
    @Override public float getSpeed() { return speed; }
    @Override public float getAttackDamageBonus() { return damage; }
    @Override public int getLevel() { return level; }
    @Override public int getEnchantmentValue() { return enchantability; }
    @Override public Ingredient getRepairIngredient() { return repair.get(); }
}
