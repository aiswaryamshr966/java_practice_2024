package com.stream_api_programming;

import java.util.Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int sum = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}).sum();
        System.out.println("Sum of elements: "+sum);
    }
}
