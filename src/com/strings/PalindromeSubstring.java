package com.strings;

public class PalindromeSubstring {
    public static void main(String[] args) {
        String s = "01234567898765";

        String longestPalidrome = findLongestPalindrome(s);
        System.out.println("Longest com.generalcodes.Palindrome Substring: "+longestPalidrome);
    }

    private static String findLongestPalindrome(String s) {
        int maximumPalindromeLength = 0;
        String longestPalindromeString = "";
        int length = s.length();

        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                int len = j-i;
                String current = s.substring(i,j+1);
                if (isPalindrome(current)){
                    if (len>maximumPalindromeLength){
                        longestPalindromeString = current;
                        maximumPalindromeLength = len;
                    }
                }
            }
        }

        return longestPalindromeString;
    }

    private static boolean isPalindrome(String current) {
        for (int i=0;i<current.length();i++){
            if (current.charAt(i)!=current.charAt(current.length()-1-i)) return false;
        }
        return true;
    }
}
