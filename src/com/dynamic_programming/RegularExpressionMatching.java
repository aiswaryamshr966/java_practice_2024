package com.dynamic_programming;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        String s = "aa";
        String p = "a*";
        boolean result = isMatch(s, p);
        System.out.println("The result is "+result);
    }

    private static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;

        //Handling cases when the pattern starts with '*'
        for (int j=1;j<=n;j++){
            if (p.charAt(j-1)=='*') dp[0][j] = dp[0][j-2];
        }

        //Building up the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) dp[i][j] = dp[i - 1][j - 1];
                else if (p.charAt(j - 1) == '*'){
                    if (j >= 2) { // Check if '*' is not the first character in pattern
                        dp[i][j] = dp[i][j - 2] || ((s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') && dp[i - 1][j]);
                    }
                }
            }
        }

        return dp[m][n];
    }
}
