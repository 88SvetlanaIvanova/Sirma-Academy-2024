package com;

public class GroceryItem extends InventoryItem{
    private boolean isFresh;



    public GroceryItem(String name, int itemId, int quantity, String category, boolean isFresh) {
        super(name, itemId, quantity, category);
        this.isFresh = isFresh;
    }
    public boolean isFresh() {
        return isFresh;
    }
    // Override getValue() for GroceryItem
    @Override
    public double getValue() {
        return super.getValue() + (isFresh? 20 : 0); // Bonus for fresh items
    }
}
