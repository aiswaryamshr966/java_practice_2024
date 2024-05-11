package com.basics.sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        //Collection(I)->Set(I)->SortedSet(I)->NavigableSet(I)->TreeSet(C)
        //Sub-interface of SortedSet
        //Contains methods related to navigation functionality
        //Both SortedSet and NavigableSet have a same implementation class as TreeSet

        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(1000);
        ns.add(3000);
        ns.add(13000);
        ns.add(40000);
        ns.add(54000);

        System.out.println("----------TreeSet----------");
        System.out.println(ns);
        System.out.println("---------------------------");

        //methods
        System.out.println(ns.floor(13550));
        System.out.println(ns.lower(14000));
        System.out.println(ns.ceiling(2500));
        System.out.println(ns.higher(4000));
        System.out.println(ns.pollFirst());
        System.out.println(ns.pollLast());
        System.out.println(ns.descendingSet());
    }
}
