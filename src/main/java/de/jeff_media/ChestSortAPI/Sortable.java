package de.jeff_media.ChestSortAPI;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Public class that can be used as InventoryHolder to tell ChestSort that the associated inventory is sortable.
 */
public class Sortable implements ISortable {
    private Inventory inv;
    private Player p = null;

    public Sortable() {

    }

    public Sortable(Player p) {
        this.p=p;
    }

    public void setAssociatedPlayer(@NotNull Player player) {
        this.p=p;
    }

    public void removeAssociatedPlayer() {
        this.p=null;
    }

    @Nullable
    public Player getAssociatedPlayer() {
        return p;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }

    public void setInventory(Inventory inv) {
        this.inv=inv;
    }
}
