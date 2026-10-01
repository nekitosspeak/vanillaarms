package com.example.vanillaarms;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

import java.util.function.BiConsumer;

/** Боевой топор, который при ударе накладывает эффект на цель. */
public class EffectAxe extends AxeItem {
    private final BiConsumer<LivingEntity, LivingEntity> onHit;

    public EffectAxe(Tier tier, float damage, float speed, Properties props,
                     BiConsumer<LivingEntity, LivingEntity> onHit) {
        super(tier, damage, speed, props);
        this.onHit = onHit;
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        onHit.accept(target, attacker);
        return super.hurtEnemy(stack, target, attacker);
    }
}
