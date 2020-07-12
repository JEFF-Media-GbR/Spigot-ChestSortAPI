package de.jeff_media.ChestSortAPI;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public interface ChestSort {

    /**
     * Gets the ChestSortAPI instance
     *
     * @return Instance of ChestSortAPI
     */
    public ChestSortAPI getAPI();

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
