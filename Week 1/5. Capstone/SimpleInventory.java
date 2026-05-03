
public class SimpleInventory {

    // Static fields: the "database" for now (array of names, parallel array of quantities)
    private static String[] itemNames = new String[10];
    private static int[] quantities = new int[10];
    private static int itemCount = 0;

    // Methods you must implement:
    public static boolean addItem(String name, int quantity) {
        // returns false if inventory full

        // 1. check if inventory is full
        if (itemCount > itemNames.length) {
            return false;
        }

        // 2. add item name and quantity to the current index
        itemNames[itemCount] = name;
        quantities[itemCount] = quantity;

        // 3. increment the counter for the next item
        itemCount++;

        return true;
    }

    public static boolean removeItem(String name) {
        // returns false if not found

        return true;
    }

    public static int getQuantity(String name) {
        // returns -1 if not found
        int qty = 0;
        return qty;
    }

    public static boolean updateQuantity(String name, int newQty) {
        return true;
    }

    public static void printInventory() {

    }

    public static int getTotalItems() {
        // sum of all quantities
        int items = 0;
        return items;
    }

    public static String findLowStock(int threshold) {
        // CSV of items below threshold
        String lowStock = "";
        return lowStock;
    }

}
