package com.latest_practice;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        if (validAnagrams(s1,s2)) System.out.println("Anagrams are Valid");
        else System.out.println("Anagrams are Not Valid");
    }

    private static boolean validAnagrams(String s1, String s2) {
        return Arrays.equals(
                s1.chars().sorted().mapToObj(c -> (char) c).toArray(Character[]::new),
                s2.chars().sorted().mapToObj(c -> (char) c).toArray(Character[]::new)
        );
    }
}
