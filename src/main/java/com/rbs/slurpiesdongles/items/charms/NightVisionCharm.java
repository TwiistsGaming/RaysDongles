package com.rbs.slurpiesdongles.items.charms;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class NightVisionCharm extends CharmBase {
    public NightVisionCharm (String name, Properties properties) {
        super(properties, name);
    }

    @Override
    public void onTick(ItemStack stack, EntityPlayer living) {

    }

    @Override
    public boolean onTick(ItemStack stack, EntityPlayer living, World world) {
        if (!this.canTick(stack)) {
            living.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 600, 0, false, false));
        }
        return false;
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TextComponentString("Having this item in your inventory grants you Night Vision"));
    }
}
