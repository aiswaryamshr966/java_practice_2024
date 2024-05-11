package com.basics.sets;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        /*
        1. Efficient Searching
        2. Insertion Order is preserved
         */

        LinkedHashSet lhs = new LinkedHashSet(); //default capacity 16
        LinkedHashSet lhs1 = new LinkedHashSet(30);
        LinkedHashSet lhs2 = new LinkedHashSet(20,1.00f); //Capacity + LF

        //Underlying Data Structure = combination of LinkedList and HashTable
        //Methods are of Collections interface are implemented
    }
}
