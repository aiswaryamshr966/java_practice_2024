package com.dynamic_programming;

public class CoinChangeProblem {
    //Method to find the number of ways to make the total amount given using given coins
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for(int coin : coins) {
            for (int i=coin; i<=amount; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5}; //Change the array to include different coin denominations
        int amount = 10; //Change the amount to calculate the number of ways

        //Time complexity: O(n*amount)
        int result = coinChange(coins, amount);
        System.out.println("The number of ways to make "+amount+" using given coins is "+result);

    }
}
