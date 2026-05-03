
import java.util.Arrays;

public class ArrayStats {

    public static void main(String[] args) {
        /*
         * Test each method in main with arrays of various sizes including edge cases:
         * array of length 1, already sorted, reverse sorted.
         */

        // normal cases
        int[] arr = {78, 55, 2, 21, 43, 31, 19};

        // Max/Min Method Testing
        System.out.println("Minimum value: %d".formatted(min(arr)));
        System.out.println("Maximum value: %d".formatted(max(arr)));
        System.out.println("Average value: %.2f".formatted(average(arr)));
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Reversed array: " + Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(arr) + " - Contains 2? " + contains(arr, 2));
        System.out.println(Arrays.toString(arr) + " - Contains 12? " + contains(arr, 12));

        int[] original = {1, 2, 3};
        int[] copy = copyOf(original);

        copy[0] = 99; // Change the "copy"

        System.out.println("Original first item: " + original[0]); // This will print 0!
        System.out.println("Copy first item: " + copy[0]); // This will print 99!

        int[] reverseSorted = {89, 67, 44, 30, 21, 15};
        System.out.println("Reverse sorted array : " + Arrays.toString(reverseSorted));

        bubbleSort(reverseSorted);
        System.out.println("Bubble sorted array on reverse sorted array: " + Arrays.toString(reverseSorted));

        int[] sorted = {5, 7, 11, 13};
        System.out.println("Already sorted array : " + Arrays.toString(sorted));

        bubbleSort(sorted);
        System.out.println("Bubble sorted array on already sorted array : " + Arrays.toString(sorted));

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
        // total / no of items
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static int[] reverse(int[] arr) {
        // create a blank array
        int[] reversed = new int[arr.length];

        // loop through each value starting from the last to the first
        for (int i = 0; i < arr.length; i++) {
            // push each value to the reversed array
            reversed[i] = arr[arr.length - 1 - i];
        }

        // returns a new reversed array
        return reversed;
    }

    public static boolean contains(int[] arr, int target) {
        for (int item : arr) {
            if (item == target) {
                return true;
            }
        }
        return false;
    }

    public static int[] copyOf(int[] arr) {
        // shallow copy
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    public static void bubbleSort(int[] arr) {
        // To implement an in-place Bubble Sort, you need to compare adjacent elements and swap them if they are in the wrong order. This process repeats until the array is sorted.

        // Think of Bubble Sort like bubbles in a soda: the "heaviest" (largest) numbers sink to the bottom (end of the list), while the "lightest" (smallest) numbers bubble up to the top.
        // Since you are doing this in - place, it means you are rearranging the numbers inside their original box rather than moving them to a new box.
        // optimizing the function
        boolean swapped = false;

        for (int i = 0; i < arr.length - 1; i++) { // arr.length - 1 : for instance, if you have 5 items, you only need to make 4 swaps to push the largest one to the end. Since you check them in pairs

            for (int j = 0; j < arr.length - i - 1; j++) { // arr.length - i so that we don't re-check the numbers already sorted at the end

                // arr.length - i - 1 so that [j + 1] doesn't spill over non-existent indexes
                if (arr[j] > arr[j + 1]) {
                    int hold = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = hold;
                    swapped = true;
                }
            }

            // If no numbers were swapped the first round, the list is already perfectly sorted, so end
            if (!swapped) {
                break;
            }
        }

    }
}
