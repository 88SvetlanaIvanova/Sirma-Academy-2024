package com.api;

public interface Breakable {
    // Method to check if the item is breakable.
    boolean isBreakable();

    // Method to handle the item breakage.
    //Provides a mechanism to deal with broken items,
    // which might involve removing them from stock,
    // replacing them, or taking other actions
    // based on the inventory management policies.
    void handleBreakage();
}
