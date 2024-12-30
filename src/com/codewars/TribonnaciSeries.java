package com.codewars;

import java.util.Arrays;

/*
As the name may already reveal,
it works basically like a Fibonacci,
but summing the last 3 (instead of 2) numbers of the sequence to generate the next.

And, worse part of it, regrettably I won't get to hear non-native Italian speakers trying to pronounce it :(
So, if we are to start our Tribonacci sequence with [1, 1, 1] as a starting input (AKA signature),
we have this sequence:
[1, 1 ,1, 3, 5, 9, 17, 31, ...]
*/
public class TribonnaciSeries {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new int[]{1, 1, 1}, 10))); // [1.0, 1.0, 1.0, 3.0, 5.0, 9.0, 17.0, 31.0, 57.0, 105.0]
        System.out.println(Arrays.toString(tribonacci(new int[]{0, 0, 1}, 10))); // [0.0, 0.0, 1.0, 1.0, 2.0, 4.0, 7.0, 13.0, 24.0, 44.0]
        System.out.println(Arrays.toString(tribonacci(new int[]{0, 1, 2}, 5)));  // [0.0, 1.0, 2.0, 3.0, 6.0]
        System.out.println(Arrays.toString(tribonacci(new int[]{1, 2, 3}, 0)));  // []
    }

    private static int[] tribonacci(int[] array, int i) {
        if (i==0) return new int[0];
        if (i<=3) Arrays.copyOf(array, i);

        //Initialize the resultant array
        int[] result = new int[i];
        for(int j=0;j<3;j++) {
            result[j] = array[j];
        }

        //Calculate the remaining elements
        for(int j=3;j<i;j++) {
            result[j] = (result[j-1] + result[j-2] + result[j-3]);
        }

        return result;
    }
}
