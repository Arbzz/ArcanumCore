package me.syncnationhd.arc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;

public class ChatClear implements Listener, CommandExecutor
{
  private Main plugin;
  
  public ChatClear(Main main)
  {
    plugin = main;
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (!sender.hasPermission("arcanum.chatclear"))
    {
      return true;
    }
    for (int i = 0; i < 75; i++) {
      Bukkit.broadcastMessage("");
    }
    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("chatclear")));
    sender.sendMessage(ChatColor.RED + "You have cleared the chat!" + ChatColor.BOLD);
    
    return true;
  }
}
