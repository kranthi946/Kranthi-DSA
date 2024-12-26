package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countofdupstring {

    public static void main(String[] args) {
        // Step 1: Input string
        String str = "abccc"; // Input → "abccc"

        // Step 2: Call the printdup method
        printdup(str); // Call Method
    }

    public static void printdup(String str) {

        // { Edge Case Check }
        if (str == null || str.length() == 1 || str.isEmpty()) {
            System.out.println("null, empty, or single character string");
            return; // Exit if input is invalid
        }

        // { Convert String to Char Array → ['a', 'b', 'c', 'c', 'c'] }
        char[] words = str.toCharArray(); // Conversion → words = ['a', 'b', 'c', 'c', 'c']

        // { Initialize Map to Store Frequencies → charmap = {} }
        Map<Character, Integer> charmap = new HashMap<>();

        // { Loop through Char Array and Count Frequencies }
        for (char ch : words) {
            // → If character exists, increment count
            if (charmap.containsKey(ch)) {
                charmap.put(ch, charmap.get(ch) + 1);
                // Example: If 'c' exists, increment count: c=2, c=3
            }
            else {
                // → If character does not exist, add it with count 1
                charmap.put(ch, 1);
                // Example: Add 'a' with count 1 → charmap = {a=1}
            }
        }

        // { Visualize charmap.entrySet() }
        Set<Map.Entry<Character, Integer>> es = charmap.entrySet();
        /*
            charmap contains:
            { a=1, b=1, c=3 }
        */

        // { Print charmap.entrySet() for clarity }
        System.out.println("Visualized entrySet:");
        System.out.println(es);  // Output: [a=1, b=1, c=3]

        // { Print Duplicates by Traversing Map }
        for (Map.Entry<Character, Integer> entry : es) {
            // → Check if value (count) > 1 → Duplicate Found
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                // Output Example: c : 3
            }
        }
    }
}
