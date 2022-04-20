package ro.stecker.cheststats;

import com.bergerkiller.bukkit.common.map.MapDisplay;
import com.bergerkiller.bukkit.common.map.MapResourcePack;
import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.gui.type.util.Gui;
import com.github.stefvanschie.inventoryframework.pane.StaticPane;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static ChestGui mainGui;
    public static StaticPane mainPane;
    public static int[] itemLocation = {0, 0};

    @Override
    public void onEnable() {
        Commands commands = new Commands();
        getLogger().info("Hello World");
        mainGui = new ChestGui(5, "Test");
        mainPane = new StaticPane(0, 0, 9, 5);
        ItemStack itemStack = new ItemStack(MapDisplay.createMapItem(MainDisplay.class));
        mainPane.addItem(new GuiItem(itemStack), 1, 0);
        mainPane.addItem(new GuiItem(new ItemStack(Material.TOTEM_OF_UNDYING, 64)), 0, 0);
        mainGui.addPane(mainPane);
        getCommand("gui").setExecutor(commands);
        getCommand("add-sugar-cane").setExecutor(commands);
        getCommand("add-bedrock").setExecutor(commands);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static void ShowGUI(Player player) {
        mainGui.show(player);
        player.sendMessage("GUI");
    }

    public static void addNewItem(GuiItem item) {
        if(!(itemLocation[1] > mainPane.getHeight())) {
            mainPane.addItem(item, itemLocation[0], itemLocation[1]);
            if (itemLocation[0] < 8)
                itemLocation[0] = itemLocation[0] + 1;
            else {
                itemLocation[0] = 0;
                itemLocation[1] = itemLocation[1] + 1;
            }
        }
    }
}
