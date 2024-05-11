package com.stream_api_programming;

import java.util.Arrays;

public class FindingMaximumElement {
    public static void main(String[] args) {
        Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
                .max()
                .ifPresent(System.out::println);
    }
}
