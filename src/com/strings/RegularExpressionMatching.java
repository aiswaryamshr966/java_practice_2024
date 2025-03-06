package com.strings;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        RegularExpressionMatching matcher = new RegularExpressionMatching();

        System.out.println(matcher.isMatch("aa","a"));
        System.out.println(matcher.isMatch("aa","a*"));
        System.out.println(matcher.isMatch("ab",".*"));
    }

    private boolean isMatch(String string, String pattern) {
        if (pattern == null || string == null) return false;

        int m = string.length();
        int n = pattern.length();

        //Create a dynamic programming table
        boolean[][] dp = new boolean[m + 1][n + 1];

        //If p is empty, string can't be empty
        dp[0][0] = true;

        //Fill the table pattern with "*"
        for (int j = 1; j <= n; j++) {
            if (pattern.charAt(j - 1) == '*') dp[0][j] = dp[0][j - 2];
        }

        //Fill in the DP Table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sChar = string.charAt(i - 1);
                char pChar = pattern.charAt(j - 1);

                if (pChar == '.' || pChar == sChar) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pChar == '*') {
                    dp[i][j] = dp[i][j - 2] ||
                            (dp[i - 1][j] && (pattern.charAt(j - 2) == sChar || pattern.charAt(j - 2) == '.'));
                }
            }
        }
        return dp[m][n];
    }
}
