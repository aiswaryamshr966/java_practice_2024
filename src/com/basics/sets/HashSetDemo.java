package com.basics.sets;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        /*
        1. Collection->Set->HashSet->LinkedHashSet
        2. If searching is frequent, elements are there using hashing
        3. Underlying Data Structure: HashTable
            ->Does Not allow duplicates
            ->Insertion Order is not preserved
            ->Heterogeneous elements can be added
            ->We can add null value
            ->Implements Serializable and Cloneable Interface
         */

        HashSet hs = new HashSet(); //default capacity is 16
        HashSet hs1 = new HashSet(30);

        //Load Factor represents at what factor the HashSet capacity is changed. HashSet LF = 0.75
        //new size will be (current size or default size) * 2

        HashSet hs3 = new HashSet(100, 0.80f); //LF manipulating constructor
        //HashSet hs4 = new HashSet(Collection c); //Internal conversion of different collection to HashSet
        //All the methods of Collections interface are in HashSet

        //In LinkedHashSet Duplicates are not allowed but order is maintained

    }
}
