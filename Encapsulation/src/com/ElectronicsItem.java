package com;

public class ElectronicsItem extends InventoryItem{
    private boolean hasWarranty;



    public ElectronicsItem(String name, int itemId, int quantity, String category, boolean hasWarranty) {
        super(name, itemId, quantity, category);
        this.hasWarranty = hasWarranty;
    }
    public boolean getHasWarranty() {
        return hasWarranty;
    }
    // Override getValue() for ElectronicsItem
    @Override
    public double getValue() {
        return super.getValue() ;
    }
}
