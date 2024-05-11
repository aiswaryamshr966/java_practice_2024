package com.strings;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println("The Longest Palindrome Substring is: " + longestPalindrome(s));
    }

    private static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        int start=0, end=0;
        for (int i=0; i<s.length(); i++) {
            int length1 = expandAroundCenter(s, i, i);
            int length2 = expandAroundCenter(s, i, i+1);
            int length = Math.max(length1, length2);
            if (length > end-start) {
                start = i - (length-1)/2;
                end = i + length/2;
            }
        }
        return s.substring(start, end+1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R-L-1;
    }
}
