package net.zithium.mobcoins.events;

import net.zithium.mobcoins.player.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class MobCoinGainEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Player player;
    private final PlayerData profile;
    private long gained;

    public MobCoinGainEvent(final Player player, final PlayerData profile, final long gained) {
        this.player = player;
        this.profile = profile;
        this.gained = gained;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    public Player getPlayer() {
        return this.player;
    }

    public PlayerData getProfile() {
        return this.profile;
    }

    public long getGained() {
        return this.gained;
    }

    public void setGained(final long gained) {
        this.gained = gained;
    }

    public MobCoinGainEvent fire(final JavaPlugin plugin) {
        plugin.getServer().getPluginManager().callEvent(this);
        return this;
    }

}