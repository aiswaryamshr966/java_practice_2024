package com.arrays;

import java.util.Arrays;

/*
Eg,. arr[] = { 1,2,3,4,5} and d =2 then it becomes { 3,4,5,1,2 }
 */
public class Boomi2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        rotateArray(array,2);
    }

    private static void rotateArray(int[] arr, int order) {
        for (int i=0;i<order;i++){
            for (int j=arr.length-1;j>0;j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
