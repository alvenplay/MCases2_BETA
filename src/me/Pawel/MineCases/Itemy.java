package me.Pawel.MineCases;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Itemy {
	List<String> lore = Arrays.asList("§7-------------------", "§c Zapraszamy do ZST", "§7-------------------");
	ItemStack ItemStd1() {
		ItemStack Item = new ItemStack(Material.DIAMOND_HELMET, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Diamentowy Helm");
		im.setLore(lore);
		Item.setItemMeta(im);
		return Item;
	}
	ItemStack ItemStd2() {
		ItemStack Item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Diamentowa Klata");
		im.setLore(lore);
		Item.setItemMeta(im);
		return Item;
	}
	ItemStack ItemStd3() {
		ItemStack Item = new ItemStack(Material.DIAMOND_LEGGINGS, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Diamentowe Spodnie");
		im.setLore(lore);
		Item.setItemMeta(im);
		return Item;
	}
	ItemStack ItemStd4() {
		ItemStack Item = new ItemStack(Material.DIAMOND_BOOTS, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Diamentowe Buty");
		im.setLore(lore);
		Item.setItemMeta(im);
		return Item;
	}
	ItemStack ItemStd5() {
		ItemStack Item = new ItemStack(Material.DIAMOND_SWORD, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Diamentowy Miecz");
		im.setLore(lore);
		Item.setItemMeta(im);
		return Item;
	}
	ItemStack ItemStd6() {
		ItemStack Item = new ItemStack(Material.SPONGE, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§dGabka");
		im.setLore(lore);
		Item.setItemMeta(im);
		return Item;
	}
	ItemStack ItemStd7() {
		ItemStack Item = new ItemStack(Material.DRAGON_EGG, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§dJajko smoka");
		im.setLore(lore);
		Item.setItemMeta(im);
		return Item;
	}
	ItemStack ItemStd8() {
		ItemStack Item = new ItemStack(Material.DIRT, 64, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§dSuper Dirt 2000");
		im.setLore(lore);
		Item.setItemMeta(im);
		return Item;
	}
	ItemStack ItemStd9() {
		ItemStack Item = new ItemStack(Material.LEATHER, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§cSkora");
		im.setLore(lore);
		Item.setItemMeta(im);
		return Item;
	}
	ItemStack ItemStd0() {
		ItemStack Item = new ItemStack(Material.DIAMOND_SWORD, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§cSUPER Diamentowy Miecz");
		im.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		im.setLore(lore);
		Item.setItemMeta(im);
		return Item;
	}
	static ItemStack EmptySpaceGlassPanel() {
		ItemStack Item = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName(" ");
		Item.setItemMeta(im);
		return Item;
	}
	static ItemStack WonItemSelector() {
		ItemStack Item = new ItemStack(Material.WOOL, 1, (short) 14);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§cWygrany przedmiot.");
		Item.setItemMeta(im);
		return Item;
	}
	static ItemStack BorderGlassPanel() {
		ItemStack Item = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName(" ");
		Item.setItemMeta(im);
		return Item;
	}
	static ItemStack StartEmerald() {
		ItemStack Item = new ItemStack(Material.EMERALD_BLOCK, 1);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§cKliknij aby zaczac losowanie.");
		Item.setItemMeta(im);
		return Item;
	}
	static ItemStack UnderKeyWool() {
		ItemStack Item = new ItemStack(Material.WOOL, 1, (short) 5);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§cNizej postaw Mine:Key");
		Item.setItemMeta(im);
		return Item;
	}
	static ItemStack UnderCaseWool() {
		ItemStack Item = new ItemStack(Material.WOOL, 1, (short) 14);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§cNizej postaw Mine:Case");
		Item.setItemMeta(im);
		return Item;
	}
	static ItemStack Chest() {
		ItemStack Item = new ItemStack(Material.CHEST, 1);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§cMine:Case Case");
		Item.setItemMeta(im);
		return Item;
	}
	static ItemStack JoinChest() {
		ItemStack Item = new ItemStack(Material.CHEST, 64);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§cMine:Case Case");
		Item.setItemMeta(im);
		return Item;
	}
	static ItemStack Key() {
		ItemStack Item = new ItemStack(Material.TRIPWIRE_HOOK, 1);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§cMine:Case Key");
		Item.setItemMeta(im);
		return Item;
	}
	static ItemStack JoinKey() {
		ItemStack Item = new ItemStack(Material.TRIPWIRE_HOOK, 64);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§cMine:Case Key");
		Item.setItemMeta(im);
		return Item;
	}
}