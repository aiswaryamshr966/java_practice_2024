package com.dynamic_programming;

public class KnapsackProblem {
    public static void main(String[] args) {
        int[] values = {3, 4, 5, 6}; //Change the values of items
        int[] weights = {2, 3, 4, 5}; //Change the weights of items

        int capacity = 8; //Change the capacity of the knapsack

        //Time complexity: O(n*capacity)
        int result = knapsack(capacity,weights,values);

        System.out.println("The maximum value that can be stored in the knapsack is "+result);
    }

    //Method to find the maximum value that can be stored in the knapsack
    private static int knapsack(int capacity, int[] weights, int[] values) {
        int n = weights.length;
        int[][] dp = new int[n+1][capacity+1];

        //Building up the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i-1] > j) {
                    //if the current item cannot be included
                    dp[i][j] = dp[i-1][j];
                } else {
                    //if the current item can be included
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weights[i-1]] + values[i-1]);
                }
            }
        }
        return dp[n][capacity];
    }
}
