package com.generalcodes;/*
* input={"a","b","c","d","e","a","b","c","a"};
* output= {a=3, b=2, c=2, d=1, e=1}
*/

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListConversion {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a","b","c","d","e","a","b","c","a","b","b","a","a"));
        System.out.println(list);

        List<Map.Entry<String,Long>> listMap;
        listMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        Collections.reverse(listMap);

        System.out.println(listMap);
    }
}
