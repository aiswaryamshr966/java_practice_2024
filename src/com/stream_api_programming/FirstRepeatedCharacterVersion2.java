package com.stream_api_programming;

import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class FirstRepeatedCharacterVersion2 {
    public static void main(String[] args) {
        String input = "abdfghabdgklpuhw";
        char repeatedCharacter = getRepeatedCharacter(input);

        System.out.println("The First Repeated Character: "+repeatedCharacter);

    }

    private static char getRepeatedCharacter(String input) {
        return input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .findFirst()
                .get()
                .getKey();
    }
}
