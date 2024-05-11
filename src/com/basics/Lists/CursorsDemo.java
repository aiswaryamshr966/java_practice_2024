package com.basics.Lists;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CursorsDemo {
    public static void main(String[] args) {
        //Four Types
        //1.Enumeration
        //2.Iterator
        //3.ListIterator
        //4.Spliterator

        Vector v = new Vector();
        System.out.print("Enter The Elements: ");
        for (int i=0;i<=8;i++){
            Scanner sc = new Scanner(System.in);
            Integer data = sc.nextInt();
            v.addElement(data);
        }
        System.out.println("Vector"+v);

        Enumeration e = v.elements(); //Traversing

        while (e.hasMoreElements()){
            Integer element = (Integer) e.nextElement();
            if (element%3==0) System.out.println(element);
        }
    }
}
