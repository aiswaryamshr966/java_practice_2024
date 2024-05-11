package com.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {48,2,50,25,15,24,4,44,15,48,41,46,43};
        System.out.println("Unsorted Array: "+ Arrays.toString(array));
        insertionSort(array);
        System.out.println("Sorted Array: "+ Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        int length = array.length;

        for (int i = 1; i < length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }
}
