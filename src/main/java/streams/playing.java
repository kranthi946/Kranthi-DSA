package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class playing {

    public static void main(String[] args) {

        // Creating a mixed list with different types (int, char, String, and number words)
        List<Object> mixedList = Arrays.asList(
                1,               // Integer
                'b',             // Character ('b' -> 2)
                "three",         // String ("three" -> 3)
                4,               // Integer
                'd',             // Character ('d' -> 4)
                "nine",          // String ("nine" -> 9)
                7,               // Integer
                'f',             // Character ('f' -> 6)
                "six",           // String ("six" -> 6)
                "ten",           // String ("ten" -> 10)
                10               // Integer
        );

        // Mapping number words to their integer values
        Map<String, Integer> wordToNumberMap = new HashMap<>();
        wordToNumberMap.put("one", 1);
        wordToNumberMap.put("two", 2);
        wordToNumberMap.put("three", 3);
        wordToNumberMap.put("four", 4);
        wordToNumberMap.put("five", 5);
        wordToNumberMap.put("six", 6);
        wordToNumberMap.put("seven", 7);
        wordToNumberMap.put("eight", 8);
        wordToNumberMap.put("nine", 9);
        wordToNumberMap.put("ten", 10);

        // Convert each element in the mixed list to int and print the result
        mixedList.stream()
                .map(e -> {
                    if (e instanceof Integer) {
                        return (Integer) e;  // If it's already an Integer, use it directly
                    } else if (e instanceof String) {
                        // Check if the string is a number word and map it to an integer
                        Integer number = wordToNumberMap.get(e.toString().toLowerCase());
                        return number != null ? number : Integer.parseInt((String) e);  // Convert String to Integer (if not a word)
                    } else if (e instanceof Character) {
                        // Convert Character to numeric value ('a' -> 1, 'b' -> 2, ..., 'z' -> 26)
                        char ch = (Character) e;
                        if (Character.isLetter(ch)) {
                            return Character.toLowerCase(ch) - 'a' + 1;
                        }
                        return 0;  // If it's not a letter, return 0
                    } else {
                        return 0;  // Default case for unsupported types
                    }
                })
                .forEach(System.out::println);  // Print the result
    }
}
