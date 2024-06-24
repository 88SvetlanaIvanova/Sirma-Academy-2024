package com.api;

public interface Item {
    // To get the name of the item
    String getName();

    // To get the description of the item
    String getDescription();
    int getItemId();
    int getQuantity();


    // To calculate the value of the item
    double getValue();
    void setQuantity(int quantity);
    // To display the item's details (name, description, and value)
    void display();

    String getCategory();
}
