package de.jeff_media.chestsort.api;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Public class that can be used as InventoryHolder to tell ChestSort that the associated inventory is sortable.
 *
 * @deprecated Use {@link ChestSortAPI#setSortable(Inventory)} instead
 */
@Deprecated
public class Sortable implements ISortable {

    public Sortable() {

    }

    public Sortable(InventoryHolder h) {

    }

    public void removeHolder() {

    }

    @Nullable
    public InventoryHolder getHolder() {
        return null;
    }

    public void setHolder(@NotNull InventoryHolder player) {

    }

    @Override
    public Inventory getInventory() {
        return null;
    }

    public void setInventory(Inventory inv) {

    }
}
