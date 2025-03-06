package com.leetcode_ace_coding;

/*
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
*/
public class StrairStepsCounter {
    public static void main(String[] args) {
        int n = 2;
        System.out.println("The number of ways to climb to the top : "+climbStairs(n));
    }

    private static int climbStairs(int n) {
        if (n == 1) return 1; // Base case for 1 step

        // Initialize the first two steps
        int first = 1; // Ways to climb 1 step
        int second = 2; // Ways to climb 2 steps

        // Compute for steps 3 to n
        for (int i = 3; i <= n; i++) {
            int current = first + second; // Number of ways to reach the current step
            first = second; // Move the window forward
            second = current;
        }

        return second; // Second holds the result for n steps
    }
}
