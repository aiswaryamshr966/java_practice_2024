package com.dynamic_programming;

public class MatrixChaainMultiplication {
    //Method to find the most efficient way yo multiply matrices
    public static int matrixChainOrder(int[] dims){
        int n = dims.length;
        int[][] dp = new int[n][n];

        //Building up the dp array
        for (int len=2;len<n;len++){
            for (int i=1;i<n-len+1;i++){
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k=i;k<j;k++){
                    int temp = dp[i][k] + dp[k+1][j] + dims[i-1]*dims[k]*dims[j];
                    if (temp<dp[i][j]){
                        dp[i][j] = temp;
                    }
                }
            }
        }
        return dp[1][n-1];
    }

    public static void main(String[] args) {
        int[] dims = {10,30,5,60};
        int result = matrixChainOrder(dims); //Time complexity: O(n^3)
        System.out.println("The most efficient way to multiply matrices is "+result);
    }
}
