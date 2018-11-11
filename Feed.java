package me.syncnationhd.arc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements org.bukkit.command.CommandExecutor
{
  public Feed() {}
  
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    if (((sender instanceof Player)) && (sender.hasPermission("arcanum.feed"))) {
      Player p = (Player)sender;
      p.setFoodLevel(20);
      p.setSaturation(20.0F);
      p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bYour hunger level was set to full"));
    } else {
      sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c[Error] You do not have the required permission to run this command! "));
    }
    return false;
  }
}
