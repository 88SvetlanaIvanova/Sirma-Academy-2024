package com.api;

public interface Perishable {
    // Checking if the item is perishable.
    boolean isPerishable();

    // Handling item expiration.
    void handleExpiration();
}
