package com.basics.arrays;

public class ElementsAssignmentsDemo {
    public static void main(String[] args) {
        int[] x = new int[3];
        float[] y = new float[2];

        //Object Array
        Object[] objArray = new Object[5];
        objArray[0] = new Object();
        objArray[1] = new String(); //String is a child class of Object class

        //Abstract Class Type Arrays
        Number[] numArray = new Number[3];
        numArray[0] = new Integer(1);
        numArray[1] = new Byte("2");

        //Interface Type Arrays
        Runnable[] r = new Runnable[5];
        r[0] = new Thread();

        System.out.println(r[1]);
    }
}
