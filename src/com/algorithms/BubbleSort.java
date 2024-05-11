package com.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,3,4,2,7,10,8};
        int[] sorted = bubbleSort(array.clone());

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] bubbleSort(int[] clone) {
        int length = clone.length;
        for (int i=0;i<length;i++){
            for (int j=0;j<length-i-1;j++){
                if(clone[j]<clone[j+1]) {
                    int temp = clone[j+1];
                    clone[j+1] = clone[j];
                    clone[j] = temp;
                }
            }
        }
        return clone;
    }
}
