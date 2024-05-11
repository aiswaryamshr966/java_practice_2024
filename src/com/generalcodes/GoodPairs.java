package com.generalcodes;

import java.util.Arrays;

public class GoodPairs {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,1,3};

        System.out.println("The Original Array : "+ Arrays.toString(array));
        System.out.println("The Number Of Good Pairs : "+goodPairs(array.clone()));
    }

    private static int goodPairs(int[] nums) {
        int pairs = 0;
        for (int i=0;i<nums.length;i++){
            for (int j =i+1;j<nums.length;j++){
                if (nums[i]==nums[j]) pairs++;
            }
        }
        return pairs;
    }
}
