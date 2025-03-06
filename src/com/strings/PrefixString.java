package com.strings;

public class PrefixString {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};

        boolean isPrefix = findPrefix(s,words);
        if (isPrefix) System.out.println("The String Is A Prefix Of The Words!");
        else System.out.println("The String Is Not A Prefix Of The Words!");
    }

    private static boolean findPrefix(String s, String[] words) {
        StringBuilder prefix = new StringBuilder();

        for (String word : words) {
            prefix.append(word); // Concatenate the current word to the prefix
            if (prefix.toString().equals(s)) return true; // Found the prefix match
            if (prefix.length() > s.length()) return false; // Prefix longer than s
        }
        return false;
    }
}
