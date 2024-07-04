package net.zithium.mobcoins;

import java.util.Optional;
import java.util.UUID;

public interface ZithiumMobCoinsAPI {

    /**
     * Get the user's coin balance.
     *
     * @param uuid The target user's UUID.
     * @return The user's coin balance as an Optional<Long>.
     */
    Optional<Long> getUserBalance(UUID uuid);

    /**
     * Set the user's coin balance.
     *
     * @param uuid  The target user's UUID.
     * @param coins The coins to set their balance to.
     */
    void setUserBalance(UUID uuid, int coins);

    /**
     * Increase the user's coin balance by a specified amount.
     *
     * @param uuid    The target user's UUID.
     * @param coins   The amount of coins to add to their balance.
     */
    void addCoins(UUID uuid, int coins);

    /**
     * Decrease the user's coin balance by a specified amount.
     *
     * @param uuid    The target user's UUID.
     * @param coins   The amount of coins to subtract from their balance.
     */
    void subtractCoins(UUID uuid, int coins);

    /**
     * Check if the user has a sufficient balance to perform an action.
     *
     * @param uuid    The target user's UUID.
     * @param requiredCoins The number of coins required.
     * @return true if the user has a sufficient balance, false otherwise.
     */
    boolean hasSufficientBalance(UUID uuid, int requiredCoins);

    /**
     * Reload the plugin's data or configuration.
     */
    void reload();
}
