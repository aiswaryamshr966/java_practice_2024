package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrencesEqual {
    public static void main(String[] args) {
        String word = "abacbc";
        long distinctFrequencies = word.chars()
                .mapToObj(c->Character.toLowerCase((char)c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .distinct()
                .count();

        if (distinctFrequencies==1) System.out.println("Frequencies of all the characters are same");
        else System.out.println("Frequencies of all the characters are not same");
    }
}
