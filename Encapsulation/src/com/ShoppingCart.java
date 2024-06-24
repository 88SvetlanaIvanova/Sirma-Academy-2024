package com;

import com.api.Item;
import com.api.Order;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Order {
    private List<InventoryItem> items;
    private CreditCardPayment payment;

    public ShoppingCart() {
        this.items = new ArrayList<>();

    }


    @Override
    public void addItem(Item item) {

    }

    @Override
    public void removeItem(Item item) {

    }

    @Override
    public void calculateTotal() {
        // Calculate total cost of items
    }

    @Override
    public void applyDiscount(double discount) {
        // Apply discount to total cost
    }
}
