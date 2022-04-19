package ro.stecker.cheststats;

import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.gui.type.util.Gui;
import com.github.stefvanschie.inventoryframework.pane.StaticPane;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static ChestGui gui;
    public static StaticPane pane;
    public static int[] itemLocation = {0, 0};
    @Override
    public void onEnable() {
        Commands commands = new Commands();
        getLogger().info("Hello World");
        gui = new ChestGui(5, "Test");
        pane = new StaticPane(0, 0, 9, 5);
        pane.addItem(new GuiItem(new ItemStack(Material.ACACIA_BOAT)), 1, 1);
        gui.addPane(pane);
        getCommand("gui").setExecutor(commands);
        getCommand("add-sugar-cane").setExecutor(commands);
        getCommand("add-bedrock").setExecutor(commands);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static void ShowGUI(Player player) {
        gui.show(player);
        player.sendMessage("GUI");
    }

    public static void addNewItem(GuiItem item) {
        if(!(itemLocation[1] > pane.getHeight())) {
            pane.addItem(item, itemLocation[0], itemLocation[1]);
            if (itemLocation[0] < 8)
                itemLocation[0] = itemLocation[0] + 1;
            else {
                itemLocation[0] = 0;
                itemLocation[1] = itemLocation[1] + 1;
            }
        }
    }

}
