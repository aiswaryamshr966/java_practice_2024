package com.basics.Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(); //Default size 10
        List al1 = new ArrayList<>();

        /*
        Whenever the data exceeds the size of the defined arraylist
        a new arraylist of (x*(3/2))+1 is made
        and the previous arraylist will be discarded by the GC
         */

        ArrayList aList = new ArrayList(30);

        //ArrayList aListNew = new ArrayList(Collection c);

        //methods
        aList.add("John");
        aList.add(true);
        aList.add(100);

        System.out.println(aList);

        aList.remove(1);

        System.out.println(aList);

        aList.remove(new Integer(100));

        System.out.println(aList);

        System.out.println(aList.get(0));

        ArrayList<String> strList = new ArrayList<String>();

        /*
        1.Serializable
        2.Cloneable
        3.Random Access - Marker Interface
        4.Not recommended for insertion and deletion
        */
    }
}
