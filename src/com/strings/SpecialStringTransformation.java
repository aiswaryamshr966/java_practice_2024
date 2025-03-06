package com.strings;

public class SpecialStringTransformation {
    public static void main(String[] args) {
        System.out.println(getLucky("iiii",1));
        System.out.println(getLucky("leetcode",2));
        System.out.println(getLucky("zbax",2));
    }

    private static int getLucky(String word, int steps) {
        //Step 1: Convert the string into native numeric form
        StringBuilder numericString = new StringBuilder();
        for(char c : word.toCharArray()){
            numericString.append(c-'a'+1); //Convert the character to its position in the alphabets
        }

        //Step 2: Transform the numeric string into integer by summing up the digits
        int sum = 0;
        for(char c : numericString.toString().toCharArray()){
            sum += c-'0';
        }

        //Step 3: Perform the transformation k times
        while(steps>1){
            sum = sumDigits(sum);
            steps--;
        }

        return sum;
    }

    // Helper method to sum the digits of a number
    private static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit
            num /= 10;       // Remove the last digit
        }
        return sum;
    }
}
