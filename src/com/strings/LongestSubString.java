package com.strings;

import java.util.Arrays;

public class LongestSubString {
    public static void main(String[] args) {

        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    private static int lengthOfLongestSubstring(String s) {
        //Create an integer array to store the last seen index of each character
        int[] lastseen = new int[128];
        Arrays.fill(lastseen, -1); //Initialize with -1

        int left=0, right=0, maxlen=0;

        while(right<s.length()){
            // If the character has been seen before and is within the current window
            if(lastseen[s.charAt(right)]>=left){
                // Move the left pointer to the position after the last seen position of the duplicate character
                left = lastseen[s.charAt(right)]+1;
            }
            lastseen[s.charAt(right)] = right; // Update the last seen index of the current character
            maxlen = Math.max(maxlen, right-left+1); // Update the maximum length
            right++;
        }
        return maxlen;
    }
}
