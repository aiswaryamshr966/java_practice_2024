package com.basics.Lists;

import java.util.Vector;

public class VectorsDemo {
    public static void main(String[] args) {
        /*
        1. Allows duplicates
        2. Insertion order preserved
        3. heterogeneous objects accepted
        4. thread safe
        5. Implements Serializable, Cloneable, RandomAccess interfaces
        6. methods are synchronized
        7. Performance is realtively low because of thread wait
        8. Legacy class
         */

        Vector v = new Vector(); //size 10 initially
        //when new vector is created it does it by (size*2)

        Vector v1 = new Vector(60);

        Vector v2 = new Vector(100,5);

        //Vector v3 = new Vector(Collection c);

        v.add(10);
        v.addElement("John");
        System.out.println(v);

        v.remove(0);
        System.out.println(v);

        System.out.println(v.elementAt(0));

        //get
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.get(0));

        //size(); -> returns the size or the position acquired by the vector
        //capacity(); -> returns the capacity of the vector what can be in it
        //vector class has sub class stack
    }
}
