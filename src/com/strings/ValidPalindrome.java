package com.strings;

public class ValidPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        boolean isPalindrome = isPalindrome(s);
        System.out.println(isPalindrome);
    }

    private static boolean isPalindrome(String s) {
        if (s==null || s.length()==0) return true;
        int left = 0, right = s.length()-1;
        while (left<=right) {
            // Move left pointer to the next alphanumeric character
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            // Move right pointer to the previous alphanumeric character
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            // Check if the characters at left and right pointers are equal (ignoring case)
            if (Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
