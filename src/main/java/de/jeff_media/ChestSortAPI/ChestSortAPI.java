package de.jeff_media.ChestSortAPI;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

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
}
