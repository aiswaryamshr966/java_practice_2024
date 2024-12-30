package com.codewars;

import java.util.HashMap;
import java.util.Map;

/*
Write a function that will return the count of distinct case-insensitive alphabetic characters
and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 */
public class CoutOfDistinceRepeatedCharacters {
    public static void main(String[] args) {
        System.out.println("Count Of Repetitive Characters: "+findCountOfRepetitiveCharacters("abcde"));
        System.out.println("Count Of Repetitive Characters: "+findCountOfRepetitiveCharacters("12345"));
        System.out.println("Count Of Repetitive Characters: "+findCountOfRepetitiveCharacters("Aa1B2c3"));
        System.out.println("Count Of Repetitive Characters: "+findCountOfRepetitiveCharacters("Hello World"));
        System.out.println("Count Of Repetitive Characters: "+findCountOfRepetitiveCharacters("")); // Empty string should return 0
    }

    private static int findCountOfRepetitiveCharacters(String text) {
        Map<Character, Integer> charCount = new HashMap<>();
        text = text.toLowerCase(); // Convert to lowercase for case-insensitivity

        // Count occurrences of each character
        for (char c : text.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Count characters that appear more than once
        int duplicates = 0;
        for (int count : charCount.values()) {
            if (count > 1) {
                duplicates++;
            }
        }

        return duplicates;
    }
}
