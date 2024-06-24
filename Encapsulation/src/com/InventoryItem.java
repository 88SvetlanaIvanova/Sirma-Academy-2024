package com;

public class InventoryItem extends AbstractItem{
    private int itemId;
    private int quantity;
    private String description;

    private boolean property;

    public InventoryItem(String name, int itemId, int quantity, String category) {
        super(name, itemId, quantity, category);
    }

    public boolean isProperty() {
        return property;
    }

    public InventoryItem(String name, int itemId, int quantity, String category, boolean property) {
        super(name, itemId, quantity, category);
        this.property = property;
    }
    // Constructor

    // Getter and Setter for itemId
    @Override
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
       // this.description = name + ", " + description + ", " + getPrice() + ", " + quantity + ", " + this.getCategory();
    }
    public int getItemId() {
        return itemId;
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    // Getter and Setter for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Override getValue() to consider quantity
    @Override
    public double getValue() {
        return super.getValue() * quantity; // Assuming value is calculated per unit
    }
}
