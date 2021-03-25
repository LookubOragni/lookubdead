package mainPackage.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandTest implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
			if(sender instanceof Player){
				Player player = (Player)sender;	
				if(cmd.getName().equalsIgnoreCase("test")){
					player.sendMessage(ChatColor.YELLOW + "tu a passer le test");
							return true;
				}
				if(cmd.getName().equalsIgnoreCase("alert")){
					
					//alert --> pas d'argument
						if(args.length == 0) {
								player.sendMessage("la command est : /alert <message>");
							}
							
					//alert <texte texte texte>
						if(args.length >= 1) {
							StringBuilder bc = new StringBuilder();
							for(String part : args) {
								bc.append(part + " ");
								}
								
							Bukkit.broadcastMessage(ChatColor.BOLD + "[" + player.getName() + "]" + bc.toString()); 
					
								
							}
					
							return true;
					
				}
				if(cmd.getName().equalsIgnoreCase("kit")){
					player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 1));
					player.getInventory().addItem(new ItemStack(Material.DIAMOND_PICKAXE, 1));
					player.getInventory().addItem(new ItemStack(Material.DIAMOND_AXE, 1));
					player.getInventory().addItem(new ItemStack(Material.DIAMOND_HOE, 1));
					player.getInventory().addItem(new ItemStack(Material.DIAMOND_HELMET, 1));
					player.getInventory().addItem(new ItemStack(Material.DIAMOND_CHESTPLATE, 1));
					player.getInventory().addItem(new ItemStack(Material.DIAMOND_LEGGINGS, 1));
					player.getInventory().addItem(new ItemStack(Material.DIAMOND_BOOTS, 1));
			
							return true;	
					}
				
				if(cmd.getName().equalsIgnoreCase("plugins")){
					player.sendMessage(ChatColor.RED + "Vous ne pouvez utiliser cette commande");
				
							return true;
					}
				
				if(cmd.getName().equalsIgnoreCase("pl")){
					player.sendMessage(ChatColor.RED + "Vous ne pouvez utiliser cette commande");
				
							return true;
					}
			
			
			}
				return false;


		}		
}