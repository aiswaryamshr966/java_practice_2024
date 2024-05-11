package com.generalcodes;

import java.util.Arrays;

public class LeftRightSumDifference {
    public static void main(String[] args) {
        int[] array = {10,4,8,3};

        System.out.println("Original Array : "+ Arrays.toString(array));
        System.out.println("After Left And Right Sum Differences : "+Arrays.toString(leftAndRightSumDifference(array.clone())));
    }

    private static int[] leftAndRightSumDifference(int[] nums) {
        int[] rightSumArray = new int[nums.length];
        int[] leftSumArray = new int[nums.length];
        int sum = 0;

        for (int i=0;i< nums.length;i++){
            leftSumArray[i] = sum;
            sum+=nums[i];
        }

        sum = 0;

        for (int i=nums.length-1;i>=0;i--){
            rightSumArray[i] = sum;
            sum+=nums[i];
        }

        int[] finalArray = new int[nums.length];

        for (int i=0;i< nums.length;i++){
            finalArray[i] = Math.abs(leftSumArray[i]-rightSumArray[i]);
        }

        return finalArray;
    }
}
