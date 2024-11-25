package com.stream_api_programming;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Complex4 {
    public static void main(String[] args) {
        List<Integer> arraylist = List.of(1,2,3,2,1,1,2,3,4);

        arraylist = arraylist.stream().map(e->e+5).collect(Collectors.toList());
        System.out.println(arraylist);

        //output : only duplicate values

        Set<Integer> duplicateSet = arraylist.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(arraylist);
        System.out.println(duplicateSet);
    }
}
