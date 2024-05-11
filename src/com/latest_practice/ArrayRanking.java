package com.latest_practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayRanking {
    public static void main(String[] args) {
        int[] array = {10,5,8,2,7};
        calculateRank(array);
    }

    private static void calculateRank(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        Map<Integer,Integer> rankedMap = new HashMap<>();
        Arrays.stream(sortedArray).forEach(e->rankedMap.put(e,Arrays.binarySearch(sortedArray,e)+1));
        rankedMap.entrySet().stream().forEach(System.out::println);
    }
}
