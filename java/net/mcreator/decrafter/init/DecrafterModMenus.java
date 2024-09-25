
package net.mcreator.decrafter.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.decrafter.world.inventory.DecrafterGUIMenu;
import net.mcreator.decrafter.DecrafterMod;

public class DecrafterModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DecrafterMod.MODID);
	public static final RegistryObject<MenuType<DecrafterGUIMenu>> DECRAFTER_GUI = REGISTRY.register("decrafter_gui", () -> IForgeMenuType.create(DecrafterGUIMenu::new));
}
