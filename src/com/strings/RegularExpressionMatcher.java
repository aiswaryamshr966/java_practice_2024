package com.strings;

public class RegularExpressionMatcher {
    public static void main(String[] args) {
        //Implement regular expression matching with support for '.' and '*'
        System.out.println(isMatch("ab", ".*"));
        System.out.println(isMatch("aab", "c*a*b"));
        System.out.println(isMatch("mississippi", "mis*is*p*."));
    }

    private static boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        boolean firstMatch = (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // If the next character is a star, we have two options:
            // 1. Match the current character and move to the next in both strings.
            // 2. Skip the current character and move to the next in the pattern.
            return (isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p)));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}
