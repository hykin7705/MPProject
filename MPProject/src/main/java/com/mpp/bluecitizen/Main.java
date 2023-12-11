package com.mpp.bluecitizen;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("bluecitizen")
public class Main {
	public Main() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
