package me.syncnationhd.arc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

public class Heal implements org.bukkit.command.CommandExecutor
{
  public Heal() {}
  
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    if (((sender instanceof Player)) && (sender.hasPermission("arcanum.heal"))) {
      Player p = (Player)sender;
      p.setHealth(20.0D);
      for (PotionEffect pe : p.getActivePotionEffects())
        p.removePotionEffect(pe.getType());
      p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bYour hearts were set to full"));
    } else {
      sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c[Error] You do not have the required permission to run this command! "));
    }
    return false;
  }
}
