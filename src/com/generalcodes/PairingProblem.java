package com.generalcodes;

import java.util.Arrays;

public class PairingProblem {
    public static void main(String[] args) {
        int[] array = {9,3,2,4,1,3};
        int sum = 12;
        findPair(array.clone(),sum);
    }

    private static void findPair(int[] array, int sum) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length-1;
        while(left<right){
            if (array[left]+array[right]==sum) {
                System.out.println("The Pair Is: "+array[left]+","+array[right]);
                break;
            }
            else if (array[left]+array[right]>sum) right--;
            else if (array[left]+array[right]<sum) left++;
            else System.out.println("No Pair Found");
        }
    }
}
