package com.stream_api_programming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingElementsByLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "orange", "banana", "kiwi");
        Map<Integer, List<String>> groupedByLength = strings.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groupedByLength);
    }
}
