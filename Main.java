package me.syncnationhd.arc;

import org.bukkit.command.PluginCommand;

public class Main extends org.bukkit.plugin.java.JavaPlugin {
  public Main() {}
  
  public void onEnable() {
    getConfig().options().copyDefaults(true);
    saveDefaultConfig();
    getCommand("arcanum").setExecutor(new Admin());
    getCommand("feed").setExecutor(new Feed());
    getCommand("heal").setExecutor(new Heal());
    getCommand("help").setExecutor(new Help(this));
    getCommand("fly").setExecutor(new Fly());
    getCommand("chatclear").setExecutor(new ChatClear(this));
    getCommand("enchant").setExecutor(new Enchant());
    getCommand("survival").setExecutor(new SurvivalGM(this));
    getCommand("creative").setExecutor(new CreativeGM(this));
    getCommand("adventure").setExecutor(new AdventureGM(this));
    getCommand("spectator").setExecutor(new SpectatorGM(this));
  }
}
