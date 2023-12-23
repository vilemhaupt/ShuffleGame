    package me.tauhp.shufflegame;



    import org.bukkit.command.Command;
    import org.bukkit.command.CommandExecutor;
    import org.bukkit.command.CommandSender;
    import org.bukkit.entity.Player;

    public class ShuffleCommand implements CommandExecutor {

        private final ShuffleGame plugin;

        Utils utils;

        public ShuffleCommand(ShuffleGame plugin) {
            this.plugin = plugin;
        }



        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("This command can only be run by a player!");
                return true;
            }

            boolean usePermissions = plugin.getConfig().getBoolean("use-permissions");


            Player player = (Player) sender;

            if (args.length == 0) {
                sendAvailableCommands(player);
                return true;
            }

            String subCommand = args[0].toLowerCase();


            if (usePermissions) {
                String permission = "shufflegame.use";


                switch (subCommand) {
                    case "settings":
                        permission = "shufflegame.setup";
                        break;
                    case "start":
                        permission = "shufflegame.start";
                        break;
                    case "stop":
                        permission = "shufflegame.stop";
                        break;
                    case "join":
                        permission = "shufflegame.join";
                        break;
                    case "leave":
                        permission = "shufflegame.leave";
                        break;
                    case "pause":
                        permission = "shufflegame.pause";
                        break;
                    case "skip":
                        permission = "shufflegame.skip";
                        break;
                    default:
                        break;
                }

                // Kontrola oprávnění hráče
                if (!player.hasPermission(permission)) {
                    player.sendMessage("You don't have permission to use this command!");
                    return true;
                }
            }


            switch (subCommand) {
                case "settings":
                    player.sendMessage("Settings command logic goes here.");
                    break;
                case "start":
                    player.sendMessage("Start command logic goes here.");
                    break;
                case "stop":
                    player.sendMessage("Stop command logic goes here.");
                    break;
                case "join":
                    player.sendMessage("Join command logic goes here.");
                    break;
                case "leave":
                    player.sendMessage("Leave command logic goes here.");
                    break;
                case "pause":
                    player.sendMessage("Pause command logic goes here.");
                    break;
                case "skip":
                    player.sendMessage("Skip command logic goes here.");
                    break;
                default:
                    sendAvailableCommands(player);
                    break;
            }

            return true;
        }

        private void sendAvailableCommands(Player player) {
            player.sendMessage(Utils.color("&3&lShuffle&b&lGame"));
            player.sendMessage(Utils.color("&7Author: &aTauhp"));
            player.sendMessage(Utils.color("&7/shufflegame &asettings &r-> &bOpen GUI Settings"));
            player.sendMessage(Utils.color("&7/shufflegame &astart &r-> &bStart game"));
            player.sendMessage(Utils.color("&7/shufflegame &astop &r-> &bStop game"));
            player.sendMessage(Utils.color("&7/shufflegame &ajoin &r-> &bJoin game"));
            player.sendMessage(Utils.color("&7/shufflegame &aleave &r-> &bLeave game"));
            player.sendMessage(Utils.color("&7/shufflegame &apause &r-> &bPause game"));
            player.sendMessage(Utils.color("&7/shufflegame &askip &r-> &bSkip Block/Item"));
        }
    }
