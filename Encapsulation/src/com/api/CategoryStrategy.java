package com.api;

import com.InventoryItem;

import java.util.List;

public interface CategoryStrategy {
    void categorizeItems(List<InventoryItem> inventory);
}
