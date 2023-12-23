package me.tauhp.shufflegame;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;

public class BlockShuffleEvents implements Listener {

    private final ShuffleGame plugin;
    Utils utils;

    public BlockShuffleEvents(ShuffleGame plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onCommandSend(PlayerCommandSendEvent event) {
        event.getCommands().removeIf(command -> command.contains(":"));
    }

}
