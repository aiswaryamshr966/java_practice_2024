package com.arrays;

public class PivotIndex {
    public static void main(String[] args) {
        int[] array = {1,7,3,6,5,6};
        System.out.println("The Pivot Index is: " + findPivotIndex(array));
    }

    private static int findPivotIndex(int[] array) {
        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            // If leftSum equals totalSum minus leftSum minus current element, it's the pivot index
            if (leftSum == totalSum - leftSum - array[i]) {
                return i;
            }
            // Update the leftSum by adding the current element
            leftSum += array[i];
        }
        return -1; // No pivot index found
    }
}
