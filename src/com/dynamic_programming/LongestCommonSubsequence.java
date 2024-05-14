package com.dynamic_programming;

public class LongestCommonSubsequence {
    //Method to find the length of the longest common subsequence
    //Time complexity: O(m*n)
    public static int longestCommonSubsequence(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "acbd";
        int result = longestCommonSubsequence(s1, s2);
        System.out.println("The length of the longest common subsequence is "+result);
    }
}
