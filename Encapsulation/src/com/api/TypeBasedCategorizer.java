package com.api;

import com.InventoryItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeBasedCategorizer implements CategoryStrategy{
    @Override
    public void categorizeItems(List<InventoryItem> inventory) {
        // Implement logic to categorize items by type
        Map<String, List<Item>> categorizedItems = new HashMap<>();

        for (Item item : inventory) {
            String category = item.getCategory(); // Assuming getCategory() method exists
            categorizedItems.computeIfAbsent(category, k -> new ArrayList<>()).add(item);
        }
    }


}
