package com;

public class FragileItem extends InventoryItem{

    private boolean isExtraFragile;

    public FragileItem(String name, int itemId, int quantity, String category, boolean isExtraFragile) {
        super(name, itemId, quantity, category);
        this.isExtraFragile = isExtraFragile;
    }
    public boolean isExtraFragile() {
        return isExtraFragile;
    }

    // Override getValue() for FragileItem
    @Override
    public double getValue() {
        return super.getValue() + (isExtraFragile ? 30 : 0); // Discount for lighter items
    }
}
