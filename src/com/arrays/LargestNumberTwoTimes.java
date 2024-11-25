package com.arrays;

public class LargestNumberTwoTimes {
    public static void main(String[] args) {
        int[] array = new int[]{3,6,1,0};

        System.out.println("The Index Of The Largest Number Is: " + largestNumber(array));
    }

    private static int largestNumber(int[] array) {
        if(array.length == 0) return -1;

        //Find the maximum element in the array
        int max = array[0];
        int maxIndex = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }

        //Try to check if the maximum number is twice each element in the array
        for (int i=0;i<array.length;i++){
            if(i!=maxIndex && 2*array[i]>max){
                return -1;
            }
        }

        return maxIndex;

    }
}
