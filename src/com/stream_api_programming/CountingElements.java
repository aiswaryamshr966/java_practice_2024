package com.stream_api_programming;

import java.util.Arrays;

public class CountingElements {
    public static void main(String[] args) {
        long count = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
                            .count();
        System.out.println("Count of elements: "+count);
    }
}
