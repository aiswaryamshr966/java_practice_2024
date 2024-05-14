package com.dynamic_programming;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; //Change n to calculate nth Fibonacci number

        //Time Complexity: O(2^n)
        int result = recursiveFibonacci(n);

        System.out.println("The "+n+"th Fibonacci number is "+result);

        //Time Complexity: O(n)
        int result2 = iterativeFibonacci(n);
        System.out.println("The "+n+"th Fibonacci number is "+result2);
    }

    private static int recursiveFibonacci(int n) {
        if (n<=1) return n; //Base case
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }

    private static int iterativeFibonacci(int n) {
        if (n<=1) return n; //Base case

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        //Fibonacci sequence
        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
