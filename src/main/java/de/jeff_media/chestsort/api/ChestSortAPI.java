package de.jeff_media.chestsort.api;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Allows access to ChestSort's sorting methods
 */
public class ChestSortAPI {

    /**
     * Sorts the given {@link org.bukkit.inventory.Inventory}
     *
     * @param inventory {@link org.bukkit.inventory.Inventory} to be sorted
     */
    public static void sortInventory(Inventory inventory) {

    }

    /**
     * Sorts the given {@link org.bukkit.inventory.Inventory} from {@param startSlot} to {@param endSlot}
     *
     * @param inventory {@link org.bukkit.inventory.Inventory} to be sorted
     * @param startSlot first slot to be sorted, inclusive
     * @param endSlot   last slot to be sorted, inclusive
     */
    public static void sortInventory(Inventory inventory, int startSlot, int endSlot) {

    }

    /**
     * Checks whether the given {@link org.bukkit.entity.Player} has automatic sorting enabled
     *
     * @param player {@link org.bukkit.entity.Player} to check
     * @return True when this {@link org.bukkit.entity.Player} has sorting enabled, otherwise false
     */
    public static boolean hasSortingEnabled(Player player) {
        return false;
    }

    /**
     * Marks this {@link org.bukkit.inventory.Inventory} as sortable
     *
     * @param inv {@link org.bukkit.inventory.Inventory} that should be marked as sortable
     */
    public static void setSortable(Inventory inv) {

    }

    /**
     * Marks this {@link org.bukkit.inventory.Inventory} as unsortable
     *
     * @param inv {@link org.bukkit.inventory.Inventory} that should be marked as unsortable
     */
    public static void setUnsortable(Inventory inv) {

    }

}