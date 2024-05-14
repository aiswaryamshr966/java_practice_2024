package com.dynamic_programming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    //Method to find the length of the longest increasing subsequence
    //Time complexity: O(n^2)
    public static int longestIncreasingSubsequence(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];

        Arrays.fill(dp, 1);
        int max = 1;

        //Building up the dp array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max; //Return the length of the longest increasing subsequence
    }

    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        int result = longestIncreasingSubsequence(nums);

        System.out.println("The length of the longest increasing subsequence is "+result);
    }
}
