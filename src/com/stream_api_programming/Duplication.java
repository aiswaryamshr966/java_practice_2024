package com.stream_api_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Duplication {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        //Filter duplicate elements and print list in reverse order.
        list.stream()
                .collect(Collectors.toSet())
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
