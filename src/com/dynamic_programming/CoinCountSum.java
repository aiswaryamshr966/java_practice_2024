package com.dynamic_programming;

import java.util.Arrays;

/*
    this approach is based on the dynamic programming using memoization
 */
public class CoinCountSum {
    // Driver code
    public static void main(String[] args)
    {
        int tc = 1;
        while (tc != 0) {
            int n, sum;
            n = 3;
            sum = 5;
            int[] coins = { 1, 2, 3 };
            int[][] dp = new int[n + 1][sum + 1];
            for (int[] row : dp)
                Arrays.fill(row, -1);
            int res = count(coins, sum, n, dp);
            System.out.println(res);
            tc--;
        }
    }
    // Recursive function to count the numeber of distinct
    // ways to make the sum by using n coins
    static int count(int[] coins, int sum, int n, int[][] dp)
    {
        // Base Case
        if (sum == 0) return dp[n][sum] = 1;

        // If number of coins is 0 or sum is less than 0 then
        // there is no way to make the sum.
        if (n == 0 || sum<0) return 0;

        // If the subproblem is previously calculated then
        // simply return the result
        if (dp[n][sum] != -1) return dp[n][sum];

        // Two options for the current coin
        return dp[n][sum] = count(coins, sum - coins[n - 1], n, dp) + count(coins, sum, n - 1, dp);
    }
}
