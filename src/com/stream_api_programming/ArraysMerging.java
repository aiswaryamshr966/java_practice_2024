package com.stream_api_programming;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysMerging {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        Object[] mergedArray = Stream.concat(Arrays.stream(arr1).boxed(),Arrays.stream(arr2).boxed())
                                    .sorted()
                                    .toArray();

        System.out.println(Arrays.toString(mergedArray));

        int[] merger = Stream.of(arr1,arr2)
                .flatMapToInt(IntStream::of)
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(merger));
    }
}
