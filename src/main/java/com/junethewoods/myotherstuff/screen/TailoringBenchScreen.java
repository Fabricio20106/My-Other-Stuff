package com.junethewoods.myotherstuff.screen;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.container.custom.TailoringBenchContainer;
import com.junethewoods.myotherstuff.crafting.custom.TailoringRecipe;
import com.junethewoods.myotherstuff.sound.OTSounds;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SimpleSound;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class TailoringBenchScreen extends ContainerScreen<TailoringBenchContainer> {
    public static final ResourceLocation BACKGROUND_LOCATION = MyOtherStuff.resourceLoc("textures/gui/container/tailoring_bench.png");
    private float scrollOffs;
    private boolean scrolling;
    private int startIndex;
    private boolean displayRecipes;

    public TailoringBenchScreen(TailoringBenchContainer container, PlayerInventory inventory, ITextComponent title) {
        super(container, inventory, title);
        container.registerUpdateListener(this::containerChanged);
        --this.titleLabelY;
    }

    @Override
    public void render(MatrixStack stack, int mouseX, int mouseY, float partialTicks) {
        super.render(stack, mouseX, mouseY, partialTicks);
        this.renderTooltip(stack, mouseX, mouseY);
    }

    @Override
    protected void renderBg(MatrixStack stack, float partialTicks, int mouseX, int mouseY) {
        this.renderBackground(stack);
        RenderSystem.color4f(1,1 ,1, 1);
        this.minecraft.getTextureManager().bind(BACKGROUND_LOCATION);
        int leftPos = this.leftPos;
        int topPos = this.topPos;
        this.blit(stack, leftPos, topPos, 0, 0, this.imageWidth, this.imageHeight);
        int scrollOffset = (int) (41 * this.scrollOffs);
        this.blit(stack, leftPos + 119, topPos + 15 + scrollOffset, 176 + (this.isScrollBarActive() ? 0 : 12), 0, 12, 15);
        int offsetLeftPos = this.leftPos + 52;
        int offsetTopPos = this.topPos + 14;
        int offsetStartIndex = this.startIndex + 12;
        this.renderButtons(stack, mouseX, mouseY, offsetLeftPos, offsetTopPos, offsetStartIndex);
        this.renderRecipes(offsetLeftPos, offsetTopPos, offsetStartIndex);
    }

    @Override
    protected void renderTooltip(MatrixStack stack, int mouseX, int mouseY) {
        super.renderTooltip(stack, mouseX, mouseY);
        if (this.displayRecipes) {
            int offsetLeftPos = this.leftPos + 52;
            int offsetTopPos = this.topPos + 14;
            int offsetStartIndex = this.startIndex + 12;
            List<TailoringRecipe> tailoringRecipes = this.menu.getRecipes();

            for (int availRecipes = this.startIndex; availRecipes < offsetStartIndex && availRecipes < this.menu.getNumRecipes(); ++availRecipes) {
                int i2 = availRecipes - this.startIndex;
                int i3 = offsetLeftPos + i2 % 4 * 16;
                int i4 = offsetTopPos + i2 / 4 * 18 + 2;
                if (mouseX >= i3 && mouseX < i3 + 16 && mouseY >= i4 && mouseY < i4 + 18) {
                    this.renderTooltip(stack, tailoringRecipes.get(availRecipes).getResultItem(), mouseX, mouseY);
                }
            }
        }
    }

    private void renderButtons(MatrixStack stack, int mouseX, int mouseY, int offsetLeftPos, int offsetTopPos, int offsetStartIndex) {
        for(int availRecipes = this.startIndex; availRecipes < offsetStartIndex && availRecipes < this.menu.getNumRecipes(); ++availRecipes) {
            int i2 = availRecipes - this.startIndex;
            int i3 = offsetLeftPos + i2 % 4 * 16;
            int i5 = i2 / 4;
            int i4 = offsetTopPos + i5 * 18 + 2;
            int imageHeight1 = this.imageHeight;
            if (availRecipes == this.menu.getSelectedRecipeIndex()) {
                imageHeight1 += 18;
            } else if (mouseX >= i3 && mouseY >= i4 && mouseX < i3 + 16 && mouseY < i4 + 18) {
                imageHeight1 += 36;
            }

            this.blit(stack, i3, i4 - 1, 0, imageHeight1, 16, 18);
        }
    }

    private void renderRecipes(int offsetLeftPos, int offsetTopPos, int offsetStartIndex) {
        List<TailoringRecipe> tailoringRecipes = this.menu.getRecipes();

        for(int availRecipes = this.startIndex; availRecipes < offsetStartIndex && availRecipes < this.menu.getNumRecipes(); ++availRecipes) {
            int i2 = availRecipes - this.startIndex;
            int i3 = offsetLeftPos + i2 % 4 * 16;
            int i5 = i2 / 4;
            int i4 = offsetTopPos + i5 * 18 + 2;
            if (this.minecraft != null) this.minecraft.getItemRenderer().renderAndDecorateItem(tailoringRecipes.get(availRecipes).getResultItem(), i3, i4);
        }
    }

    @Override
    public boolean mouseClicked(double x, double y, int i) {
        this.scrolling = false;
        if (this.displayRecipes) {
            int offsetLeftPos = this.leftPos + 52;
            int offsetTopPos = this.topPos + 14;
            int offsetStartIndex = this.startIndex + 12;

            for(int buttonID = this.startIndex; buttonID < offsetStartIndex; ++buttonID) {
                int i2 = buttonID - this.startIndex;
                double xMod = x - (double) (offsetLeftPos + i2 % 4 * 16);
                double yMod = y - (double) (offsetTopPos + i2 / 4 * 18);
                if (this.minecraft != null && this.minecraft.player != null) {
                    if (xMod >= 0 && yMod >= 0 && xMod < 16 && yMod < 18 && this.menu.clickMenuButton(this.minecraft.player, buttonID)) {
                        Minecraft.getInstance().getSoundManager().play(SimpleSound.forUI(OTSounds.UI_TAILORING_BENCH_SELECT_ITEM, 1));
                        if (this.minecraft.gameMode != null) this.minecraft.gameMode.handleInventoryButtonClick((this.menu).containerId, buttonID);
                        return true;
                    }
                }
            }

            offsetLeftPos = this.leftPos + 119;
            offsetTopPos = this.topPos + 9;
            if (x >= (double) offsetLeftPos && x < (double) (offsetLeftPos + 12) && y >= (double) offsetTopPos && y < (double) (offsetTopPos + 54)) {
                this.scrolling = true;
            }
        }

        return super.mouseClicked(x, y, i);
    }

    @Override
    public boolean mouseDragged(double x, double y, int i, double d, double d1) {
        if (this.scrolling && this.isScrollBarActive()) {
            int offsetTopPos = this.topPos + 14;
            int ofOfTopPos = offsetTopPos + 54;
            this.scrollOffs = ((float) y - (float) offsetTopPos - 7.5F) / ((float) (ofOfTopPos - offsetTopPos) - 15);
            this.scrollOffs = MathHelper.clamp(this.scrollOffs, 0, 1);
            this.startIndex = (int) ((double) (this.scrollOffs * (float) this.getOffScreenRows()) + 0.5D) * 4;
            return true;
        } else {
            return super.mouseDragged(x, y, i, d, d1);
        }
    }

    @Override
    public boolean mouseScrolled(double x, double y, double d) {
        if (this.isScrollBarActive()) {
            int offScreenRows = this.getOffScreenRows();
            this.scrollOffs = (float) ((double) this.scrollOffs - d / (double) offScreenRows);
            this.scrollOffs = MathHelper.clamp(this.scrollOffs, 0, 1);
            this.startIndex = (int) ((double) (this.scrollOffs * (float) offScreenRows) + 0.5D) * 4;
        }
        return true;
    }

    private boolean isScrollBarActive() {
        return this.displayRecipes && this.menu.getNumRecipes() > 12;
    }

    protected int getOffScreenRows() {
        return (this.menu.getNumRecipes() + 4 - 1) / 4 - 3;
    }

    private void containerChanged() {
        this.displayRecipes = this.menu.hasInputItem();
        if (!this.displayRecipes) {
            this.scrollOffs = 0;
            this.startIndex = 0;
        }
    }
}
