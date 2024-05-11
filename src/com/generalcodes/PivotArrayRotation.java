package com.generalcodes;

public class PivotArrayRotation {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7};
        int pivot = 3;
        reverse(array.clone(),pivot);

        System.out.print("Original Array: ");
        for (int element : array){
            System.out.print(element+" ");
        }
    }

    private static void reverse(int[] clone, int pivot) {
        if (clone==null|| clone.length==1) return;
        int left = pivot+1;
        int right = clone.length-1;

        while(left<right){
            int temp = clone[left];
            clone[left] = clone[right];
            clone[right] = temp;
            left++;
            right--;
        }

        System.out.print("Reverse Array: ");
        for (int element : clone){
            System.out.print(element+ " ");
        }
        System.out.println();
    }
}
