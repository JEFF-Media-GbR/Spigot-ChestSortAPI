package de.jeff_media.ChestSortAPI;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Public ChestSort API
 */
public interface ChestSortAPI {

    /**
     * Sorts any given inventory
     * @param inv Inventory to be sorted
     */
    public void sortInventory(Inventory inv);

    /**
     * Sorts any given inventory between startSlot and endSlot
     * @param inv Inventory to be sorted
     * @param startSlot First slot
     * @param endSlot Last slot
     */
    public void sortInventory(Inventory inv, int startSlot, int endSlot);

    /**
     * Checks if a player has automatic sorting enabled
     * @param p Player to check
     * @return true if the player has automatic sorting enabled
     */
    public boolean sortingEnabled(Player p);

    /**
     * Returns running ChestSort version, e.g. "8.19.0"
     * @return ChestSort version string
     */
    public String getChestSortVersion();

    /**
     * Returns ChestSortAPI version that the running ChestSort is implementing, e.g. "2.0.0"
     * @return ChestSortAPI version string
     */
    public String getChestSortAPIVersion();
}
