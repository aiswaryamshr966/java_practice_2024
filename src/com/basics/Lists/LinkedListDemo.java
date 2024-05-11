package com.basics.Lists;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        /*
        1. Duplicate Elements are allowed
        2. Heterogeneous objects are allowed
        3. Insertion order is preserved
        4. null insertion is preserved
        5. Insertion Deletion advantage
        6. retrieval is disadvantage
         */

        LinkedList l = new LinkedList();
        //LinkedList l1 = new LinkedList(Collection c);

        l.add("John");
        l.add(10);
        l.add(null);

        System.out.println(l);

        l.set(1,13);

        System.out.println(l);

        //set replaces an element

        l.add(2,true);

        System.out.println(l);

        l.removeLast();
        System.out.println(l);

        l.addFirst(1);
        System.out.println(l);
    }
}
