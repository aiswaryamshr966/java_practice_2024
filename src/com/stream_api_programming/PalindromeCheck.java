package com.stream_api_programming;

import java.util.Arrays;
import java.util.List;

public class PalindromeCheck {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("madam", "hello", "racecar", "world");
        boolean allPalindromes = strings.stream()
                .allMatch(s -> new StringBuilder(s)
                        .reverse()
                        .toString()
                        .equals(s));

        System.out.println(allPalindromes);
    }
}
