package me.name.programs.minecraftserverplugins.PlayerWarp.YamlFiles;

import org.bukkit.Location;

import me.name.programs.minecraftserverplugins.PlayerWarp.MainClasses.PlayerWarp;

public class WarpsManager extends JConfig {
	
	public WarpsManager(PlayerWarp instance, String fileName) {
		super(instance, fileName);
	}
	
	public WarpsManager(PlayerWarp instance, String outFileName, String inFileName) {
		super(instance, outFileName, inFileName); 
	}
	
	public Location getWarp(String name) {
		return null;
		
	}

}
