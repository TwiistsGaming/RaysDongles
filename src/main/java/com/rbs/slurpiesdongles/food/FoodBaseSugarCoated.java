package com.rbs.slurpiesdongles.food;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class FoodBaseSugarCoated extends ItemFood {
    public FoodBaseSugarCoated(int amount, float saturation, boolean isWolfFood, String name, Item.Properties builder) {
        super(amount, saturation, isWolfFood, builder);

        this.setAlwaysEdible();
        this.setRegistryName(Reference.MODID, name);
        ModFood.FOODS.add(this);
    }
    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            if (stack.getCount() > 0) {
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1200, 0));
            } else {
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1200, 0));

            }
        }
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TextComponentString("Combine with blender to make a slushie : Also eating this grants speed for a minute"));
    }
}