package com.generalcodes;

import java.util.Arrays;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Example 1: Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
Example 2: Input: nums = [0] Output: [0]
 */
public class HarmanInterview {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] ordered = orderingByZero(nums.clone());

        System.out.println("Original Array : "+Arrays.toString(nums));
        System.out.println("Arrays After Ordering : "+Arrays.toString(ordered));
    }

    private static int[] orderingByZero(int[] clone) {
        int[] array = new int[clone.length];
        int k = 0;

        for(int i=0;i<clone.length;i++){
            if (clone[i]!=0) {
                array[k] = clone[i];
                k++;
            }
        }

        while(k< array.length){
            array[k] = 0;
            k++;
        }

        return array;
    }
}