package com.stream_api_programming;

import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharactersInName {
    public static void main(String[] args) {
        String name = "Aiswarya Mishra";
        name.chars()
                .mapToObj(c->(char)c)
                .map(Character::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(e-> System.out.println(e.getKey()+"->"+e.getValue()));
    }
}
