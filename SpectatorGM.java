package me.syncnationhd.arc;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class SpectatorGM implements CommandExecutor
{
  private Main plugin;
  
  public SpectatorGM(Main main)
  {
    plugin = main;
  }
  
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    if (((sender instanceof Player)) && (sender.hasPermission("arcanum.spectator"))) {
      Player p = (Player)sender;
      p.setGameMode(GameMode.SPECTATOR);
      p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("spectator")));
    } else {
      sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c[Error] You do not have the required permission to run this command! "));
    }
    return false;
  }
}
