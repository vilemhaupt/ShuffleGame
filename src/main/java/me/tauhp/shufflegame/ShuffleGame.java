package me.tauhp.shufflegame;

import org.bukkit.plugin.java.JavaPlugin;

public final class ShuffleGame extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        getLogger().info("Plugin ShuffleGame has been enabled");
        getCommand("shufflegame").setExecutor(new ShuffleCommand(this));
        getServer().getPluginManager().registerEvents(new BlockShuffleEvents(this), this);
        getServer().getPluginManager().registerEvents(new ItemShuffleEvents(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin ShuffleGame has been disabled");
    }
}
