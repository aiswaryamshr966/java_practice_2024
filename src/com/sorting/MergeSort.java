package com.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {48,2,50,25,15,24,4,44,15,48,41,46,43};
        System.out.println("Unsorted Array: "+ Arrays.toString(array));
        mergeSort(array,0,array.length-1);
        System.out.println("Sorted Array: "+ Arrays.toString(array));
    }

    private static void mergeSort(int[] array, int left, int right) {
        if(left<right){
            //Find the middle point of the array
            int mid = left+(right-left)/2;

            //Recursively sort the first and second halves
            mergeSort(array,left,mid);
            mergeSort(array,mid+1,right);

            merge(array,left,mid,right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        //Find the sizes of two subarrays to be merged
        int n1 = mid-left+1;
        int n2 = right-mid;

        //Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        //Copy data to temporary arrays
        for (int i=0;i<n1;i++) leftArray[i] = array[left+i];
        for (int j=0;j<n2;j++) rightArray[j] = array[mid+1+j];

        //Merge the temporary arrays

        //Initial indexes of the two subarrays
        int i=0, j=0;

        //Initial index of the merged subarray
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[], if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[], if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}