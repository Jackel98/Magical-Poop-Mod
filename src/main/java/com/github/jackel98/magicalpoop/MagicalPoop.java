package com.github.jackel98.magicalpoop;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = MagicalPoop.MODID, name = MagicalPoop.NAME, version = MagicalPoop.VERSION)
public class MagicalPoop {
	public static final String MODID = "magicalpoop";
	public static final String NAME = "Magical Poop Mod";
	public static final String VERSION = "1.0";
	
	@Mod.Instance(MODID)
	public static MagicalPoop instance;
}
