
public class ArrayStats {

    public static void main(String[] args) {
        /*
            Test each method in main with arrays of various sizes including edge cases: array of length 1, already sorted, reverse sorted.
         */

        // edge cases
        int[] lengthOne = {1};
        int[] sorted = {5, 7, 11, 13};
        int[] reverseSorted = {89, 67, 44, 30, 21, 15};

        // normal cases
        int[] arr = {78, 55, 2, 21, 43, 31, 19};

        // method testing
        System.out.println("Minimum value: %d".formatted(min(arr)));
        System.out.println("Maximum value: %d".formatted(max(arr)));
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double average(int[] arr) {
        return 1.1;
    }

    public static int[] reverse(int[] arr) {
        return arr;
    }         // returns a new reversed array

    public static boolean contains(int[] arr, int target) {
        return false;
    }

    public static int[] copyOf(int[] arr) {
        return arr;
    }          // shallow copy

    public static void bubbleSort(int[] arr) {
    }       // in-place sort
}
