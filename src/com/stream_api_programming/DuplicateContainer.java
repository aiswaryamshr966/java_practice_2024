package com.stream_api_programming;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateContainer {
    public static void main(String[] args) {
        int[] array = {1,2,3,1};
        boolean duplicate = Arrays.stream(array)
                .mapToObj(i->(int) i)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .anyMatch(e->e.getValue()>1);

        if (duplicate) System.out.println("Duplicate is present");
        else System.out.println("Duplicate is not present");
    }
}
