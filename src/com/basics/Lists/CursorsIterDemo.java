package com.basics.Lists;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorsIterDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(36);
        list.add(45);

        Iterator itr = list.iterator();

        while (itr.hasNext()){ //traversing
            Integer i = (Integer) itr.next();
            if (i%3==0) System.out.println(i);
            else itr.remove();
        }

        System.out.println(list);

        //Iterators and Enumerations are unidirectional
        //ListIterator is bidirectional in nature
    }
}
