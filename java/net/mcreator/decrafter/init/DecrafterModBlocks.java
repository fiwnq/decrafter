
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.decrafter.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.decrafter.block.DecrafterBlock;
import net.mcreator.decrafter.DecrafterMod;

public class DecrafterModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DecrafterMod.MODID);
	public static final RegistryObject<Block> DECRAFTER = REGISTRY.register("decrafter", () -> new DecrafterBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
