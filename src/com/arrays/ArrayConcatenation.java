package com.arrays;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] array = {1,3,2,1};
        System.out.println("Original Array: "+ Arrays.toString(array));
        System.out.println("After Concatenation: "+Arrays.toString(concatenation(array.clone())));
    }

    private static int[] concatenation(int[] nums) {
        int[] array1 = new int[nums.length*2];
        int k = 0;
        while(k<array1.length){
            if (k<nums.length) {
                array1[k] = nums[k];
                k++;
            }
            else {
                array1[k] = array1[k-nums.length];
                k++;
            }
        }
        return array1;
    }
}
