package ro.stecker.cheststats;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("Hello World");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
