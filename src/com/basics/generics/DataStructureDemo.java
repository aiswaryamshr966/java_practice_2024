package com.basics.generics;

import java.util.ArrayList;

public class DataStructureDemo {
    public static void main(String[] args) {
        //Java is a statically typed language
        //Arrays are type safe
        String[] array = new String[20];
        Employee[] empArray = new Employee[20];
        array[0] = "Aiswarya";
        //array[1] = new com.generalcodes.Employee();

        ArrayList l = new ArrayList(); //Heterogenous collections of objects
        //It can't contain promitives i.e. int, float, double, etc
        //Use Wrapper Classes -> Integer, Double, etc.

        l.add("Aiswarya");
        l.add(new Employee());

        String name = (String) l.get(0);
        Employee name1 = (Employee) l.get(0);

         /* 1. Insertion Order is maintained
            2. Duplicates Allowed
            3. Positional Access to Elements
            4. List is an interface so we cannot create its object.
         */

    }
}
