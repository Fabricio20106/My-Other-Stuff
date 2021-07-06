package com.others.blocks;

import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;

public class OtherProperties extends BlockStateProperties {
    public static final BooleanProperty enabled = BooleanProperty.create("enabled");
}
