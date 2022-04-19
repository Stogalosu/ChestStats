package ro.stecker.cheststats;

import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.gui.type.util.Gui;
import com.github.stefvanschie.inventoryframework.pane.StaticPane;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello World");
        ChestGui gui = new ChestGui(5, "Test");
        StaticPane pane = new StaticPane(0, 0, 9, 5);
        pane.addItem(new GuiItem(new ItemStack(Material.ACACIA_BOAT)), 1, 1);
        gui.addPane(pane);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
