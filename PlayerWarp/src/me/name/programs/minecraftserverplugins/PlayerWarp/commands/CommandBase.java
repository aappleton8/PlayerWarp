package me.name.programs.minecraftserverplugins.PlayerWarp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.name.programs.minecraftserverplugins.PlayerWarp.MainClasses.PlayerWarp;

public abstract class CommandBase implements CommandExecutor {

	PlayerWarp plugin; 
	
	CommandBase(PlayerWarp instance) {
		plugin = instance; 
	}
	
	public abstract boolean onCommand(CommandSender sender, Command command, String label, String[] args); 
	
}
