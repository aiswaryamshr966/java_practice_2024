package com.codewars;

import java.util.stream.IntStream;

/*
Some numbers have funny properties. For example:
- 89 --> 8^1 + 9^2 = 89
- 695 --> 6^2 + 9^3 + 5^4 = 1399 = 695*2
- 46288 --> 4^3 + 6^4 + 2^5 + 8^6 + 8^7 = 2360688 = 46288*51

Given two positive integers n and p, we want to find a positive integer k, if it exists,
such that the sum of the digits of n raised to consecutive powers starting from p is equal to k * n.

In other words,
writing the consecutive digits of n as a, b, c, d ..., is there an integer k such that :
(a^p + b^p+1 + c^p+2 + d^p+3 +...) = n*k
 */
public class PlayingWithDigits {
    public static void main(String[] args) {
        long multiplier = findMultiplier(46288,3);
        if (multiplier!=-1) System.out.println("Value Of Multiplier: " + multiplier);
        else System.out.println("No Multiplier Found");

        System.out.println("Value Of Multiplier Using Streams: " +digPow(46288,3));
    }

    private static long findMultiplier(int n, int p) {
        String digits = String.valueOf(n);
        long sum = 0;

        for(int i=0;i<digits.length();i++){
            int digit = Character.getNumericValue(digits.charAt(i));
            sum += power(digit, p + i);
        }

        if (sum%n==0) return sum/n;
        else return -1;
    }

    // Custom power method to calculate integer powers
    private static long power(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    //Using Streams
    public static long digPow(int n, int p) {
        int[] digits = String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
        int sum = IntStream.range(0, digits.length)
                .map(i -> (int) Math.pow(digits[i], i + p))
                .sum();
        return sum % n == 0 ? sum / n : -1;
    }
}
