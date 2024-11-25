package com.multi_dimesional_arrays;

import java.util.Random;

public class PrintMultiDimensionalArray {
    public static void main(String[] args) {

        int[][] arr = new int[9][9];
        for(int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                arr[i][j] = new Random().nextInt(100);
            }
        }

        for(int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
