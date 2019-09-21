package me.name.programs.minecraftserverplugins.PlayerWarp.YamlFiles;

import me.name.programs.minecraftserverplugins.PlayerWarp.MainClasses.PlayerWarp;

public class ConfigManager extends JConfig {
	
	public ConfigManager(PlayerWarp instance, String fileName) {
		super(instance, fileName); 
	}

	public ConfigManager(PlayerWarp instance, String outFileName, String inFileName) {
		super(instance, outFileName, inFileName);
	}

}
