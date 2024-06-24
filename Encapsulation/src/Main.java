import com.ElectronicsItem;
import com.FragileItem;
import com.GroceryItem;
import com.InventorySystem;
import com.api.TypeBasedCategorizer;

public class Main {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();
        try {
            inventorySystem.loadInventory();
        } catch (Exception e) {
            System.err.println("Failed to load inventory: " + e.getMessage());
        }

        //Adding products to the inventory
        inventorySystem.addProduct(new ElectronicsItem("LED TV PRO", 200, 5, "Electronic", true));
        inventorySystem.addProduct(new GroceryItem("Strawberry", 80, 233, "Fruit", true));
        inventorySystem.addProduct(new FragileItem("Glass Candle", 50, 344, "Fragile", true));
        inventorySystem.saveInventory();
        // Applying categorization
      /*  TypeBasedCategorizer typeCategorizer = new TypeBasedCategorizer();
        inventorySystem.categorizeProducts(typeCategorizer);
        try {
            inventorySystem.saveInventory();
        } catch (Exception e) {
            System.err.println("Failed to save inventory: " + e.getMessage());
        }*/
        InventorySystem.displayItems();

    }
}