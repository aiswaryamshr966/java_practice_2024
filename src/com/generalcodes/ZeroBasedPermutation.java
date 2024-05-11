package com.generalcodes;

import java.util.Arrays;

public class ZeroBasedPermutation {
    public static void main(String[] args) {
        int[] array = {0,2,1,5,3,4};
        System.out.println("Original Array: "+Arrays.toString(array));
        System.out.println("After Zero Based Permutation: "+Arrays.toString(zeroBasedPermutation(array.clone())));
    }

    private static int[] zeroBasedPermutation(int[] nums) {
        int[] array1 = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            array1[i] = nums[nums[i]];
        }
        return array1;
    }
}
