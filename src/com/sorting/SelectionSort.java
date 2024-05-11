package com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {48,2,50,25,15,24,4,44,15,48,41,46,43};
        System.out.println("Unsorted Array: "+ Arrays.toString(array));
        selectionSort(array);
        System.out.println("Sorted Array: "+ Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        int length = array.length;

        //One by one move the boundary of the unsorted subarray
        for (int i=0;i<length-1;i++){
            //Find the minimum element in the unsorted subarray
            int minIndex = i;
            for (int j=i+1;j<length;j++){
                if (array[j]<array[minIndex]) minIndex = j;
            }
            //swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
