package com.stream_api_programming;

import java.util.Arrays;

public class FilteringEvenNumbers {
    public static void main(String[] args) {
        Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
                .filter(i -> i % 2 == 0)
                .forEach(i->System.out.print(i+" "));
    }
}
