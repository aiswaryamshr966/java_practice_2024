package com.generalcodes;

import java.util.Arrays;

public class ProductArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] productArray = findProduct(array.clone());

        System.out.println("The Original Array: "+Arrays.toString(array));
        System.out.println("The Product Array: "+Arrays.toString(productArray));
    }

    private static int[] findProduct(int[] clone) {
        int[] productArray = new int[clone.length];
        int multiplier = 1;
        for (int i=0;i<productArray.length;i++){
            for (int j=0;j<clone.length;j++){
                if (i!=j){
                    multiplier = multiplier*clone[j];
                }
            }
            productArray[i] = multiplier;
            multiplier = 1;
        }
        return productArray;
    }
}
