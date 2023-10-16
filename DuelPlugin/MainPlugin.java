package DuelPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public class MainPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Le plugin DuelPlugin est activé !");
        // Enregistrez vos gestionnaires d'événements et de commandes ici.
    }

    @Override
    public void onDisable() {
        getLogger().info("Le plugin DuelPlugin est désactivé !");
    }
}
