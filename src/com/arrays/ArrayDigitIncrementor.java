package com.arrays;

import java.util.Arrays;

public class ArrayDigitIncrementor {
    public static void main(String[] args) {
        int[] array = new int[]{9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};;
        System.out.println("Original Array:     " + Arrays.toString(array));
        System.out.println("Incremented Array:  " + Arrays.toString(incrementArray(array)));
    }

    private static int[] incrementArray(int[] array) {
        int n = array.length;

        // Traverse the array from the last digit to the first digit
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, simply increment it and return the result
            if (array[i] < 9) {
                array[i]++;
                return array;
            }
            // If the digit is 9, set it to 0 and continue to the next digit
            array[i] = 0;
        }

        // If all digits were 9, we need to add an additional digit at the beginning
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
