package mainPackage.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSpawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			Location spawn = new Location(player.getWorld(), 11.301, 64, 135.350);
			player.sendMessage(ChatColor.YELLOW + "vous venez de vous tp eu spawn");
			player.teleport(spawn);
		}
		return false;

	}
}