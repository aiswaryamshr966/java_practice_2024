package com.latest_practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateIdentificationLevel2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }

        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(nums[i]) && i - indexMap.get(nums[i]) <= k) {
                return true;
            }

            indexMap.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println(result);  // Output: true
    }
}
