package com.cracking_the_coding_interview;

/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

/**
 *
 * @author aiswarya
 */
public class LongestPrefixString {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        String longestPrefix = longestCommonPrefix(strings);
        System.out.println("Longest common prefix: " + longestPrefix); // Output: Longest common prefix: fl

        String[] strings2 = {"apple", "ape", "application"};
        String longestPrefix2 = longestCommonPrefix(strings2);
        System.out.println("Longest common prefix: " + longestPrefix2); // Output: Longest common prefix: ap
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return ""; // Handle empty input
        String prefix = strs[0]; // Take the first string as the initial prefix
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Check if the current string starts with the prefix
                prefix = prefix.substring(0, prefix.length() - 1); // Remove the last character from the prefix
                if (prefix.isEmpty()) return ""; // If the prefix becomes empty, there is no common prefix
            }
        }
        return prefix;
    }
}
