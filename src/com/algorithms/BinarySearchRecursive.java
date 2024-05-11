package com.algorithms;

import java.util.Arrays;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int element = 5;

        int index = binarySearchRecursive(array.clone(), element, 0, array.length-1);
        System.out.println("The Index At Which "+element+" Is Present : "+index);
    }

    private static int binarySearchRecursive(int[] clone, int element, int left, int right) {
        if (left>right) return -1;
        Arrays.sort(clone);
        int mid = (left+right)/2;

        if (clone[mid]==element) return mid;
        else if (clone[mid]<element) return binarySearchRecursive(clone,element,mid+1,right);
        else return binarySearchRecursive(clone,element,left,mid-1);
    }
}
