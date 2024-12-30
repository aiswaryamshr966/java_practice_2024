package com.codewars;

/*
Given two arrays a and b write a function comp(a, b) (orcompSame(a, b))
that checks whether the two arrays have the "same" elements,
with the same multiplicities (the multiplicity of a member is the number of times it appears).
"Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]

comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on.
It gets obvious if we write b's elements in terms of squares:
 */

import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(compareArrays(a, b)); // Output: true
    }

    private static boolean compareArrays(int[] a, int[] b) {
        if(a==null||b==null) return false;
        if(a.length!=b.length) return false;

        //Squaring the first array
        int[] squaredArray = Arrays.stream(a)
                .map(element->element*element)
                .sorted()
                .toArray();

        //Sort the second array
        int[] sortedArray = Arrays.stream(b)
                .sorted()
                .toArray();

        return Arrays.equals(squaredArray, sortedArray);
    }
}
