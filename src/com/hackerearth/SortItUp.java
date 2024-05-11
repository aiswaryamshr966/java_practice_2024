package com.hackerearth;

import java.util.Arrays;

public class SortItUp {
    public static void main(String[] args) {
        int[] array = {2,0,1,0,2,0,1,2,1,0,1};
        System.out.println("Unsorted Array: "+ Arrays.toString(array));
        System.out.println("Sorted Array: "+sortItUp(array.clone()));
    }

    private static String sortItUp(int[] clone) {
        int left = 0;
        int right = clone.length-1;
        int i = 0;
        while(i<=right){
            if (clone[i]==2){
                clone[i] = clone[right];
                clone[right] = 2;
                right--;
            } else if (clone[i]==1) {
                i++;
            }else {
                clone[i] = clone[left];
                clone[left] = 0;
                left++;
                i++;
            }
        }
        return Arrays.toString(clone);
    }
}