package com.generalcodes;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AscendionInterview2 {
    public static void main(String[] args) {
        String name = "Aiswarya Mishra";
        char character = name.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .findFirst()
                .get()
                .getKey();

        System.out.println("First duplicate character in string: "+character);
    }
}
