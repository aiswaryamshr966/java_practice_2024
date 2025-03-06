package com.leetcode_ace_coding;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }

    private static int searchInsert(int[] nums, int target) {
        if (nums.length==0) return -1;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }
}
