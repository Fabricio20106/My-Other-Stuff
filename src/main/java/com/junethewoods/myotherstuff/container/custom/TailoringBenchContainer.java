package com.junethewoods.myotherstuff.container.custom;

import com.google.common.collect.Lists;
import com.junethewoods.myotherstuff.container.OTContainerTypes;
import com.junethewoods.myotherstuff.crafting.OTRecipeSerializers;
import com.junethewoods.myotherstuff.crafting.custom.TailoringRecipe;
import com.junethewoods.myotherstuff.sound.OTSounds;
import com.junethewoods.myotherstuff.util.OTTags;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftResultInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.IntReferenceHolder;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class TailoringBenchContainer extends Container {
    private final IWorldPosCallable access;
    private final IntReferenceHolder selectedRecipeIndex = IntReferenceHolder.standalone();
    private final World level;
    private List<TailoringRecipe> recipes = Lists.newArrayList();
    private ItemStack input = ItemStack.EMPTY;
    private long lastSoundTime;
    final Slot inputSlot;
    final Slot resultSlot;
    private Runnable slotUpdateListener = () -> {};
    public final IInventory container = new Inventory(1) {
        public void setChanged() {
            super.setChanged();
            TailoringBenchContainer.this.slotsChanged(this);
            TailoringBenchContainer.this.slotUpdateListener.run();
        }
    };
    private final CraftResultInventory resultContainer = new CraftResultInventory();

    public TailoringBenchContainer(int id, PlayerInventory inventory) {
        this(id, inventory, IWorldPosCallable.NULL);
    }

    public TailoringBenchContainer(int id, PlayerInventory inventory, final IWorldPosCallable access) {
        super(OTContainerTypes.TAILORING_BENCH.get(), id);
        this.access = access;
        this.level = inventory.player.level;
        this.inputSlot = this.addSlot(new Slot(this.container, 0, 20, 33));
        this.resultSlot = this.addSlot(new Slot(this.resultContainer, 1, 143, 33) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return false;
            }

            @Override
            public ItemStack onTake(PlayerEntity player, ItemStack stack) {
                stack.onCraftedBy(player.level, player, stack.getCount());
                TailoringBenchContainer.this.resultContainer.awardUsedRecipes(player);
                ItemStack itemstack = TailoringBenchContainer.this.inputSlot.remove(1);
                if (!itemstack.isEmpty()) {
                    TailoringBenchContainer.this.setupResultSlot();
                }

                access.execute((world, pos) -> {
                    long gameTime = world.getGameTime();
                    if (TailoringBenchContainer.this.lastSoundTime != gameTime) {
                        world.playSound(null, pos, OTSounds.UI_TAILORING_BENCH_TAKE_RESULT, SoundCategory.BLOCKS, 1, 1);
                        TailoringBenchContainer.this.lastSoundTime = gameTime;
                    }
                });
                return super.onTake(player, stack);
            }
        });

        for(int width = 0; width < 3; ++width) {
            for(int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(inventory, j + width * 9 + 9, 8 + j * 18, 84 + width * 18));
            }
        }

        for(int height = 0; height < 9; ++height) {
            this.addSlot(new Slot(inventory, height, 8 + height * 18, 142));
        }

        this.addDataSlot(this.selectedRecipeIndex);
    }

    @OnlyIn(Dist.CLIENT)
    public int getSelectedRecipeIndex() {
        return this.selectedRecipeIndex.get();
    }

    @OnlyIn(Dist.CLIENT)
    public List<TailoringRecipe> getRecipes() {
        return this.recipes;
    }

    @OnlyIn(Dist.CLIENT)
    public int getNumRecipes() {
        return this.recipes.size();
    }

    @OnlyIn(Dist.CLIENT)
    public boolean hasInputItem() {
        return this.inputSlot.hasItem() && !this.recipes.isEmpty();
    }

    @Override
    public boolean stillValid(PlayerEntity player) {
        return stillValid(this.access, player);
    }

    public static boolean stillValid(IWorldPosCallable access, PlayerEntity player) {
        return access.evaluate((world, pos) -> world.getBlockState(pos).is(OTTags.Blocks.TAILORING_BENCHES) && player.distanceToSqr((double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D) <= 64,
                true);
    }

    public boolean clickMenuButton(PlayerEntity player, int index) {
        if (this.isValidRecipeIndex(index)) {
            this.selectedRecipeIndex.set(index);
            this.setupResultSlot();
        }

        return true;
    }

    private boolean isValidRecipeIndex(int recipes) {
        return recipes >= 0 && recipes < this.recipes.size();
    }

    public void slotsChanged(IInventory inventory) {
        ItemStack inputStack = this.inputSlot.getItem();
        if (inputStack.getItem() != this.input.getItem()) {
            this.input = inputStack.copy();
            this.setupRecipeList(inventory, inputStack);
        }
    }

    private void setupRecipeList(IInventory inventory, ItemStack stack) {
        this.recipes.clear();
        this.selectedRecipeIndex.set(-1);
        this.resultSlot.set(ItemStack.EMPTY);
        if (!stack.isEmpty()) this.recipes = this.level.getRecipeManager().getRecipesFor(OTRecipeSerializers.TAILORING_RECIPE, inventory, this.level);
    }

    private void setupResultSlot() {
        if (!this.recipes.isEmpty() && this.isValidRecipeIndex(this.selectedRecipeIndex.get())) {
            TailoringRecipe tailoringRecipe = this.recipes.get(this.selectedRecipeIndex.get());
            this.resultContainer.setRecipeUsed(tailoringRecipe);
            this.resultSlot.set(tailoringRecipe.assemble(this.container));
        } else {
            this.resultSlot.set(ItemStack.EMPTY);
        }
        this.broadcastChanges();
    }

    public ContainerType<?> getType() {
        return OTContainerTypes.TAILORING_BENCH.get();
    }

    @OnlyIn(Dist.CLIENT)
    public void registerUpdateListener(Runnable runnable) {
        this.slotUpdateListener = runnable;
    }

    public boolean canTakeItemForPickAll(ItemStack stack, Slot slot) {
        return slot.container != this.resultContainer && super.canTakeItemForPickAll(stack, slot);
    }

    public ItemStack quickMoveStack(PlayerEntity player, int iSlot) {
        ItemStack emptyStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(iSlot);
        if (slot != null && slot.hasItem()) {
            ItemStack slotStack = slot.getItem();
            Item slotItem = slotStack.getItem();
            emptyStack = slotStack.copy();
            if (iSlot == 1) {
                slotItem.onCraftedBy(slotStack, player.level, player);
                if (!this.moveItemStackTo(slotStack, 2, 38, true)) {
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(slotStack, emptyStack);
            } else if (iSlot == 0) {
                if (!this.moveItemStackTo(slotStack, 2, 38, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (this.level.getRecipeManager().getRecipeFor(IRecipeType.STONECUTTING, new Inventory(slotStack), this.level).isPresent()) {
                if (!this.moveItemStackTo(slotStack, 0, 1, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (iSlot >= 2 && iSlot < 29) {
                if (!this.moveItemStackTo(slotStack, 29, 38, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (iSlot >= 29 && iSlot < 38 && !this.moveItemStackTo(slotStack, 2, 29, false)) {
                return ItemStack.EMPTY;
            }

            if (slotStack.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            }

            slot.setChanged();
            if (slotStack.getCount() == emptyStack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(player, slotStack);
            this.broadcastChanges();
        }

        return emptyStack;
    }

    public void removed(PlayerEntity player) {
        super.removed(player);
        this.resultContainer.removeItemNoUpdate(1);
        this.access.execute((world, pos) -> this.clearContainer(player, player.level, this.container));
    }
}
