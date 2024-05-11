package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {48,2,50,25,15,24,4,44,15,48,41,46,43};
        System.out.println("Unsorted Array: "+ Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Sorted Array: "+ Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        int length = array.length;

        //Outer loop for the number of passes
        for (int i=0;i<length-1;i++){
            //Inner loop for each pass
            for (int j=0;j<length-i-1;j++){
                if (array[j]>array[j+1]){
                    //Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
