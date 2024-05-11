package com.stream_api_programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ReverseSorting {
    public static void main(String[] args) {
        Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(i->System.out.print(i+" "));
    }
}
