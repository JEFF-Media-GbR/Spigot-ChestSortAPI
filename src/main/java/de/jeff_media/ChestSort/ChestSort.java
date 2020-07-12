package de.jeff_media.ChestSort;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public interface ChestSort {

    /**
     * Gets the ChestSortAPI instance
     * @return Instance of ChestSortAPI
     */
    public ChestSortAPI getAPI();

    /**
     * Gets the ChestSort instance
     * @return Instance of ChestSort
     */
    public ChestSort getInstance();

    /**
     * Use #getAPI() instead
     * @param inv
     */
    @Deprecated
    public void sortInventory(Inventory inv);

    /**
     * Use #getAPI() instead
     * @param inv
     * @param startSlot
     * @param endSlot
     */
    @Deprecated
    public void sortInventory(Inventory inv, int startSlot, int endSlot);

    /**
     * Use #getAPI() instead
     * @param p
     * @return
     */
    @Deprecated
    public boolean sortingEnabled(Player p);
}
