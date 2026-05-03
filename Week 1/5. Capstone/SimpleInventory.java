
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

        for (int i = 0; i < itemCount; i++) {
            if (name.equals(itemNames[i])) {

                // shift items to the left to fill the gap
                for (int j = i; j < itemCount - 1; j++) {
                    itemNames[j] = itemNames[j + 1];
                    quantities[j] = quantities[j + 1];
                }

                itemNames[itemCount - 1] = null;
                quantities[itemCount - 1] = 0;
                itemCount--;

                return true;
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
        // 1. find the item first
        for (int i = 0; i < itemNames.length; i++) {
            if (name.equals(itemNames[i])) {
                // 2. once found, update the quantity
                quantities[i] = newQty;
                return true;
            }
        }

        // 3. return false if the item is not found
        return false;
    }

    public static void printInventory() {
        for (int i = 0; i < itemCount - 1; i++) {
            System.out.println("{ item: '" + itemNames[i] + "', quantity: " + quantities[i] + " }");
        }
    }

    public static int getTotalItems() {
        int sumOfQty = 0;
        for (int i = 0; i < itemCount - 1; i++) {
            sumOfQty += quantities[i];
        }
        // sum of all quantities
        return sumOfQty;
    }

    public static String findLowStock(int threshold) {
        // CSV of items below threshold
        String lowStockReport = "";

        for (int i = 0; i < itemCount - 1; i++) {
            if (quantities[i] < threshold) {
                // if report isn't empty, add a comma before
                if (!lowStockReport.equals("")) {
                    lowStockReport += ", ";
                }

                // add the item name to string
                lowStockReport += itemNames[i];
            }
        }
        return lowStockReport;
    }

}
