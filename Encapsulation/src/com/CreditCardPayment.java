package com;

import com.api.Payment;

public class CreditCardPayment implements Payment {

    private double totalAmount;

    public CreditCardPayment(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public double calculateTotal() {
        return totalAmount;
    }

    @Override
    public void processPayment() {
        // Process payment logic
    }
    public double getAmount() {
        return totalAmount;
    }
}

