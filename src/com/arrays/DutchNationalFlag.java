package com.arrays;


import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.print("Unsorted Array: ");
        Arrays.stream(nums).forEach(e-> System.out.print(e+" "));
        sortColors(nums);

        System.out.println();

        System.out.print("Sorted Array: ");
        Arrays.stream(nums).forEach(e-> System.out.print(e+" "));
    }

    private static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int current = 0;

        while (current<=high){
            if (nums[current]==0){
                swap(nums,current,low);
                current++;
                low++;
            } else if (nums[current]==2) {
                swap(nums,current,high);
                high--;
            } else current++;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
