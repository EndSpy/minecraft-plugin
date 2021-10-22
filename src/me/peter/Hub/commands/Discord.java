package me.peter.Hub.commands;

import me.peter.Hub.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Discord implements CommandExecutor {

	@SuppressWarnings("unused")
	private Main plugin;
	
	public Discord(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("Discord").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	//	if(!(sender instanceof Player)) {
		//	sender.sendMessage(ChatColor.RED + "Only players can run this command!");
			//return true;
		//}
		Player p = (Player) sender;
		
		if (p.hasPermission("AdminCommand.use")) {
			p.sendMessage(ChatColor.GREEN + "Discord: " + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + "https://www.discord.gg/actioncraft" + p.getName());
			return true;
		} else {
			p.sendMessage(ChatColor.RED + "You do not have permission to run this command");
			p.sendMessage(ChatColor.GREEN + "Discord: " + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + "https://www.discord.gg/actioncraft" + p.getName());
		}
		return false;
	}
}
