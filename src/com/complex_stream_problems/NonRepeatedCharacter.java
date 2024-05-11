package com.complex_stream_problems;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {
    public static void main(String[] args){
        String sequence = "Hello Hitesh, How are you";

        char nonRepeatedCharacter = sequence.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(e->e.getValue()==1)
                        .map(e->e.getKey())
                        .findFirst()
                        .get();

        System.out.println("FirstNon Repeated Character: "+nonRepeatedCharacter);
    }
}
