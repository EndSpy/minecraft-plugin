package me.peter.Hub;

import me.peter.Hub.commands.Discord;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void OnEnable() {
	new Discord(this);
	}
}