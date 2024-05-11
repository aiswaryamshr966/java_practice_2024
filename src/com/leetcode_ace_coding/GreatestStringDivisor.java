package com.leetcode_ace_coding;

public class GreatestStringDivisor {
    public static void main(String[] args) {

        String s1 = "ababab";
        String s2 = "ab";
        String gcd = gcdOfStrings(s1, s2);
        System.out.println(gcd);
    }

    private static String gcdOfStrings(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m+1][n+1];
        int maxLength = 0;
        int endIndex = 0;

        for (int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    if(dp[i][j] > maxLength){
                        maxLength = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }
    return s1.substring(endIndex-maxLength, endIndex);
    }
}