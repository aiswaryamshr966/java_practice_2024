package com.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Aiswarya Mishra";
        System.out.println(Stream.of(name)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "))
        );
    }
}
