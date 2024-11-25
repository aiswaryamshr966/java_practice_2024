package com.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubArraysWithDistinctKElements {
    public static void main(String[] args) {
        //Let us consider we have nums = [1,2,1,2,3], k = 2, where k is the distinct count
        int[] nums = {1,2,1,2,3};
        int k = 2;

        int countBruteForce = bruteForceApproach(nums, k);
        int countOptimal = optimalApproach(nums, k);
        System.out.println("(Brute Force Approach) The Count Of Subarrays With Distinct K Elements: "+countBruteForce);
        System.out.println("(Optimal Approach) The Count Of Subarrays With Distinct K Elements: "+countOptimal);
    }

    public static int bruteForceApproach(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> uniqueElements = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                uniqueElements.add(nums[j]);

                if (uniqueElements.size() == k) { // Check if the current subarray has exactly k distinct integers
                    count++;
                } else if (uniqueElements.size() > k) {
                    break; // No need to check further as unique count exceeds k
                }
            }
        }
        return count;
    }

    //SLiding Window Approach and Most Optimised
    private static int optimalApproach(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }

    private static int atMost(int[] nums, int i) {
        int left=0;
        int count=0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int right=0; right<nums.length; right++) {
            frequencyMap.put(nums[right], frequencyMap.getOrDefault(nums[right], 0) + 1); //Add the current number into frequency map
            while (frequencyMap.size() > i) { //If the frequency map size is greater than k, remove the left element from the map
                frequencyMap.put(nums[left], frequencyMap.get(nums[left]) - 1);
                if (frequencyMap.get(nums[left]) == 0) {
                    frequencyMap.remove(nums[left]);
                }
                left++;
            }
            count += right - left + 1; //Count the subarrays ending at right with at most 'k' distinct elements
        }
        return count;
    }
}
