package com.generalcodes;

import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewClass {
    public static void main(String[] args) {
        String str = "Hi All My Name Is Aiswarya Mishra";

        str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(e-> System.out.println(e.getKey()+" : "+e.getValue()));
    }
}
