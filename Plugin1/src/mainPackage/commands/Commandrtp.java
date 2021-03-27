package mainPackage.commands;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandrtp implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			if(sender instanceof Player) {
			
				Random random = new Random();
				Player player = (Player) sender;
				Location ploc = player.getLocation();
				Location spawn = new Location(player.getWorld(), ploc.getX() + random.nextInt(100), ploc.getY(), ploc.getZ() + random.nextInt(100));
				player.sendMessage(ChatColor.YELLOW + "vous venez de vous tp aléatoirement");
				player.teleport(spawn);
		}
		return false;
	}

}
