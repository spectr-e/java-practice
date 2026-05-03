
import java.util.Arrays;

public class ReferenceDemo {

    public static void main(String[] args) {
        /*
        1. Primitive copy: change `b`, show `a` is unaffected
        2. Array reference copy: change via `arr2`, show `arr1` is also changed
        3. A method that takes an `int` and tries to `double` it — show the caller's value is unchanged
        4. A method that takes an `int[]` and doubles every element — show the caller's array IS changed
        5. Null assignment and catching a `NullPointerException` with try/catch
         */

        // primitive copy
        int a = 10;
        int b = a;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        b = 11;
        System.out.println("New value of b: " + b);
        System.out.println("Value of a: " + a);
        System.out.println(" ");

        // reference copy
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        System.out.println("Unmodified print");
        System.out.println("Original array" + Arrays.toString(arr1));
        System.out.println("Copied array" + Arrays.toString(arr2));
        arr2[0] = 24;
        System.out.println("Modified print (Copy Array only)");
        System.out.println("Original array" + Arrays.toString(arr1));
        System.out.println("Copied array" + Arrays.toString(arr2));
        System.out.println(" ");

        // double int method
        int num = 14;
        System.out.println("Original before double: " + num);
        doubleInt(num);
        System.out.println("Original after double: " + num);
        System.out.println(" ");

        // double int[] items method
        int[] arr = {23, 45, 6, 34, 2};
        System.out.println("Original array before double: " + Arrays.toString(arr));
        doubleIntArr(arr);
        System.out.println("Original array after double: " + Arrays.toString(arr));

        // null assignment
        try {
            String text = null;
            int length = text.length();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(" ");
            System.out.println(e);
        }
    }

    public static void doubleInt(int number) {
        number *= 2;
        System.out.println("Doubled: " + number);
    }

    public static void doubleIntArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        System.out.println("Doubled array: " + Arrays.toString(arr));
    }
}
