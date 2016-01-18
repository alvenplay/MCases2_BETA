package me.Pawel.MineCases;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class OnJoin implements Listener {
	Player p;
	@EventHandler()
	public void onJoin(PlayerJoinEvent e) {
		p = (Player) e.getPlayer();
		p.getInventory().clear();
		p.getInventory().addItem(new ItemStack(Material.DIAMOND, 1));
		p.getInventory().addItem(Itemy.JoinChest());
		p.getInventory().addItem(Itemy.JoinKey());
		p.setAllowFlight(true);
		p.setFlying(true);
		
		
		
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.getInst(), new BukkitRunnable() {
			public void run() {
				p.setFoodLevel(20);;
				p.setHealth(20);
			}
		}, 0, (int) (5*20));
	}
}
