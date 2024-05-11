package com.stream_api_programming;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueCharacterInAName {
    public static void main(String[] args) {
        String name = "Aiswarya Mishra";
        name.chars()
                .mapToObj(c->(char)c)
                .map(Character::toLowerCase)
                .filter(Character::isAlphabetic)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .forEach(e->System.out.println(e.getKey()));
    }
}
