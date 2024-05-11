package com.stream_api_programming;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommonIdentification {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,2,2,3,3,3,4,10};
        Arrays.stream(array)
                .mapToObj(i->(int)i)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(e-> System.out.println(e.getKey()+"->"+e.getValue()));
    }
}