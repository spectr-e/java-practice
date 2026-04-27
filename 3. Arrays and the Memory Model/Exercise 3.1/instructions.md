# Exercise 3.1 — Array Statistics Library

Create `ArrayStats.java`.

Implement without using java.util.Arrays:

```java
public static int min(int[] arr)
public static int max(int[] arr)
public static double average(int[] arr)
public static int[] reverse(int[] arr)         // returns a new reversed array
public static boolean contains(int[] arr, int target)
public static int[] copyOf(int[] arr)          // shallow copy
public static void bubbleSort(int[] arr)       // in-place sort
```

Test each method in main with arrays of various sizes including edge cases:

- array of length 1,
- already sorted,
- reverse sorted.
