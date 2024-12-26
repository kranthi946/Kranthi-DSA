package org.example;


import java.util.HashMap;
import java.util.Map;

public class BalancedString {
    public static void main(String[] args) {
        String str = "abcabcabcsss"; // Example string (can be replaced with any input string)

        // Call the method to check if the string is balanced
        if (isBalanced(str)) {
            System.out.println("The string is balanced.");
        } else {
            System.out.println("The string is not balanced.");
        }
    }

    // Method to check if the string is balanced
    public static boolean isBalanced(String str) {
        // Create a map to store the count of each character
        Map<Character, Integer> countMap = new HashMap<>();

        // Count occurrences of each character in the string
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Use Stream to check if all counts are the same
        int firstCount = countMap.values().iterator().next();
        return countMap.values().stream().allMatch(count -> count == firstCount);
    }
}

