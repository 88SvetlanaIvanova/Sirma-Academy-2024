package com;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.lang.Boolean;
import java.util.stream.Collectors;

public class InventoryIO {
    private static final String FILE_NAME = "src/resources/inventory.txt";

    public static void saveInventory(List<Object> inventory) throws IOException {
        try (FileWriter fw = new FileWriter(FILE_NAME)) {

            for (Object item : inventory) {
                if (item instanceof InventoryItem) {
                    InventoryItem inventoryItem = (InventoryItem) item;
                    fw.write(inventoryItem.getName());
                    fw.write(", ");
                    fw.write(Integer.toString(inventoryItem.getItemId()));
                    fw.write(", ");
                    fw.write(Integer.toString(inventoryItem.getQuantity()));
                    fw.write(", ");
                    fw.write(inventoryItem.getCategory());
                    fw.write(", ");

                    if (inventoryItem.isProperty()) {
                        fw.write(Boolean.toString(inventoryItem.isProperty()));
                        fw.write("\n");
                    } else {
                        fw.write("\n");
                    }
                } else if (item instanceof ElectronicsItem) {
                    ElectronicsItem electronicsItem = (ElectronicsItem) item;
                    // Handle ElectronicsItem specifics, if any
                    fw.write(electronicsItem.getName());
                    fw.write(", ");
                    fw.write(Integer.toString(electronicsItem.getItemId()));
                    fw.write(", ");
                    fw.write(Integer.toString(electronicsItem.getQuantity()));
                    fw.write(", ");
                    fw.write(Boolean.toString(electronicsItem.getHasWarranty()));
                    fw.write(", ");
                    fw.write(Boolean.toString(electronicsItem.isProperty()));
                    fw.write("\n");
                } else if (item instanceof GroceryItem) {
                    GroceryItem groceryItem = (GroceryItem) item;
                    // Handle GroceryItem specifics, if any
                    fw.write(groceryItem.getName());
                    fw.write(", ");
                    fw.write(Integer.toString(groceryItem.getItemId()));
                    fw.write(", ");
                    fw.write(Integer.toString(groceryItem.getQuantity()));
                    fw.write(", ");
                    fw.write(Boolean.toString(groceryItem.isFresh())); // (Boolean.toString(inventoryItem.isProperty()))
                    fw.write(", ");
                    fw.write(Boolean.toString(groceryItem.isProperty()));
                    fw.write("\n");
                } else if (item instanceof FragileItem) {
                    FragileItem fragileItem = (FragileItem) item;
                    // Handle FragileItem specifics, if any
                    fw.write(fragileItem.getName());
                    fw.write(", ");
                    fw.write(Integer.toString(fragileItem.getItemId()));
                    fw.write(", ");
                    fw.write(Integer.toString(fragileItem.getQuantity()));
                    fw.write(", ");
                    fw.write(Boolean.toString(fragileItem.isExtraFragile())); // (Boolean.toString(inventoryItem.isProperty()))
                    fw.write(", ");
                    fw.write(Boolean.toString(fragileItem.isProperty()));
                    fw.write("\n");
                }
            }
        } catch (IOException e) {
            System.err.println("Failed to save inventory: " + e.getMessage());
            throw e; // Rethrow the exception to allow calling methods to handle it
        }
    }

    public static List<InventoryItem> loadInventory() throws IOException {
            List<InventoryItem> inventory = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
                String line;
                while ((line = br.readLine())!= null) {
                    String[] parts = line.split(", ");
                    boolean property = false;
                    if(parts.length > 4){
                         property = Boolean.parseBoolean(parts[4]);
                    }

                    inventory.add(new InventoryItem(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3], property));
                }
            }
            return inventory;
    }
}
