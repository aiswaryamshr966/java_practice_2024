package com.stream_api_programming;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacterVersion2 {
    public static void main(String[] args) {
        String input = "abdfghabdgklpuhw";
        char repeatedCharacter = input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .findFirst()
                .get()
                .getKey();

        System.out.println("The First Repeated Character: "+repeatedCharacter);
    }
}
