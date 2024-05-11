package com.stream_api_programming;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCalculator {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,2,5,7,2,5,8,4,3,1,4};
        Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .forEach(entry-> System.out.println(entry.getKey()+" : "+entry.getValue()));
    }
}
