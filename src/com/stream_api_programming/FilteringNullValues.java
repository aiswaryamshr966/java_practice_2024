package com.stream_api_programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringNullValues {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "", "orange", null, "banana", "kiwi");
        List<String> nonNullNonEmptyStrings = strings.stream()
                .filter(s -> s != null && !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println(nonNullNonEmptyStrings);
    }
}
