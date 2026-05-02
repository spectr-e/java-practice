
public class BuggyArrays {

    public static void main(String[] args) {
        int[] scores = {90, 85, 78, 92, 88};
        System.out.println("Max: " + findMax(scores));
        System.out.println("Average: " + computeAverage(scores));
        System.out.println("Reversed: ");
        printReversed(scores);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];   // Bug 1 [FIXED]
        for (int i = 0; i < arr.length; i++) {  // Bug 2 [FIXED]
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double computeAverage(int[] arr) {
        double sum = 0; // Bug 3 [FIXED]
        for (int score : arr) {
            sum += score;
        }
        return sum / arr.length;
    }

    public static void printReversed(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {  // Bug 4 [FIXED]
            System.out.print(arr[i] + " ");
        }
    }
}
