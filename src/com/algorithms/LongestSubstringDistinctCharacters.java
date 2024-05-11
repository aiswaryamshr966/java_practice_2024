package com.algorithms;

import java.util.HashSet;

public class LongestSubstringDistinctCharacters {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("The input is "+str);
        int length = longestSubstringDistinctCharacters(str);
        System.out.println("The length of the longest non repeating character substring is "+length);
    }

    private static int longestSubstringDistinctCharacters(String str) {
        if (str.length()==0) return 0;
        int n = str.length();

        HashSet<Character> set = new HashSet<>();;
        int len = 1;
        set.add(str.charAt(0));

        int i = 1;
        int maxLen = 0;

        while(i<n){
            if (str.charAt(i)!=str.charAt(i-1) && !set.contains(str.charAt(i))){
                set.add(str.charAt(i));
                len++;
                i++;
                if (len>maxLen) maxLen=len;
            }
            else{
                if (len==1) i++;
                else {
                    set.clear();
                    i=i-len+1;
                    len=0;
                }
            }
        }
        return Math.max(maxLen,len);
    }
}