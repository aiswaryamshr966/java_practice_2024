package com.generalcodes;

public class Palindrome {
    public static void main(String[] args) {
        String name = "Aiswarya";
        if (isPalindrome(name)) System.out.println("The Given Input Is com.generalcodes.Palindrome");
        else System.out.println("The Given input Is Not com.generalcodes.Palindrome");
    }

    private static boolean isPalindrome(String name) {
        int left = 0;
        int right = name.length()-1;
        while(left<right){
            if(name.charAt(left)!=name.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
