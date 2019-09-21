package me.name.programs.minecraftserverplugins.PlayerWarp.MainClasses;

import org.bukkit.plugin.java.JavaPlugin;

import me.name.programs.minecraftserverplugins.PlayerWarp.YamlFiles.ConfigManager;
import me.name.programs.minecraftserverplugins.PlayerWarp.YamlFiles.MessageManager;
import me.name.programs.minecraftserverplugins.PlayerWarp.YamlFiles.WarpsManager;

public class PlayerWarp extends JavaPlugin {
	
	public MessageManager language; 
	public ConfigManager options; 
	public WarpsManager warps; 
	
	@Override
	public void onLoad() {
		language = new MessageManager(this, "language.yml"); 
		options = new ConfigManager(this, "config.yml"); 
		warps = new WarpsManager(this, "warps.yml"); 
	}
	
	@Override
	public void onEnable() {
		registerCommands(); 
	}
	
	@Override
	public void onDisable() {
		
	}
	
	private void registerCommands() {
		
	}
	
	public void registerPermissions() {
		
	}
	
}
