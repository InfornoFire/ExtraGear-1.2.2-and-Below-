package com.inforno.extragear.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;

public class itemWindPickaxe extends ItemPickaxe {
	
	public itemWindPickaxe (ToolMaterial mat) {
		super(mat);
	}
	
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityHit, EntityLivingBase entityUser) {
		entityHit.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 100, 0));
		return true;
	}
	
	//Test
	//public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player, EnumHand hand) {
		//player.addPotionEffect((new PotionEffect(Potion.getPotionById(1), 100, 0)));
		//return new ActionResult (EnumActionResult.SUCCESS, itemStack);
		
	//}
	

}
