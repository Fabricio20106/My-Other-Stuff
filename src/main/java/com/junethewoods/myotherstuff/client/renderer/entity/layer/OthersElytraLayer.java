package com.junethewoods.myotherstuff.client.renderer.entity.layer;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.init.StuffInit;
import com.junethewoods.myotherstuff.common.item.OthersElytraItem;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.ElytraLayer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class OthersElytraLayer<T extends LivingEntity, M extends EntityModel<T>> extends ElytraLayer<T, M> {
    public static final ResourceLocation fast_elytra = MyOtherStuff.resourceLoc("textures/entity/fast_elytra.png");
    public static final ResourceLocation blaze_elytra = MyOtherStuff.resourceLoc("textures/entity/blaze_elytra.png");
    public static final ResourceLocation dragon_elytra = MyOtherStuff.resourceLoc("textures/entity/dragon_elytra.png");
    public static final ResourceLocation vex_elytra = MyOtherStuff.resourceLoc("textures/entity/vex_elytra.png");

    public OthersElytraLayer(IEntityRenderer<T, M> rendererIn) {
        super(rendererIn);
    }

    @Override
    public boolean shouldRender(ItemStack stack, T entity) {
        return stack.getItem() instanceof OthersElytraItem;
    }

    @Override
    public ResourceLocation getElytraTexture(ItemStack stack, T entity) {
        return stack.getItem() == StuffInit.fast_elytra.get() ? fast_elytra : stack.getItem() == StuffInit.blaze_elytra.get() ? blaze_elytra
                : stack.getItem() == StuffInit.dragon_wing.get() ? dragon_elytra : stack.getItem() == StuffInit.vex_wing.get() ? vex_elytra :
                super.getElytraTexture(stack, entity);
    }
}
