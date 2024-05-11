package com.basics.arrays;

public class TraversingArrays {
    public static void main(String[] args) {
        int[] a = new int[5];

        //forEach Traversing
        for (int element : a) {
            System.out.print(element+" ");
        }
        System.out.println();

        //Simple for loop
        int length = a.length;
        for (int i=0;i<length;i++){
            a[i] = i+1;
            System.out.print(a[i]+" ");
        }
        System.out.println();

        //--------------------------------

        int[][] b = new int[2][3];
        //ForEach
        for (int[] array : b){
            for (int element : array){
                System.out.print(element+" ");
            }
            System.out.println();
        }

        System.out.println();

        //Simple For Loop
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
