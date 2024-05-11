package com.generalcodes;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,10};
        int secondLargest = secondLargest(array.clone());
        System.out.println("Second Largest Element : "+secondLargest);
    }

    private static int secondLargest(int[] clone) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if (clone.length>1){
            for (int element : clone){
                if (element>largest){
                    secondLargest = largest;
                    largest = element;
                } else if (element>secondLargest && element!=largest) {
                    secondLargest = element;
                }
            }
            return secondLargest;
        }else return clone[0];
    }
}
