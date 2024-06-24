package com.api;

public interface Order {
    void addItem(Item item);
    void removeItem(Item item);
    void calculateTotal();
    void applyDiscount(double discount);
}
