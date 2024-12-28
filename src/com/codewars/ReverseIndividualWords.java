package com.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseIndividualWords {
    public static void main(String[] args) {
        String sentence = "Hey fellow warriors";
        String reversedSentence = reverseWords(sentence);
        System.out.println("Original Word -> "+sentence);
        System.out.println("Reversed Word -> "+reversedSentence);
    }

    private static String reverseWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(word->word.length() >= 5 ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }
}
