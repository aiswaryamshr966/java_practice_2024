package com.arrays;

import java.util.Arrays;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] array = {2,5,1,3,4,7};
        int pivot = 3;

        System.out.println("Original Array : "+ Arrays.toString(array));
        System.out.println("After Shuffle : "+ Arrays.toString(shuffle(array.clone(),pivot)));
    }

    private static int[] shuffle(int[] nums, int pivot) {
        int[] array1 = new int[2*pivot];
        int k = 0;
        for (int i=0;i<2*pivot;i=i+2){
            array1[i] = nums[k];
            array1[i+1] = nums[pivot+k];
            k++;
        }

        return array1;
    }
}
