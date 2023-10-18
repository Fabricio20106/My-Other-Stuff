package com.junethewoods.myotherstuff.entity.renderer;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.item.OTItems;
import com.junethewoods.myotherstuff.item.custom.OTElytraItem;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.ElytraLayer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class OTElytraLayer<T extends LivingEntity, M extends EntityModel<T>> extends ElytraLayer<T, M> {
    public static final ResourceLocation FAST_ELYTRA_LOCATION = MyOtherStuff.resourceLoc("textures/entity/fast_elytra.png");
    public static final ResourceLocation BLAZE_ELYTRA_LOCATION = MyOtherStuff.resourceLoc("textures/entity/blaze_elytra.png");
    public static final ResourceLocation DRAGON_ELYTRA_LOCATION = MyOtherStuff.resourceLoc("textures/entity/dragon_elytra.png");
    public static final ResourceLocation VEX_ELYTRA_LOCATION = MyOtherStuff.resourceLoc("textures/entity/vex_elytra.png");

    public OTElytraLayer(IEntityRenderer<T, M> renderer) {
        super(renderer);
    }

    @Override
    public boolean shouldRender(ItemStack stack, T livEntity) {
        return stack.getItem() instanceof OTElytraItem;
    }

    @Override
    public ResourceLocation getElytraTexture(ItemStack stack, T entity) {
        return stack.getItem() == OTItems.FAST_ELYTRA.get() ? FAST_ELYTRA_LOCATION : stack.getItem() == OTItems.BLAZE_ELYTRA.get() ? BLAZE_ELYTRA_LOCATION : stack.getItem() == OTItems.DRAGON_WING.get() ? DRAGON_ELYTRA_LOCATION : stack.getItem() == OTItems.VEX_WING.get() ? VEX_ELYTRA_LOCATION : super.getElytraTexture(stack, entity);
    }
}
