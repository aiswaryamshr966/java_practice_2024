package com.basics.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CursorsListIterDemo {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("Raj");
        data.add("Ramesh");
        data.add("Amrish");
        data.add("Jai");
        data.add("Kushal");

        System.out.println(data);

        ListIterator li = data.listIterator();
        while (li.hasNext()){
            String item = (String) li.next();
            if (item.equals("Jai")) li.add("Veeru"); //will add the element to the next index of the iterator
            if (item.equals("Raj")) li.remove(); //remove the same
            if (item.equals("Amrish")) li.set("Amresh"); //update the value at the index
        }

        System.out.println(data);
    }
}
