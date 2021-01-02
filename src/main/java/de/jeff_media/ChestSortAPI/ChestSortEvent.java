package de.jeff_media.ChestSortAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ChestSortEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();
    final Inventory inv;
    // For each ItemStack, a map of "{placeholder}", "sortString" pairs.
    Map<ItemStack, Map<String, String>> invSortableMaps;
    boolean cancelled = false;
    Location loc;
    Player p;
    List<ItemStack> unmovableItemStacks;
    List<Integer> unmovableSlots;

    public ChestSortEvent(Inventory inv) {
        this.inv = inv;
        this.unmovableItemStacks = new ArrayList<>();
        this.unmovableSlots = new ArrayList<>();
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Nullable
    public Location getLocation() {
        return loc;
    }

    public void setLocation(Location loc) { this.loc=loc; }

    public Inventory getInventory() {
        return inv;
    }

    public Map<ItemStack, Map<String, String>> getSortableMaps() {
        return invSortableMaps;
    }

    public void setSortableMaps(Map<ItemStack, Map<String, String>> sortableMap) {
        invSortableMaps = sortableMap;
    }

    @Nullable
    public Player getPlayer() {
        return p;
    }

    public void setPlayer(Player p) { this.p=p; }

    public void setUnmovable(int slot) {
        unmovableSlots.add(slot);
    }

    public void setUnmovable(ItemStack itemStack) {
        unmovableItemStacks.add(itemStack);
    }

    public void removeUnmovable(int slot) {
        unmovableSlots.remove(slot);
    }

    public void removeUnmovable(ItemStack itemStack) {
        unmovableItemStacks.remove(itemStack);
    }

    public boolean isUnmovable(int slot) {
        return unmovableSlots.contains(slot);
    }

    public boolean isUnmovable(ItemStack itemStack) {
        return unmovableItemStacks.contains(itemStack);
    }

    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }


}
