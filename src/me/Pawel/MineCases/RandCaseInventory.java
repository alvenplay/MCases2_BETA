package me.Pawel.MineCases;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class RandCaseInventory implements Listener {
	HashMap<Integer, ItemStack> cache = new HashMap<Integer, ItemStack>();
	private int TaskID;
	Inventory RandCaseInv;
	Inventory RetuCaseInv;
	Player p;
	
	@EventHandler(ignoreCancelled=false, priority=EventPriority.HIGHEST)
	public boolean InventoryClick(InventoryClickEvent e){
		p = (Player) e.getWhoClicked();
		ItemStack item = null;
		RandGenerator Rand = new RandGenerator();
		Itemy items = new Itemy();
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		CheckItems:{
			if(e.getInventory().getTitle().contains("§cMine:GO Case") && e.getCurrentItem().getType().equals(Material.EMERALD_BLOCK)){
	        	try{
					if(e.getInventory().getItem(12).getType().equals(Material.CHEST)
							&& e.getInventory().getItem(14).getType().equals(Material.TRIPWIRE_HOOK)){
						int chest = e.getInventory().getItem(12).getAmount();
						int key = e.getInventory().getItem(14).getAmount();

						if(chest == 1 && key == 1){
							e.getInventory().setItem(12, new ItemStack(Material.AIR));
							e.getInventory().setItem(14, new ItemStack(Material.AIR));
							p.sendMessage("§cLosowanie...");
							break CheckItems;
						} else {
							chest--;
							key--;
							
							e.getInventory().setItem(12, new ItemStack(Material.AIR));
							e.getInventory().setItem(14, new ItemStack(Material.AIR));
							
							if(chest != 0)
								p.getInventory().addItem(new ItemStack(Material.CHEST, chest));
							if(key != 0)
								p.getInventory().addItem(new ItemStack(Material.TRIPWIRE_HOOK, key));
							p.sendMessage("§cLosowanie...");
							break CheckItems;
						}
					}
	        	}catch(NullPointerException Exc){
	        		p.sendMessage(ChatColor.RED +"Brak skrzyni lub klucza.");
	        		return true;
	        	}
			}
			return true;
		}
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		RandCaseInv = Bukkit.createInventory(null, 27, "§cMine Case - LOSOWANIE");
		{
			RandCaseInv.setItem(0, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(1, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(2, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(3, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(4, Itemy.WonItemSelector());
			RandCaseInv.setItem(5, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(6, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(7, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(8, Itemy.EmptySpaceGlassPanel());
			//---------------------
			RandCaseInv.setItem(9, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(10, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(11, new ItemStack(Material.AIR));
			RandCaseInv.setItem(12, new ItemStack(Material.AIR));
			RandCaseInv.setItem(13, new ItemStack(Material.AIR));
			RandCaseInv.setItem(14, new ItemStack(Material.AIR));
			RandCaseInv.setItem(15, new ItemStack(Material.AIR));
			RandCaseInv.setItem(16, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(17, Itemy.EmptySpaceGlassPanel());
			//---------------------
			RandCaseInv.setItem(18, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(19, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(20, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(21, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(22, Itemy.WonItemSelector());
			RandCaseInv.setItem(23, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(24, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(25, Itemy.EmptySpaceGlassPanel());
			RandCaseInv.setItem(26, Itemy.EmptySpaceGlassPanel());
		}
		p.openInventory(RandCaseInv);
		RetuCaseInv = Bukkit.createInventory(null, 27, "§cMine Case - WYNIKI");
		{
			RetuCaseInv.setItem(0, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(1, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(2, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(3, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(4, Itemy.WonItemSelector());
			RetuCaseInv.setItem(5, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(6, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(7, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(8, Itemy.EmptySpaceGlassPanel());
			//---------------------
			RetuCaseInv.setItem(9, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(10, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(11, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(12, Itemy.BorderGlassPanel());
			RetuCaseInv.setItem(13, new ItemStack(Material.AIR));
			RetuCaseInv.setItem(14, Itemy.BorderGlassPanel());
			RetuCaseInv.setItem(15, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(16, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(17, Itemy.EmptySpaceGlassPanel());
			//---------------------
			RetuCaseInv.setItem(18, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(19, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(20, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(21, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(22, Itemy.BorderGlassPanel());
			RetuCaseInv.setItem(23, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(24, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(25, Itemy.EmptySpaceGlassPanel());
			RetuCaseInv.setItem(26, Itemy.EmptySpaceGlassPanel());
		}
		for(int i = 0; i<=30; i++){
			int rand = Rand.Rand(1, 10);
			switch(rand){
				case 1:
					item = items.ItemStd1();
					break;
				case 2:
					item = items.ItemStd2();
					break;
				case 3:
					item = items.ItemStd3();
					break;
				case 4:
					item = items.ItemStd4();
					break;
				case 5:
					item = items.ItemStd5();
					break;
				case 6:
					item = items.ItemStd6();
					break;
				case 7:
					item = items.ItemStd7();
					break;
				case 8:
					item = items.ItemStd8();
					break;
				case 9:
					item = items.ItemStd9();
					break;
				case 10:
					item = items.ItemStd0();
					break;
			}
			cache.put(i, item);
		}
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		TaskID = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.getInst(), new BukkitRunnable() {
					int i = 0;
					public void run() {
						System.out.println("Los " +i +" = " +cache.get(i));
						RandCaseInv.setItem(15, cache.get(i));
						RandCaseInv.setItem(14, cache.get(i-1));
						RandCaseInv.setItem(13, cache.get(i-2));
						RandCaseInv.setItem(12, cache.get(i-3));
						RandCaseInv.setItem(11, cache.get(i-4));
						i++;
						if(i > 30){
							Bukkit.getServer().getScheduler().cancelTask(TaskID);
							Bukkit.getScheduler().runTaskLater(Main.getInst(), new Runnable(){
								public void run(){
									p.openInventory(RetuCaseInv);
									RetuCaseInv.setItem(13, cache.get(28));
									p.getInventory().addItem(cache.get(28));
									cache.clear();
								}
							}, 2*20);
						}
					}
				}, 0, (int) (0.5*20));
		return true;
	}
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	@EventHandler()
	public void RandCaseInv(InventoryClickEvent e){
		if(e.getInventory().getTitle().contains("§cMine Case - LOSOWANIE") || e.getInventory().getTitle().contains("§cMine Case - WYNIKI")){
    		e.setCancelled(true);
            if(e.getCurrentItem() == null){
                return;
            }
        }
	}
}