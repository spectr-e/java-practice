
public class SimpleInventory {

    // Static fields: the "database" for now (array of names, parallel array of quantities)
    private static String[] itemNames = new String[10];
    private static int[] quantities = new int[10];
    private static int itemCount = 0;

    // Methods you must implement:
    public static boolean addItem(String name, int quantity) {
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
        // In a fixed-size array, you cannot truly remove a slot to make the array smaller.
        // Instead, you must nullify the data and shift the remaining items to close the gap.

        for (int i = 0; i < itemNames.length; i++) {
            if (name.equals(itemNames[i])) {

                // shift items to the left to fill the gap
                for (int j = i; j < itemCount - 1; j++) {
                    itemNames[j] = itemNames[j + 1];
                    quantities[j] = quantities[j + 1];
                }

                itemNames[i] = null;
                quantities[i] = 0;
                itemCount--;
            }
        }
        // returns false if not found
        return false;
    }

    public static int getQuantity(String name) {
        // 1. find the item first
        for (int i = 0; i < itemNames.length; i++) {
            if (name.equals(itemNames[i])) {
                return quantities[i];
            }
        }

        // returns -1 if not found
        return -1;
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
