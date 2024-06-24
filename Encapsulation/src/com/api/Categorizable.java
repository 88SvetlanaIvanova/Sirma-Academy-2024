package com.api;

public interface Categorizable {
    // To set the category of the item. Used for organizing items in the inventory,
    // such as separating them by department or type.
    void setCategory(String category);

    // To get the category of the item. Can be used to filter items
    String getCategory();
}
