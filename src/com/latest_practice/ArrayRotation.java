package com.latest_practice;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int steps = 3;

        System.out.println("Original Array: "+ Arrays.toString(array));
        rotateArray(array, steps);
        System.out.println("Rotated Array: "+ Arrays.toString(array));
    }

    private static void rotateArray(int[] array, int steps) {
        int length = array.length;

        //To handle the cases where the number of steps is greater than the array length.
        steps = steps%length;
        //Reverse the entire array
        reverse(array,0,length-1);
        //Reverse the first 'steps' elements
        reverse(array,0,steps-1);
        //Reverse the remaining elements
        reverse(array, steps,length-1);
    }

    private static void reverse(int[] array, int start, int end) {
        while(start<end){
            //Swap elements at the start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            //Move indices
            start++;
            end--;
        }
    }
}
