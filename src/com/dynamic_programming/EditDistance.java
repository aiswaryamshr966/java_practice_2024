package com.dynamic_programming;

public class EditDistance {
    public static void main(String[] args) {
        String s1 = "intention";
        String s2 = "execution";
        int result = editDistance(s1, s2);
        System.out.println("The minimum number of operations required is "+result);
    }

    private static int editDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        //Time complexity: O(m*n)
        int[][] dp = new int[m+1][n+1];

        //Building up the dp array
        for (int i=0;i<=m;i++){
            for (int j=0;j<=n;j++){
                if (i==0) dp[i][j] = j;
                else if (j==0) dp[i][j] = i;
                else if (s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
                else dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
            }
        }

        return dp[m][n];
    }
}
