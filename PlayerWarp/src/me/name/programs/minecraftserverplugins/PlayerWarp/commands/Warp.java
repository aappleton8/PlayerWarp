package me.name.programs.minecraftserverplugins.PlayerWarp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import me.name.programs.minecraftserverplugins.PlayerWarp.MainClasses.PlayerWarp;

public class Warp extends CommandBase {

	Warp(PlayerWarp instance) {
		super(instance);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		plugin.warps.getWarp(args[0]); 
		
		return true;
	}
	
	
	
}
