package com.stream_api_programming;

import java.util.Arrays;

public class AverageOfElements {
    public static void main(String[] args) {
        double average = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
                                .asDoubleStream()
                                .average()
                                .getAsDouble();
        System.out.println("Average of elements: "+average);
    }
}
