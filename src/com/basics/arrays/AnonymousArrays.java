package com.basics.arrays;

public class AnonymousArrays {
    public static void main(String[] args) {
        //These can't be provided with size
        //These can only be used as method arguments
        //These are used for instant use
        sum(new int[] {1,2,3});
    }

    private static void sum(int[] is){
        int total = 0;
        for (int element : is){
            total = total + element;
        }
        System.out.println("Sum: "+total);
    }
}
