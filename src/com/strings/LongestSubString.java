package com.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {

        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        int ans2 = lengthOfLongestSubstringOptimized(s);
        System.out.println(ans);
        System.out.println(ans2);
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

    private static int lengthOfLongestSubstringOptimized(String s) {
        int length = s.length();
        int maxLength = 0;
        int left = 0;

        Set<Character> characterSet = new HashSet<>();

        for(int right=0;right<length;right++){
            while(characterSet.contains(s.charAt(right))){
                characterSet.remove(s.charAt(left)); // Remove the character from the set
                left++; // Move the left pointer to the next position
            }
            characterSet.add(s.charAt(right)); // Add the current character to the set
            maxLength = Math.max(maxLength, right-left+1); // Update the maximum length
        }
        return maxLength;
    }
}
