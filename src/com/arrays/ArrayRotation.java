package com.arrays;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        System.out.print("Original Array: ");
        Arrays.stream(array).forEach(z-> System.out.print(z+" "));
        System.out.println();

        System.out.print("Intermediate Array Solution: ");
        intermediateArray(array.clone(), 5);
        System.out.println();

        System.out.print("Bubble Array Solution: ");
        bubbleRotate(array.clone(), 5);
        System.out.println();

        System.out.print("Reversal Solution: ");
        reversalRotate(array.clone(), 5);
        System.out.println();
    }

    //Intermediate Array Method
    public static void intermediateArray(int[] nums, int k) {
        if(k > nums.length) k=k%nums.length;

        int[] result = new int[nums.length];

        for(int i=0; i < k; i++){
            result[i] = nums[nums.length-k+i];
        }

        int j=0;

        for(int i=k; i<nums.length; i++){
            result[i] = nums[j];
            j++;
        }

        System.arraycopy( result, 0, nums, 0, nums.length );
        Arrays.stream(nums).forEach(z-> System.out.print(z+" "));
    }

    //Bubble Sort Rotation Solution
    private static void bubbleRotate(int[] arr, int order) {
        if (arr==null||order<0) throw new IllegalArgumentException("Illegal Argument");
        for (int i=0;i<order;i++){
            for (int j=arr.length-1;j>0;j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        Arrays.stream(arr).forEach(z-> System.out.print(z+" "));
    }

    //Reversal Recursive Solution
    public static void reversalRotate(int[] arr, int order) {
        order = order % arr.length;
        if (arr == null || order < 0) throw new IllegalArgumentException("Illegal argument!");

        //length of first part
        int a = arr.length - order;
        reverse(arr, 0, a-1);
        reverse(arr, a, arr.length-1);
        reverse(arr, 0, arr.length-1);

        Arrays.stream(arr).forEach(z-> System.out.print(z+" "));
    }

    public static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1) return;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}