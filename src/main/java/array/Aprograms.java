package array;

import java.util.Arrays;
import java.util.stream.IntStream;


/*
*
* Here's a concise table summarizing the methods to store values in an `int[] k = new int[100];` array:

| **Method**            | **Explanation**                                | **Formula/Code**                          |
|-----------------------|------------------------------------------------|-------------------------------------------|
| **Manual Initialization** | Directly assign values to the array.         | `int[] k = {1, 2, 3, ..., 100};`          |
| **`for` Loop**         | Use a loop to populate values.                | `for (int i = 0; i < k.length; i++) { k[i] = i; }` |
| **`Arrays.fill()`**    | Fill the entire array with the same value.    | `Arrays.fill(k, 10);`                     |
| **`IntStream.range()`**| Generate a range of values using streams.     | `int[] k = IntStream.range(0, 100).toArray();` |
| **`Arrays.setAll()`**  | Set values using index-based computation.     | `Arrays.setAll(k, i -> i);`               |
| **`Collections.nCopies()`** | Use for non-primitive types, create repeated values. | `k = Collections.nCopies(100, 5).toArray(new Integer[0]);` |
| **`Arrays.copyOf()`**  | Copy values from another array or extend array. | `k = Arrays.copyOf(initialValues, k.length);` |*/
public class Aprograms {
    public static void main(String[] args) {
        int ar[] = {1, 4, 5, 6}; // Initial array

       // int[] k = new int[100]; // Array to hold values from 0 to 99

        int[] k = IntStream.range(0,1000).toArray();
        // Print even numbers from the 'ar' array
        System.out.println("Even numbers from ar[]:");
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {  // Check if the number is even
                System.out.println(ar[i]);
            }
        }

        // Print odd numbers from the 'ar' array
        System.out.println("Odd numbers from ar[]:");
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 != 0) {  // Check if the number is odd
                System.out.print(ar[i]);
            }
        }

        // Populate 'k[]' array with numbers from 0 to 99
        for (int i = 0; i < k.length; i++) {
            k[i] = i;// Assign values from 0 to 99



            if(k[i]>9 && k[i]<1000){
                System.out.println(k[i]);

            }

        }

        // Print the 'k[]' array after filling it
        System.out.println("Array k[]:");


        // Print the entire 'k[]' array
    }
}
