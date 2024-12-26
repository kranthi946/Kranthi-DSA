package array;

import java.util.*;
import java.util.stream.Collectors;

public class Arraysprograms {

    public static void main(String[] args) {

        // { BruteForce, HashSet, HashMap, Streams }
        // Input String Array
        String[] k = {"kranthi", "kranthi", "bob", "bob", "amazon", "azure"};
        List<String> list;

        // Initialize HashSet for Streams and HashSet Method
        Set<String> ds = new HashSet<String>();
        list = new ArrayList<>(Arrays.asList(k));  // Convert array to list

        // { Stream Method (Duplicate Detection) }
        // 1. Add elements to HashSet while checking for duplicates in Stream
        Set<String> x = list.stream()                       // Stream conversion
                .filter(e -> !ds.add(e))                   // Add and filter duplicates
                .collect(Collectors.toSet());              // Collect duplicates in Set

        // { Stream Method (Group by and Count) }
        // 2. Group by elements, count, and filter those with count > 1
        Set<String> x1 = list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))  // Group and count
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)            // Filter duplicate counts
                .map(Map.Entry::getKey)                   // Get the element
                .collect(Collectors.toSet());             // Collect duplicates in Set

        // { Streams Output }
        System.out.print("streams");
        System.out.println(x);    // Print duplicates from Stream
        System.out.println(x1);   // Print duplicates using group by and count

        // { Brute Force Method for Duplicates }
        System.out.println("bruteforce");
        // Nested loops to compare elements
        for (int i = 0; i < k.length; i++) {              // Outer loop for each element
            for (int j = i + 1; j < k.length; j++) {      // Inner loop to compare with other elements
                if (k[i].equals(k[j])) {                  // Check if elements match
                    System.out.println(k[i]);             // Print duplicates
                }
            }
        }

        // { HashSet Method for Duplicates }
        System.out.println("hashset");
        Set<String> data = new HashSet<String>();
        // Iterate through array to detect duplicates using HashSet
        for (String e : k) {
            if (data.add(e) == false) {                   // If add() returns false, it's a duplicate
                System.out.println(e);                     // Print duplicate
            }
        }

        // { HashMap Method for Duplicates }
        // Initialize HashMap to store counts
        Map<String, Integer> kmap = new HashMap<>();

        // Count occurrences of each string in the array
        for (String e : k) {
            Integer count = kmap.get(e);                   // Get current count (null if not present)
            if (count == null) {                            // If element is not in the map
                kmap.put(e, 1);                            // Add with count 1
            } else {
                kmap.put(e, count + 1);                    // Increment count
            }
        }

        // { Print duplicates from HashMap }
        Set<Map.Entry<String, Integer>> es = kmap.entrySet();  // Get Set of map entries
        for (Map.Entry<String, Integer> entry : es) {          // Iterate over map entries
            if (entry.getValue() > 1) {                        // If count > 1, print the element
                System.out.println("Duplicate element: " + entry.getKey());
            }
        }
    }
}
