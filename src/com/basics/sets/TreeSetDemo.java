package com.basics.sets;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //Collection(I)->Set(I)->SortedSet(I)->NavigableSet(I)->TreeSet(C)
        //Implements SortedSet and NavigableSet both
        //insertion of heterogeneous elements in not allowed going on class cast exception
        //implementation is based on a balanced tree, where duplicates are not allowed and order is also not preserved
        //insertion is done according to some sorting order
        //root-> left side = less than root
        //root-> right side = greater than root
        //we can insert null into TreeSet only when TreeSet is empty
        //homogeneous elements only
        //The objects that are inserted into the TreeSet must implement Comparable Interface

        TreeSet ts = new TreeSet(); //default natural sorting order, homogeneous elements
        //TreeSet ts1 = new TreeSet(Comparator c); //Can give the comparator object for customized sorting
        SortedSet ss = new TreeSet();
        TreeSet ts2 = new TreeSet(ss);

        HashSet hs = new HashSet();
        TreeSet ts3 = new TreeSet(hs); //Interchangeability

        TreeSet<Integer> ts4 = new TreeSet<>();

        //The Custom class which needs to be created for which the objects will be inserted
        //into the TreeSet, must implement Comparable Interface and override the compareTo() method
        //otherwise ClassCastException will be thrown

    }
}
