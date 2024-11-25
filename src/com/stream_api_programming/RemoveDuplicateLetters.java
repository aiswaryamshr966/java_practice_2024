package com.stream_api_programming;

import java.util.stream.Collectors;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String input = "LETTERS";
        String result = input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .collect(Collectors.joining());

        System.out.println("String with duplicates removed: " + result);
    }
}
