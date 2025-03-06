package com.strings;

public class NumberToRoman {
    public static void main(String[] args) {
        System.out.println(3749+"<=>"+numberToRoman(3749));
        System.out.println(58+"<=>"+numberToRoman(58));
        System.out.println(1994+"<=>"+numberToRoman(1994));
    }

    private static String numberToRoman(int number) {
        // Predefined arrays for Roman numeral values and their corresponding symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        //Use StringBuilder for efficient string concatenation
        StringBuilder romanNumeral = new StringBuilder();

        //Iterate through the values and symbols array
        for (int i=0;i<values.length;i++){
            //Append the values for each multiple of the value in number
            while (number >= values[i]){
                romanNumeral.append(symbols[i]);
                number -= values[i];
            }
        }

        return romanNumeral.toString();
    }
}
