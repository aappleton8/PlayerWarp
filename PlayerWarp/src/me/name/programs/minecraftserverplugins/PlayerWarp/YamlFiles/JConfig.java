package me.name.programs.minecraftserverplugins.PlayerWarp.YamlFiles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bukkit.ChatColor;

import me.name.programs.minecraftserverplugins.PlayerWarp.MainClasses.PlayerWarp;

public class JConfig extends YamlFilesBase
{
	// JustAFK class 
	private PlayerWarp playerWarpPlugin = null; 
	
	// Config message permission 
	private static final String configPermission = "justafk.config.seemessages"; 
	
	// Constructor 
	public JConfig(PlayerWarp instance, String fileName) {
		this(instance, fileName, fileName); 
	}
	
	public JConfig(PlayerWarp instance, String outFileName, String inFileName) {
		super(instance, instance.getLogger(), outFileName, inFileName);
		playerWarpPlugin = instance; 
		saveNewFile(); 
	}
	
	// Abstract method definitions 
	@Override
	protected void saveNewFile() {
		save(); 
		logger.info("Configuration file " + theOutFile.getName() + " loaded "); 
		configList.put(theOutFile.getName(), this); 
	}

	@Override
	public void fullReload() {
		reload(false); 
		if (playerWarpPlugin == null) {
			logger.warning("The configuration manager could not find the main plugin file");
			JUtility.serverMsgPlaceholder(ChatColor.GREEN + plugin.getDescription().getName() + " : " + theOutFile.getName() + " configuration reloaded ", configPermission, null); 
		}
		else {
			JUtility.serverMsgPlaceholder(JUtility.updateMessagePlaceholders("conf", theOutFile.getName(), JUtility.updatePluginVersionMessages(JPlugin.language.getSettingString("conf_reload"))), configPermission, null);
		}
	}

	@Override
	public void fullSave() {
		Boolean saved = save(); 
		if (saved == true) {
			if (playerWarpPlugin == null) {
				logger.warning("The configuration manager could not find the main plugin file");
				JUtility.serverMsgPlaceholder(ChatColor.GREEN + plugin.getDescription().getName() + " : " + theOutFile.getName() + " configuration saved ", configPermission, null); 
			}
			else {
				JUtility.serverMsgPlaceholder(JUtility.updateMessagePlaceholders("conf", theOutFile.getName(), JUtility.updatePluginVersionMessages(JPlugin.language.getSettingString("conf_save_success"))), configPermission, null);
			}
		}
		else {
			if (playerWarpPlugin == null) {
				logger.warning("The configuration manager could not find the main plugin file");
				JUtility.serverMsgPlaceholder(ChatColor.RED + plugin.getDescription().getName() + " : " + theOutFile.getName() + " configuration could not be saved ", configPermission, null); 
			}
			else {
				JUtility.serverMsgPlaceholder(JUtility.updateMessagePlaceholders("conf", theOutFile.getName(), JUtility.updatePluginVersionMessages(JPlugin.language.getSettingString("conf_save_fail"))), configPermission, null);
			}
		}
	}
	
	// Getter definitions 
	public int getSettingInt(String id)
	{
		if (this.configuration.isInt(id))
		{
			return this.configuration.getInt(id);
		}
		else return -1;
	}

	public String getSettingString(String id)
	{
		/*
		if (this.configuration.isString(id))
		{
			return this.configuration.getString(id);
		}
		else return null;
		*/
		return this.configuration.getString(id);
	}
	
	public boolean getSettingBooleanDefault(String id, Boolean def) {
		if (this.configuration.isBoolean(id)) {
			return this.configuration.getBoolean(id, def); 
		}
		else {
			return def; 
		}
	}

	public boolean getSettingBoolean(String id)
	{
		return !this.configuration.isBoolean(id) || this.configuration.getBoolean(id);
	}

	public double getSettingDouble(String id)
	{
		if (this.configuration.isDouble(id))
		{
			return this.configuration.getDouble(id);
		}
		else return -1;
	}

	public List<String> getSettingListString(String id)
	{
		if (this.configuration.isList(id))
		{
			return this.configuration.getStringList(id); 
		}
		else return new ArrayList<String>();
	}
	
	public List<Integer> getSettingListInteger(String id) {
		if (this.configuration.isList(id)) {
			return this.configuration.getIntegerList(id); 
		}
		else return new ArrayList<Integer>(); 
	}
	
	public List<Double> getSettingListDouble(String id) {
		if (this.configuration.isList(id)) {
			return this.configuration.getDoubleList(id); 
		}
		else return new ArrayList<Double>(); 
	}
	
	public List<Boolean> getSettingListBoolean(String id) {
		if (this.configuration.isList(id)) {
			return this.configuration.getBooleanList(id); 
		}
		else return new ArrayList<Boolean>(); 
	}
	
	public Set<String> getSettingConfigurationSectionKeys(String id, Boolean recursive)
	{
		if (this.configuration.contains(id)) {
			return this.configuration.getConfigurationSection(id).getKeys(recursive); 
		}
		else return new HashSet<String>(); 
	}
	
	// Checker definitions 
	public boolean exists(String id) {
		return this.configuration.contains(id); 
	}
	
	// Setter definitions 
	public void setSettingAnyNoCheck(String id, Object o) {
		this.configuration.set(id, o); 
	}

}

