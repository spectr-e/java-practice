
public class NumberUtils {

    public static void main(String[] args) {
        System.out.println("Is 13 a prime? " + isPrime(13));
        System.out.println("Is 121 a palindrome? " + isPalindrome(121));
        System.out.println("The Factorial of 9? " + factorial(9));
        System.out.println("The Fibonnaci of 18? " + fibonacci(18));
        System.out.println("The Sum of Digits of 121? " + sumOfDigits(121));
        System.out.println("The Reverse of 6770? " + reverseNumber(6770));
        System.out.println("The Reverse (String) of 6770? " + reverseNumString(6770));
    }

    public static boolean isPrime(int n) {
        // a prime number cannot be divisible by anything other than 1 and itself

        // 1.
        // - rule out the numbers that cannot be prime by definition (0, 1 and negatives)
        if (n <= 1) {
            return false;
        }

        // 2.
        // if we skip multiples of 2, we skip all even numbers
        // if we skip multiples of 3, we skip numbers like 9, 15, 21
        // the only numbers left that could possibly be factors are those neighboring a multiple of 6
        if (n <= 3) {
            return true;
        }

        // 3.
        // if it’s any other number divisible by 2 or 3 it’s not prime.
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        // 4.
        // the 6k ± 1 rule states that every prime number greater than 3 can be expressed in the form 6k + 1 or 6k - 1 where k is a natural number
        // this is because any integer can be written as 6k, 6k + 1, 6k + 2, 6k + 3, 6k + 4, 6k + 5
        // so 6k, 6k + 2 and 6k + 4 are divisible by 2, and 6k + 3 is divisible by 3.
        // this leaves only 6k + 1 and 6k + 5 (same as 6k - 1) as potential candidates for primes
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                // int i = 5; We start at 5 - the first prime after 2 and 3
                // i * i <= n; This is the the square root. It tells the loop to stop once i exceeds ✓n
                // i += 6 The only numbers left that could possibly be factors are those neighboring a multiple of 6 (6k ± 1)
                // n % i == 0 Checks the first potential factor (e.g., 5)
                // n % (i + 2) == 0 Checks the second potential factor (e.g., 7)
                return false;
            }
        }
        return true;
    }

    public static long factorial(int n
    ) {
        // 1. Initialize result to 1 (Identity for multiplication)
        long result = 1;
        // 2. Handle negative input (Optional but good practice)
        if (n < 1) {
            return -1;
        }
        // 3. Loop from 1 up to n
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        // 4. Return the final product
        return result;
    }

    public static int fibonacci(int n) {
        // The Fibonacci sequence starts 0, 1, 1, 2, 3, 5, 8, 13... where each number is the sum of the two preceding ones.

        // If n is 0, return 0. If is 1, return 1.
        if (n <= 1) {
            return n;
        }

        // To find the next number, you only need to know the last two numbers.
        int last = 1;
        int secondLast = 0;
        int current = 0;
        // Start from 2 and go up to . In each step:
        // 1. Calculate the new sum.
        // 2. Move the "second-to-last" pointer to the "last" position.
        // 3. Move the "last" pointer to the "new sum" position.
        for (int i = 2; i <= n; i++) {
            current = secondLast + last;
            secondLast = last;
            last = current;
        }
        // Returns the nth Fibonacci number
        return current;
    }

    public static boolean isPalindrome(int n) {
        // A number is a palindrome if it looks the same when its digits are reversed (e.g., 121).

        // Step 1: Remove Negative numbers (like -121) are never palindromes because of the [-] sign
        if (n < 0) {
            return false;
        }

        // Step 2: We need to "flip" n mathematically.
        int original = n;
        int reversed = 0;

        while (original != 0) {
            // - Use modulo (%) 10 to grab the last digit
            int lastDigit = original % 10;
            // - Build a new number by multiplying the reversal by 10 and adding that last digit.
            reversed = (reversed * 10) + lastDigit;
            // - Use / 10 to remove the last digit from the original number.
            original = original / 10;
        }
        // Step 3: Once the loop finishes, check if your reversed number matches the original
        return n == reversed;
    }

    public static int sumOfDigits(int n
    ) {
        // sum of all digits
        // "peel" off each digit one by one, add it to a total, and then discard it.
        // Step 1. use Math.abs(n) at the start to ensure the math works correctly for negative inputs.
        n = Math.abs(n);
        int total = 0;

        // Step 2. Loop until no digits left
        while (n > 0) {
            // - Grab the last digit
            int lastDigit = n % 10;
            // - Add it to the total
            total += lastDigit;
            // - Remove last digit from original number
            n /= 10;
        }

        return total;
    }

    public static int reverseNumber(int n) {
        int reversed = 0;

        while (n != 0) {
            // - Use modulo (%) 10 to grab the last digit
            int lastDigit = n % 10;
            // - Build a new number by multiplying the reversal by 10 and adding that last digit.
            reversed = (reversed * 10) + lastDigit;
            // - Use / 10 to remove the last digit from the original number.
            n = n / 10;
        }

        // reverses digits (123 → 321)
        return reversed;
    }

    public static String reverseNumString(int n) {
        // handle special case for 0
        if (n == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        // work with absolute value to avoid the '-' sign issues
        int num = Math.abs(n);

        while (num > 0) {
            int lastDigit = num % 10;
            // append the digit to the end of the string builder
            sb.append(lastDigit);
            num /= 10;
        }

        // if original was negative, append the sign as prefix
        return (n < 0) ? "-" + sb.toString() : sb.toString();
    }
}
