package me.Pawel.MineCases;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable(){
		instance = this;

		getServer().getPluginManager().registerEvents(new OpenCaseInventory(), this);
		getServer().getPluginManager().registerEvents(new RandCaseInventory(), this);
		getServer().getPluginManager().registerEvents(new OnJoin(), this);
	}







//---------------------------------------------------------------------
	private static Main instance;

	public static Main getInst() {
		return instance;
	}
//---------------------------------------------------------------------
}