package ro.stecker.cheststats;

import com.bergerkiller.bukkit.common.map.MapDisplay;
import com.bergerkiller.bukkit.common.map.MapResourcePack;
import com.bergerkiller.bukkit.common.map.MapTexture;
import com.bergerkiller.bukkit.common.map.util.Model;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MainDisplay extends MapDisplay {
    public void onAttached() {
        createMarker();
        createMarker();
    }

    public void onTick() {
        getLayer(1).drawItem(MapResourcePack.VANILLA, new ItemStack(Material.IRON_BLOCK), 0, 0, 32, 32);
        getLayer(1).drawItem(MapResourcePack.VANILLA, new ItemStack(Material.EMERALD_BLOCK), 32, 0, 32, 32);
        getLayer(1).drawItem(MapResourcePack.VANILLA, new ItemStack(Material.GOLD_BLOCK), 64, 0, 32, 32);
        getLayer(1).drawItem(MapResourcePack.VANILLA, new ItemStack(Material.DIAMOND_BLOCK), 96, 0, 32, 32);
        getLayer(1).drawItem(MapResourcePack.VANILLA, new ItemStack(Material.NETHERITE_BLOCK), 32, 32, 32, 32);
        getLayer(1).drawItem(MapResourcePack.VANILLA, new ItemStack(Material.BEACON), 64, 32, 32, 32);
        getLayer(1).fillItem(MapResourcePack.VANILLA, new ItemStack(Material.BEACON));
    }
}
