package com.codewars;

import java.util.Arrays;
import java.util.Comparator;

/*
Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.
 */
public class ShortestLengthWord {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String shortestLength = findShortestWord(sentence);
        System.out.println("The shortest word(s) in the sentence have a length of: " + shortestLength+" with length "+shortestLength.length());
    }

    private static String findShortestWord(String sentence) {
        return Arrays.stream(sentence.toLowerCase().split(" "))
                .min(Comparator.comparingInt(String::length))
                .orElse("No minimum length word found");
    }
}
