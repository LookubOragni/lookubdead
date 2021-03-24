package mainPackage;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MonPluginListeners implements Listener {
	
	@EventHandler
	public void onjoin(PlayerJoinEvent depart) {
		
		Player player = depart.getPlayer();
		player.getInventory().clear();
		player.getInventory().addItem(new ItemStack(Material.IRON_SWORD, 3));
		
		ItemStack customsword = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta customM = customsword.getItemMeta();
		customM.setDisplayName("my super sword");
		customM.setLore(Arrays.asList("l'épée a tom"));
		customM.addEnchant(Enchantment.FIRE_ASPECT, 20000, true);
		customM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		customsword.setItemMeta(customM);
		player.getInventory().setItemInHand(customsword);
		
		player.updateInventory();
		
		
		}

	
	}
