public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(fizzBuzzValue(i));
        }
    }

    public static String fizzBuzzValue(int n) {
        // Returns "FizzBuzz", "Fizz", "Buzz", or the number as a String
        if (n % 15 == 0) {
            return "FizzBuzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        return String.format("%d", n);
    }
}
