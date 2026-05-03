
public class SimpleInventoryTest {

    public static void main(String[] args) {
        System.out.println("--- 📦 Adding 6 Items ---");
        SimpleInventory.addItem("Apple", 50);
        SimpleInventory.addItem("Banana", 10);
        SimpleInventory.addItem("Cherry", 5);
        SimpleInventory.addItem("Dragonfruit", 100);
        SimpleInventory.addItem("Elderberry", 2);
        SimpleInventory.addItem("Fig", 25);

        SimpleInventory.printInventory();

        System.out.println("\n--- 📝 Updating Quantities ---");
        // Update Banana to 15 and Fig to 0
        SimpleInventory.updateQuantity("Banana", 15);
        SimpleInventory.updateQuantity("Fig", 0);
        System.out.println("New quantity of Banana: " + SimpleInventory.getQuantity("Banana"));

        System.out.println("\n--- 🗑️ Removing an Item ---");
        // Removing Dragonfruit
        boolean removed = SimpleInventory.removeItem("Dragonfruit");
        System.out.println("Removed Dragonfruit? " + removed);
        SimpleInventory.printInventory();

        System.out.println("\n--- ⚠️ Low Stock Report (Threshold: 10) ---");
        // Should show Cherry, Elderberry, and Fig (since we set Fig to 0)
        String report = SimpleInventory.findLowStock(10);
        System.out.println("Items to reorder: " + report);

        System.out.println("\n--- 📊 Final Stats ---");
        System.out.println("Total units in stock: " + SimpleInventory.getTotalItems());
    }
}
