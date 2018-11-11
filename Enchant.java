package me.syncnationhd.arc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Enchant implements org.bukkit.command.CommandExecutor
{
  public Enchant() {}
  
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    if (((sender instanceof Player)) && (sender.hasPermission("arcanum.enchant"))) {
      Player p = (Player)sender;
      p.openEnchanting(p.getLocation(), true);
      p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bOpened portable enchant table"));
    } else {
      sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c[Error] You do not have the required permission to run this command! "));
    }
    return false;
  }
}
