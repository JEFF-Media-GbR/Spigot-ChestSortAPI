package de.jeff_media.chestsort;

import de.jeff_media.ChestSort.ChestSortPlugin;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ChestSortAPI {

    private static void checkForChestSort() {
        if(ChestSortPlugin.getInstance() == null) {
            throw new IllegalStateException("ChestSort is not installed or enabled or the installed version is too old.");
        }
    }

    /**
     * Sorts any given inventory
     * @param inv Inventory to be sorted
     */
    public static void sortInventory(Inventory inv) {
        checkForChestSort();
        ChestSortPlugin.getInstance().organizer.sortInventory(inv);
    }

    /**
     * Sorts any given inventory between startSlot and endSlot
     * @param inv Inventory to be sorted
     * @param startSlot First slot
     * @param endSlot Last slot
     */
    public static void sortInventory(Inventory inv, int startSlot, int endSlot) {
        checkForChestSort();
        ChestSortPlugin.getInstance().organizer.sortInventory(inv, startSlot, endSlot);
    }

    /**
     * Checks if a player has automatic sorting enabled
     * @param p Player to check
     * @return true if the player has automatic sorting enabled
     */
    public static boolean sortingEnabled(Player p) {
        checkForChestSort();
        return ChestSortPlugin.getInstance().isSortingEnabled(p);
    }

    /**
     * Returns running ChestSort version, e.g. "8.19.0"
     * @return ChestSort version string
     */
    public static String getChestSortVersion() {
        checkForChestSort();
        return ChestSortPlugin.getInstance().getDescription().getVersion();
    }

    public static String getChestSortAPIVersion() {
        return "3.0.0";
    }


}
