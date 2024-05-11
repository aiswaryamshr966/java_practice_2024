package com.basics.arrays;

public class ArrayIntroduction {
    public static void main(String[] args) {
        int a = 12; //Integer value
        int b = 24; //Integer value
        int c = 29; //Integer value

        int[] x = new int[1000]; //Option 1 : creating using new operator
        //Creating an Array, having size which is fixed, only integer
        //We have to provide the size of the array, mandatory
        //Collection of homogenous elements
        //0 length array creation is possible
        //Allowed data types for length defination are byte, short, char, int
        //The indexing starts from 0->length-1

        System.out.println(x.getClass().getName()); //Print class name
        int[] p = new int[-1]; // NegaticeArraySizeException
        int[] z = new int[2147483647]; //Max Value
    }
}
