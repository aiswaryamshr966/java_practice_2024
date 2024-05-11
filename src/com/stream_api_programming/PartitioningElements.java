package com.stream_api_programming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Map<Boolean, List<Integer>> oddAndEven = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Odd numbers: " + oddAndEven.get(false));
        System.out.println("Even numbers: " + oddAndEven.get(true));
    }
}
