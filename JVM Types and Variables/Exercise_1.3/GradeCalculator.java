
public class GradeCalculator {

    static int[] scores = {98, 75, 55, 30, 88, 42};

    public static char letterGrade(int score) {
        if (score == 100) {
            return 'A';
        }
        // returns 'A', 'B', 'C', 'D', 'F'
        switch (score / 10) {
            case 9:
                return 'A';
            case 8:
                return 'A';
            case 7:
                return 'B';
            case 6:
                return 'B';
            case 5:
                return 'C';
            case 4:
                return 'D';
            default:
                return 'F';
        }
    }

    public static double average(int[] scores) {
        double length = scores.length;
        double sum = 0;

        for (int i = 0; i < length; i++) {
            sum += scores[i];
        }

        // returns the mean
        return sum / length;
    }

    public static int highest(int[] scores) {
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        // returns max value
        return max;
    }

    public static int lowest(int[] scores) {
        // Initialize min with the first element
        int min = scores[0];

        // Update min if a smaller value is found
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        // returns min value
        return min;
    }

    public static boolean isPassingGrade(char letter) {
        // true if A, B, or C
        return letter == 'A' || letter == 'B' || letter == 'C';
    }

    public static void main(String[] args) {
        // create an array of 6 test scores
        for (int score : scores) {
            // Print each score,
            System.out.println("score: " + score);

            // Print its letter grade
            System.out.println("grade: " + letterGrade(score));

            // Print whether it's passing.
            System.out.println("isPassing?: " + isPassingGrade(letterGrade(score)));
        }

              // Print the class average
        System.out.println("average score: " + average(scores));
        // Print the highest score
        System.out.println("highest score: " + highest(scores));
        // Print the lowest score
        System.out.println("lowest score: " + lowest(scores));
    }
}
