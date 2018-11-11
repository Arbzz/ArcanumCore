package me.syncnationhd.arc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements org.bukkit.command.CommandExecutor
{
  public Fly() {}
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (((sender instanceof Player)) && (sender.hasPermission("arcanum.fly"))) {
      Player p = (Player)sender;
      if (p.getAllowFlight())
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b[Fly] Toggled fly mode to disabled!"));
      if (!p.getAllowFlight())
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b[Fly] Toggled fly mode to enabled!"));
      p.setAllowFlight(!p.getAllowFlight());
    } else {
      sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c[Error] You do not have the required permission to run this command! "));
    }
    return false;
  }
}
