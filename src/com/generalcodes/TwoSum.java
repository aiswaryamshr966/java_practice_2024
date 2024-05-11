package com.generalcodes;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        findTwoSum(arr,target);
    }

    private static void findTwoSum(int[] arr, int target) {
        for(int i : arr){
            if (Arrays.stream(arr).anyMatch(n->n==(target-i))) {
                System.out.println("Pairs: "+i+","+(target-i));
                break;
            }
        }
    }
}
