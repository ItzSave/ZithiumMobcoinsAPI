package net.zithium.mobcoins.player;

import java.util.UUID;

public class PlayerData {

    public UUID getUuid() {
        return null;
    }
    public long getCoins() {
        return 0;
    }
    public void setCoins(long coins) {}
    public void addEarnings(long coins) {}
    public void subtractCoins(long coins) {}
    public boolean isAnnounceNotification() { return false; }
    public void setAnnounceNotification(boolean announceNotification) {}
    public boolean isActionBarNotification() {
        return false;
    }
    public void setActionBarNotification(boolean actionBarNotification) {}
    public long getCoinsEarnings() {
        return 0;
    }
    public void resetEarnings() {}
}
