package com.strings;

import java.util.stream.Stream;

public class StringContains {
    public static void main(String[] args) {
        String[] arr = {"Aiswarya","Soumya","Amar","Laltu","Angan"};
        Stream.of(arr)
                .filter(name->name.startsWith("A"))
                .toList()
                .forEach(System.out::println);
    }
}
