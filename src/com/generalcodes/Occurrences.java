package com.generalcodes;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurrences {
    public static void main(String[] args) {
        String name = "Aiswarya Mishra";
        name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + " : " + value));
    }
}