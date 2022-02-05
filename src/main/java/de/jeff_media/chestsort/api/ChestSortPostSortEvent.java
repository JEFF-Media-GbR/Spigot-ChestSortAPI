package de.jeff_media.chestsort.api;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

/**
 * Gets called after an inventory has been sorted.
 */
public class ChestSortPostSortEvent extends Event {

    public ChestSortPostSortEvent(@NotNull final ChestSortEvent event) {

    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return null;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return null;
    }

    /**
     * Returns the {@link ChestSortEvent} that was called prior to sorting the inventory. You can obtain the inventory using {@link ChestSortEvent#getInventory()}
     * @return The initiating {@link ChestSortEvent}
     */
    @NotNull
    public ChestSortEvent getChestSortEvent() {
        return null;
    }
}
