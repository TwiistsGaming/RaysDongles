package com.rbs.slurpiesdongles.armor;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModArmor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SapphireArmor extends ItemArmor {
    public SapphireArmor(String name, IArmorMaterial materialIn, EntityEquipmentSlot slots, Item.Properties builder) {
        super(materialIn, slots, builder);

        this.setRegistryName(Reference.MODID, name);
        ModArmor.ARMORS.add(this);

    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot equipmentSlotIn, String layer) {
        if (equipmentSlotIn != EntityEquipmentSlot.LEGS) {
            return "slurpiesdongles:textures/models/armor/sapphire_layer_1.png";
        } else {
            return "slurpiesdongles:textures/models/armor/sapphire_layer_2.png";
        }
    }
}