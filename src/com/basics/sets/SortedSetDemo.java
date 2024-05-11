package com.basics.sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        //Collection->Set->SortedSet->NavigableSet->TreeSet
        //Distinct Property is insertion is done according to sorting order, which helps in identifying the index of element
        //SortedSet only accepts homogeneous elements

        SortedSet ss = new TreeSet(); //Implementation class
        //Methods in SortedSet Interface TreeSet Collection Integer

        ss.add(5);
        ss.add(10);
        ss.add(2);
        ss.add(1);
        ss.add(3);
        ss.add(7);

        System.out.println(ss);
        System.out.println(ss.first()); //first element of the TreeSet
        System.out.println(ss.last()); //last element of the TreeSet
        System.out.println(ss.headSet(3)); //the elements coming before the toElement
        System.out.println(ss.tailSet(5)); //the elements coming after the fromElement
        System.out.println(ss.subSet(2,7)); //all the elements coming between both elements

        System.out.println(ss.comparator()); //provide sorting order, default being natural ordering, i.e null
    }
}
