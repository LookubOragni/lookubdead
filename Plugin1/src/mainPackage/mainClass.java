package mainPackage;

import org.bukkit.plugin.java.JavaPlugin;

import mainPackage.commands.CommandSpawn;
import mainPackage.commands.CommandTest;

public class mainClass extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("le seveur vien de s'allumer");
				getCommand("test").setExecutor(new CommandTest());
				getCommand("alert").setExecutor(new CommandTest());
				getCommand("kit").setExecutor(new CommandTest());
				getCommand("plugins").setExecutor(new CommandTest());
				getCommand("Pl").setExecutor(new CommandTest());
				getCommand("spawn").setExecutor(new CommandSpawn());
				getServer().getPluginManager().registerEvents(new MonPluginListeners(), this);
				
	}
	@Override
	public void onDisable() {
		System.out.println("le serveur vien de s'éteindre");
	}
	
	
		
	}

