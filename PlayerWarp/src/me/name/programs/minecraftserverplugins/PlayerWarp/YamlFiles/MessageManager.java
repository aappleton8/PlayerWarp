package me.name.programs.minecraftserverplugins.PlayerWarp.YamlFiles;

import me.name.programs.minecraftserverplugins.PlayerWarp.MainClasses.PlayerWarp;

public class MessageManager extends JConfig {
	
	public MessageManager(PlayerWarp instance, String fileName) {
		super(instance, fileName); 
	}
	
	public MessageManager(PlayerWarp instance, String outFileName, String inFileName) {
		super(instance, outFileName, inFileName); 
	}
	
	public Boolean sendMessage() {
		return null;
		
	}
	
}
