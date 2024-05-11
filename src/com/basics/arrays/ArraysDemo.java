package com.basics.arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] x;
        int[] y = {1,2,3,4,5};
        int[] z = new int[3]; //Arrays will be initialised with 0 at each index

        System.out.println(z[0]);
        System.out.println(z[1]);
        System.out.println(z[2]);

        z[0] = 1;
        z[1] = 2;
        z[2] = 3;

        for (int element : z){
            System.out.println(element);
        }

        System.out.println(z); //[I@4f3f5b24 - [I : Class & 4f3f5b24 : hascode in hexadecimal

        int[][] a;
        int[][] b = new int[2][];

        System.out.println(b[0]); //null
        //System.out.println(b[0][0]); //Nullpointer exception

        b[0] = new int[2];
        b[1] = new int[3];

        System.out.println(b[0][0]);

        int[][] c = {{1,2,3},{4,5,6}}; //2D Array
        for (int[] array : c){
            for (int element : array){
                System.out.println(element);
            }
        }

        int[][][] d = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}}; //3D Array
        for (int[][] array : d){
            for (int[] array1 : array){
                for (int element : array1){
                    System.out.println(element);
                }
            }
        }
    }
}
