package com;

import com.api.*;
import com.api.*;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {
    protected String name;
    protected String description;
    protected int itemId;
    protected int quantity;
    private String category = "General"; // Default category
    private boolean isBreakable = false; // Default breakable status
    private boolean isPerishable = false; // Default perishable status
    private double price = 0.0; // Default price

    // Constructor
    public AbstractItem(String name, int itemId, int quantity, String category) {
        this.name = name;
        this.itemId = itemId;
        this.quantity = quantity;
        setCategory(category);
    }

    public AbstractItem(String name, String category) {
    }


    // Item interface implementation
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public int getItemId() {
        return itemId;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public double getValue() {
        return price;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Value: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + this.getCategory());
    }

    // Categorizable interface implementation
    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getCategory() {
        return category;
    }

    // Breakable interface implementation
    @Override
    public boolean isBreakable() {
        return isBreakable;
    }

    @Override
    public void handleBreakage() {
        System.out.println(name + " is broken.");
    }

    // Perishable interface implementation
    @Override
    public boolean isPerishable() {
        return isPerishable;
    }

    @Override
    public void handleExpiration() {
        System.out.println(name + " has expired.");
    }

    // Sellable interface implementation
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
