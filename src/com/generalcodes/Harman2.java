package com.generalcodes;

import java.util.stream.Stream;

/*
Finding Number..
Given an array containing n distinct numbers taken from 0,1,2, ..., n,
find the one that is missing from the array.
Print the number
Example 1: Input: [3,0,1] Output: 2
Example 2: Input: [9,6,4,2,3,5,7,0,1] Output: 8
 */
public class Harman2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] input = {3,0,1};
        for (int i=0;i<input.length;i++){
            sum = sum + input[i];
        }
    }
}
