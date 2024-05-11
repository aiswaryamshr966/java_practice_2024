package com.stream_api_programming;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUniqueCharacter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "orange", "banana");
        Set<Character> uniqueCharacters = strings.stream()
                .flatMap(s -> s.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toSet());

        System.out.println(uniqueCharacters);
    }
}
