package com.generalcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ListUser {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,7,8,9};
        long sum1 = Arrays.stream(array).sum();
        long sum2 = (9*(9+1))/2;

        long missing = sum2-sum1;
        System.out.println("Missing Number: "+missing);


    }
}