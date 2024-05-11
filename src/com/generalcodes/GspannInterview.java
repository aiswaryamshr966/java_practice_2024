package com.generalcodes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GspannInterview {
    public static void main(String[] args) {
        String str = "Aiswarya Mishra is a java developer";

        Character firstNonRepeatedCharacter = str.toLowerCase()
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e-> !(e.getValue() >1))
                .findFirst()
                .get()
                .getKey();

        System.out.println("First Non Repeated Character in the string: "+firstNonRepeatedCharacter);

        List<String> newList = new ArrayList<>();
    }
}
