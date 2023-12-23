package me.tauhp.shufflegame;

import org.bukkit.plugin.java.JavaPlugin;

public final class ShuffleGame extends JavaPlugin {

    @Override
    public void onEnable() {

        saveDefaultConfig();
        getCommand("shufflegame").setExecutor(new ShuffleCommand(this));
        getServer().getPluginManager().registerEvents(new BlockShuffleEvents(this), this);
        getServer().getPluginManager().registerEvents(new ItemShuffleEvents(this), this);

        getLogger().info("Plugin ShuffleGame has been enabled");
    }

    @Override
    public void onDisable() {

        getLogger().info("Plugin ShuffleGame has been disabled");
    }
}
