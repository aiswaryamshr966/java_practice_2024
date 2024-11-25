package com.complex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Complex2 {
    public static void main(String[] args) {
        int[] arr = {1,22,100,1000,10000};

        System.out.println("Original array: " + Arrays.toString(arr));
        List<Integer> evenDigitNumbers = new ArrayList<>();

        for (int i : arr){
            if (Integer.toString(i).length() % 2 == 0){
                evenDigitNumbers.add(i);
            }
        }

        System.out.println("Numbers with an even number of digits: " + evenDigitNumbers);

        Arrays.stream(arr)
                .filter(i -> Integer.toString(i).length() % 2 == 0) // filter based on even number of digits
                .forEach(System.out::println);

        List<Integer> nums = Arrays.asList(1,22,100,2567,10000,9876545);
        nums.stream()
                .filter(i -> Integer.toString(i).length() % 2 == 0) // filter based on even number of digits
                .forEach(System.out::println);
    }
}
