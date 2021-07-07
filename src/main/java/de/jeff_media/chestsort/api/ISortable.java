package de.jeff_media.chestsort.api;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

/**
 * Public interface that can be used as InventoryHolder to tell ChestSort that the associated inventory is sortable.
 *
 * @deprecated Use {@link ChestSortAPI#setSortable(Inventory)} instead
 */
public interface ISortable extends InventoryHolder {

}
