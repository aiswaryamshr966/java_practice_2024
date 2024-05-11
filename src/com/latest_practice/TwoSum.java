package com.latest_practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int i = 0;
        int j = array.length - 1;
        int target = 9;

        int[] output = new int[2];

        while (i < j) {
            int currentSum = array[i] + array[j];

            if (currentSum == target) {
                output[0] = i;
                output[1] = j;
                break;
            } else if (currentSum < target) i++;
            else j--;
        }

        System.out.println("Indices: "+output[0]+","+output[1]);

        int[] array1 = {7,2,15,11};
        int target1 = 26;
        int[] resultant = findTwoSumIndices(array1,target1);
        System.out.println("Indices: "+resultant[0]+","+resultant[1]);
    }

    public static int[] findTwoSumIndices(int[] nums, int target) {
        Map<Integer, Integer> complementIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (complementIndices.containsKey(complement)) {
                return new int[]{complementIndices.get(complement), i};
            }

            complementIndices.put(nums[i], i);
        }

        return null; // No such indices found
    }
}

