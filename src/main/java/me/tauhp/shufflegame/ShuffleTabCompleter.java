package me.tauhp.shufflegame;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShuffleTabCompleter implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (!(sender instanceof Player)) {
            return null;
        }

        if (args.length == 1) {
            // Seznam podpříkazů pro automatické dokončování
            List<String> subCommands = Arrays.asList("settings", "start", "stop", "join", "leave", "pause");
            List<String> completions = new ArrayList<>();

            for (String subCommand : subCommands) {
                if (subCommand.startsWith(args[0].toLowerCase())) {
                    completions.add(subCommand);
                }
            }

            return completions;
        }

        return null;
    }


}
