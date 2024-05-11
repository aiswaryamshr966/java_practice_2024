package com.basics.arrays;

public class PlayingWithSyntax {
    public static void main(String[] args) {
        int[] x1;
        int [] x2;
        int x3[];

        //int[3] x4; we can't define the length while declaring

        int x5[],x6[];
        //int x7[],[]x8; we can use with first array, but not with second array
        int []x9,x10[];

        int[][] x11;
        int [][]x12;
        int [][] x13;

        int []x14[]; //Arrays of Arrays
        int x15[][];

        int[][] x16,x17; //2 different 2D arrays

        int[] x18[],x19; //first is 2D array, second is 1D array

        int[] []x20,x21; //compiler ignores the spaces before the name

        int[] [] [] x22,x23;

        //int [][] x24 = new int[][4]; Provision of first level size is mandatory
        int [][][] x25 = new int[3][4][5];
        int [][][] x26 = new int[3][4][];
        //int [][][] x27 = new int[3][][5];
        //int [][][] x28 = new int[][4][5];
    }
}