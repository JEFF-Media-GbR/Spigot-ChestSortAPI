package de.jeff_media.chestsort.api;

import org.bukkit.Location;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

/**
 * This event is called whenever ChestSort attempts to sort an {@link org.bukkit.inventory.Inventory}. Can be cancelled to prevent ChestSort from manipulating this {@link org.bukkit.inventory.Inventory}.
 * You can also mark certain slots or items as unmovable or change the final sorting result.
 * The inventory will only be sorted AFTER this event has been called, and only if it wasn't cancelled. To check whether an inventory was actually sorted, see {@link ChestSortPostSortEvent}
 */
public class ChestSortEvent extends Event implements Cancellable {

    /**
     * Creates a new ChestSortEvent
     *
     * @param inv The {@link org.bukkit.inventory.Inventory} about to be sorted
     */
    public ChestSortEvent(@NotNull final Inventory inv) {

    }

    public static HandlerList getHandlerList() {
        return null;
    }

    /**
     * Returns a list with all {@link org.bukkit.inventory.ItemStack}s that have been marked as unmovable
     *
     * @return List of all {@link org.bukkit.inventory.ItemStack}s that have been marked as unmovable
     */
    @NotNull
    public List<ItemStack> getUnmovableItemStacks() {
        return null;
    }

    /**
     * Returns a list with all slots that have been marked as unmovable
     *
     * @return List of all slots that have been marked as unmovable
     */
    @NotNull
    public List<Integer> getUnmovableSlots() {
        return null;
    }

    /**
     * Returns the {@link org.bukkit.Location} associated with this event. Might be null
     *
     * @return {@link org.bukkit.Location} associated with this event, or null if no {@link org.bukkit.Location} has been set
     */
    @Nullable
    public Location getLocation() {
        return null;
    }

    /**
     * Sets the {@link org.bukkit.Location} associated with this event
     *
     * @param loc New Location
     */
    public void setLocation(@Nullable final Location loc) {
    }

    /**
     * Returns the {@link org.bukkit.inventory.Inventory} associated with this event
     *
     * @return {@link org.bukkit.inventory.Inventory} to be sorted
     */
    @NotNull
    public Inventory getInventory() {
        return null;
    }

    @NotNull
    public Map<ItemStack, Map<String, String>> getSortableMaps() {
        return null;
    }

    public void setSortableMaps(@NotNull final Map<ItemStack, Map<String, String>> sortableMap) {

    }

    /**
     * Returns the {@link org.bukkit.entity.Player} associated with this event. Might be null
     *
     * @return {@link org.bukkit.entity.Player} associated with this event, or null if no player has been set
     */
    @Nullable
    public HumanEntity getPlayer() {
        return null;
    }

    /**
     * Sets the {@link org.bukkit.entity.HumanEntity} associated with this event
     *
     * @param player {@link org.bukkit.entity.HumanEntity} associated with this event, can be null
     */
    public void setPlayer(@Nullable final HumanEntity player) {
    }

    /**
     * Prevents ChestSort from sorting/moving this specific slot
     *
     * @param slot Slot that should not be touched
     */
    public void setUnmovable(final int slot) {

    }

    /**
     * Prevents ChestSort from sorting/moving matching {@link org.bukkit.inventory.ItemStack}s
     *
     * @param itemStack {@link org.bukkit.inventory.ItemStack} that should not be touched
     */
    public void setUnmovable(@NotNull final ItemStack itemStack) {

    }

    /**
     * Removes a slot number from the list of unmovable slots
     *
     * @param slot Slot that may be sorted
     */
    public void removeUnmovable(final int slot) {

    }

    /**
     * Removes an {@link org.bukkit.inventory.ItemStack} from the list of unmovable {@link org.bukkit.inventory.ItemStack}s
     *
     * @param itemStack ItemStack that may be sorted
     */
    public void removeUnmovable(@NotNull final ItemStack itemStack) {

    }

    /**
     * Checks whether a slot number is set as unmovable
     *
     * @param slot Slot to check
     * @return true if the slot number has been set unmovable, otherwise false
     */
    public boolean isUnmovable(final int slot) {
        return false;
    }

    /**
     * Checks whether an {@link org.bukkit.inventory.ItemStack} is set as unmovable
     *
     * @param itemStack ItemStack to check
     * @return true if the ItemStack has been set unmovable, otherwise false
     */
    public boolean isUnmovable(@NotNull final ItemStack itemStack) {
        return false;
    }

    public @NotNull HandlerList getHandlers() {
        return null;
    }

    /**
     * Checks whether this event is cancelled. If true, the {@link org.bukkit.inventory.Inventory} will not be sorted
     *
     * @return true when the event has been cancelled, otherwise false
     */
    @Override
    public boolean isCancelled() {
        return false;
    }

    /**
     * Sets the cancellation status of this event. When cancelled, the {@link org.bukkit.inventory.Inventory} will not be sorted.
     *
     * @param cancel Whether this event should be cancelled
     */
    @Override
    public void setCancelled(final boolean cancel) {

    }


}
