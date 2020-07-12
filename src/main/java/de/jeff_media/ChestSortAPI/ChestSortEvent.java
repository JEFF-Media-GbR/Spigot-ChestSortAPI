package de.jeff_media.ChestSortAPI;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ChestSortEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();
    final Inventory inv;
    boolean cancelled = false;
    Location loc;
    Player p;

    public ChestSortEvent(Inventory inv) {
        this.inv = inv;
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

    @Nullable
    public Player getPlayer() {
        return p;
    }

    public void setPlayer(Player p) { this.p=p; }

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