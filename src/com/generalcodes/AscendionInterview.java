package com.generalcodes;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AscendionInterview {
    public static void main(String[] args) {
        int[] arr = {5,8,1,5,7,2,8,4};
        System.out.println("Array with duplicates and without sorting: "+Arrays.toString(arr));
        System.out.print("Array after duplicates removal and with sorting: ");
        IntStream.of(arr)
                .distinct()
                .sorted()
                .forEach(i->System.out.print(i+" "));
    }
}
