package com.stream_api_programming;

import java.util.Arrays;

public class DifferenceOfElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] difference = Arrays.stream(arr1)
                .filter(i -> !Arrays.stream(arr2).anyMatch(j -> j == i))
                .toArray();
        System.out.println("Difference of elements: "+ Arrays.toString(difference));
    }
}
