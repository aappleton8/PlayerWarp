package me.name.programs.minecraftserverplugins.PlayerWarp.YamlFiles;

import me.name.programs.minecraftserverplugins.PlayerWarp.MainClasses.PlayerWarp;

public class PlayerManager extends JConfig {

	public PlayerManager(PlayerWarp instance, String fileName) {
		super(instance, fileName); 
	}
	
	public PlayerManager(PlayerWarp instance, String outFileName, String inFileName) {
		super(instance, outFileName, inFileName);
	}

}
