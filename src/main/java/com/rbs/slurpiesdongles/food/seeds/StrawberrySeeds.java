package com.rbs.slurpiesdongles.food.seeds;

import com.google.common.collect.Lists;
import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModBlocks;
import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IPlantable;

import java.util.List;

public class StrawberrySeeds extends BlockNamedItem {
    public StrawberrySeeds(String name, Block crop, Properties builder) {
        super(crop, builder);

        this.setRegistryName(Reference.MODID, name);
        ModFood.FOODS.add(this);
    }

    public String getFullName() {
        return getModId() + ":" + getName();
    }


    public String getModId() {
        return Reference.MODID.toLowerCase();
    }

    public List<ModelResourceLocation> getVariants() {
        return Lists.newArrayList(new ModelResourceLocation(getFullName(), "inventory"));
    }
}
