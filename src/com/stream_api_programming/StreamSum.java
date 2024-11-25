package com.stream_api_programming;

import java.util.Arrays;

public class StreamSum {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int sum = Arrays.stream(array)
                .reduce(0,Integer::sum);
        System.out.println("The Sum Of All The Elements : "+sum);
    }
}
