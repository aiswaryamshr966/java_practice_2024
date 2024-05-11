package com.strings;

public class AtoiFunction {
    public static void main(String[] args) {

        System.out.println(myAtoi("   -42"));    // Output: -42
        System.out.println(myAtoi("4193 with words")); // Output: 4193
        System.out.println(myAtoi("words and 987")); // Output: 0
        System.out.println(myAtoi("-91283472332")); // Output: -2147483648 (Minimum integer value)
        System.out.println(myAtoi("42"));        // Output: 42
    }

    private static int myAtoi(String s) {
        s = s.trim(); //Removing any leading whitespaces
        if(s.length() == 0) return 0; //Checking if the string is null or empty
        int sign=1, result=0, index=0;
        if(s.charAt(0) == '+' || s.charAt(0) == '-') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            index = 1;
        }
        while(index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result*10 + digit;
            index++;
        }
        return result*sign;
    }
}
