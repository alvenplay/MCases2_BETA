package me.Pawel.MineCases;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class OpenCaseInventory implements Listener {
	Inventory OpenCaseInv;

	@EventHandler()
	public void onRightClick(PlayerInteractEvent e) {
		if(e.getPlayer().getItemInHand() !=null && e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND)){
		//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
			OpenCaseInv = Bukkit.createInventory(null, 27, "§cMine:GO Case");
			{
				OpenCaseInv.setItem(0, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(1, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(2, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(3, Itemy.UnderCaseWool());
				OpenCaseInv.setItem(4, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(5, Itemy.UnderKeyWool());
				OpenCaseInv.setItem(6, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(7, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(8, Itemy.EmptySpaceGlassPanel());
				//---------------------
				OpenCaseInv.setItem(9, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(10, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(11, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(12, new ItemStack(Material.AIR));
				OpenCaseInv.setItem(13, Itemy.StartEmerald());
				OpenCaseInv.setItem(14, new ItemStack(Material.AIR));
				OpenCaseInv.setItem(15, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(16, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(17, Itemy.EmptySpaceGlassPanel());
				//---------------------
				OpenCaseInv.setItem(18, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(19, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(20, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(21, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(22, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(23, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(24, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(25, Itemy.EmptySpaceGlassPanel());
				OpenCaseInv.setItem(26, Itemy.EmptySpaceGlassPanel());
			}
		//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
			e.getPlayer().openInventory(OpenCaseInv);
		}
	}
	
	@EventHandler(ignoreCancelled=false, priority=EventPriority.HIGHEST)
	public void InventoryClick(InventoryClickEvent e){
        if(e.getInventory().getTitle().contains("§cMine:GO Case")){
            if(e.getCurrentItem() == null){
                return;
            }
        	if(e.getCurrentItem().getType().equals(Material.CHEST) || e.getCurrentItem().getType().equals(Material.TRIPWIRE_HOOK) || e.getCurrentItem().getType().equals(Material.AIR)){
        		e.setCancelled(false);
        	} else{
        		e.setCancelled(true);
        	}
        }
	}
}
