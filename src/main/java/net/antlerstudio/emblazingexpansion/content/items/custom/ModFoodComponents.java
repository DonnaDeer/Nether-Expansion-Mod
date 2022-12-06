package net.antlerstudio.emblazingexpansion.content.items.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent WARPED_BERRY = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20, 1), 1.0f)
            .build();

    public static final FoodComponent CRIMSON_ROOT = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 60, 1), 1.0f)
            .build();
}