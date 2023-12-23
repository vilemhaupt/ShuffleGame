package me.tauhp.shufflegame;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ShuffleCommand implements CommandExecutor {

    private final ShuffleGame plugin;

    public ShuffleCommand(ShuffleGame plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
}
