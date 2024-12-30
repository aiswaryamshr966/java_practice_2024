package com.codewars;

/*
Let's say you are given the array {1,2,3,4,3,2,1}:
Your function will return the index 3,
because at the 3rd position of the array,
the sum of left side of the index ({1,2,3}) and the sum of the right side of the index ({3,2,1})
both equal 6.
 */
public class ArraySideSum {
    public static void main(String[] args) {
        int[] arr = {1,100,50,-51,1,1};
        System.out.println(findEqualSumIndex(arr)); // Output: 3
    }

    private static int findEqualSumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            // Right sum is totalSum - leftSum - arr[i]
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i; // Found the index
            }

            // Update leftSum for the next iteration
            leftSum += arr[i];
        }

        return -1; // No such index found
    }
}
