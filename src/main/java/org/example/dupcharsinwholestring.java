package org.example;


import java.util.HashMap;
import java.util.Map;

public class dupcharsinwholestring {
    public static void main(String[] args) {
        String s = "krankrankk"; // Example string

        // Initialize a map to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Variable to track total duplicate characters
        int totalDuplicates = 0;

        // First, find and print the total number of duplicate characters
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                totalDuplicates++;
            }
        }

        // Print the total number of duplicate characters
        if (totalDuplicates > 0) {
            System.out.println("Total duplicate characters: " + totalDuplicates);
        } else {
            System.out.println("No duplicates found.");
        }

        // Next, print how many times each duplicate character appears
        System.out.println("\nDuplicate characters and their counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                // Print the duplicate characters and their frequency
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
            }
        }
    }
}

