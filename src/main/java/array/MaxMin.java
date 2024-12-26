package array;

import java.util.stream.IntStream;

public class MaxMin {
    public static void main(String[] args) {

       // int[] p = IntStream.range(66, 100).toArray();  // Create an array with values from 0 to 99


        int[] p = {55,33,42,66,343,21,4,4,55,4};
        // Initialize max and min with the first element of the array
        int max = p[0];
        int min = p[0];

        // Loop through the array to find the max and min
        for (int i = 1; i < p.length; i++) {

            // Update max and min if necessary
            if (p[i] > max) {
                max = p[i];
            }
            if (p[i] < min) {
                min = p[i];
            }
        }

        // Print the final results for max and min
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
