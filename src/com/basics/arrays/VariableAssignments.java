package com.basics.arrays;

public class VariableAssignments {
    public static void main(String[] args) {
        int[] x = new int[2];
        int[] a = x;

        x[0] = 1;

        System.out.println(x[0]);
        System.out.println(a[0]);

        a[1] = 2;

        System.out.println(x[1]);
        System.out.println(a[1]);

        //no new array gets created, so any changes made to the first array, implies to the reference array

        int[] b = {1,2,3};
        int[] c = {11,22};

        b = c;
        c = b;
        //now elements in b becomes reference less and becomes ready for garbage collection

        for (int element : c){
            System.out.println(element);
        }
        System.out.println("----------------");
        for (int element : b){
            System.out.println(element);
        }

        String[] s = new String[3];
        Object[] o = s;

        short[] shorts = new short[3]; //[S
        //int[] ints = shorts; //[I
    }
}
