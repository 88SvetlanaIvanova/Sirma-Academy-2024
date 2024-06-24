package com;

import com.api.CategoryStrategy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class InventorySystem {
    private static List<Object> inventory;

    public InventorySystem() {
        this.inventory = new ArrayList<>();
    }

    // Load inventory from file
    public void loadInventory() throws  IOException{
        try {
            inventory = InventoryIO.loadInventory();
        } catch (IOException e) {
            System.err.println("Failed to load inventory: " + e.getMessage());
        }
    }

    // Save inventory to file
    public void saveInventory() {
        try {
            InventoryIO.saveInventory(inventory);
        } catch (IOException e) {
            System.err.println("Failed to save inventory: " + e.getMessage());
        }
    }

    // Add an item to the inventory
    public void addItem(InventoryItem item) {
        inventory.add(item);
    }

    // Remove an item from the inventory by ID
    public void removeItemById(int itemId) {
        inventory.removeIf(item -> item.getItemId() == itemId);
    }
    public void categorizeProducts(CategoryStrategy strategy) {
        strategy.categorizeItems( this.inventory);
    }

    // Display all items in the inventory
    public static void displayItems() {
        for (InventoryItem item : inventory) {
            item.display();
        }
    }

    public void addProduct(InventoryItem itemProduct) {
        inventory.add(itemProduct);
    }


}
