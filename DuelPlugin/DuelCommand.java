package DuelPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DuelCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("duel")) {
            if (args.length == 1 && args[0].equalsIgnoreCase("start")) {
                // Code pour lancer un duel
                return true; // Vous devez renvoyer true pour indiquer que la commande a été gérée.
            } else if (args.length == 1 && args[0].equalsIgnoreCase("join")) {
                // Code pour rejoindre un duel
                return true;
            } else {
                sender.sendMessage("Usage: /duel start|join");
                return true;
            }
        }
        return false;
    }
}

