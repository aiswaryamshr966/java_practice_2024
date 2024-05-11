package com.leetcode_ace_coding;

/*
Not in an ordinary way, we are trying to merge two strings
in the sense that each character is merged with alternate ways

example word 1 = abc and word 2 = def
then merger = adbecf
 */
public class MergeStrings {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqrstuv";
        String merged = mergeStrings(s1, s2);
        System.out.println(merged);
    }

    private static String mergeStrings(String s1, String s2) {
        //This statement creates a StringBuilder instance which will help in merging two strings
        StringBuilder merged = new StringBuilder();
        int i = 0;
        for (i = 0; i < s1.length(); i++) {
            merged.append(s1.charAt(i));
            if (i < s2.length())
                merged.append(s2.charAt(i));
        }

        if(i<s2.length())
            merged.append(s2.substring(i));
        return merged.toString();
    }
}
