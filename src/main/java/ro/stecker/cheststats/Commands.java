package ro.stecker.cheststats;

import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static org.bukkit.Bukkit.getLogger;
import static org.bukkit.Bukkit.getServer;
import static ro.stecker.cheststats.Main.ShowGUI;
import static ro.stecker.cheststats.Main.addNewItem;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand( CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)){
            getLogger().warning("You have to be a player to execute this command!");
            return true;
        }
        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("gui"))
            ShowGUI(player);
        if(cmd.getName().equalsIgnoreCase("add-sugar-cane"))
            addNewItem(new GuiItem(new ItemStack(Material.SUGAR_CANE)));
        if(cmd.getName().equalsIgnoreCase("add-bedrock"))
            addNewItem(new GuiItem(new ItemStack(Material.BEDROCK)));
        return true;
    }
}


//    Recipes recipes = new Recipes();
//    @Override
//    public void onEnable() {
//        recipes.compassRecipe();
//        getCommand("gui").setExecutor(this);
//        getCommand("add-sugar-cane").setExecutor(this);
//        getCommand("add-bedrock").setExecutor(this);
//        createGUI();
//        getConfig().options().copyDefaults();
//        saveDefaultConfig();
//    }
//
//    @Override
//    public void onDisable() {
//        // Plugin shutdown logic
//    }
//
//
//    ChestGui mainGUI = new ChestGui(6, "Test GUI");
//    StaticPane mainPane = new StaticPane(0, 0, 9, 6, Pane.Priority.HIGH);
//
//
//    public void createGUI() {
//        mainGUI.addPane(mainPane);
//        mainGUI.setOnGlobalClick(event -> event.setCancelled(true));
//        getConfig().set("MainGuiRows", mainGUI.getRows());
//        getConfig().set("MainGuiTitle", mainGUI.getTitle());
//        getConfig().set("MainPaneX", mainPane.getX());
//        getConfig().set("MainPaneY", mainPane.getY());
//        getConfig().set("MainPaneLength", mainPane.getLength());
//        getConfig().set("MainPaneHeight", mainPane.getHeight());
//    }
//


