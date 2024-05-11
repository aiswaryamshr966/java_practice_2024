package com.basics.Lists;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //Subclass of stack
        //Allows duplicates
        //LIFO
        //insertion order is preserved
        //accepts heterogeneous elements

        Stack s = new Stack();
        s.push(10);
        s.push("John");
        s.push(30);
        s.push(true);

        Object o = s.pop();
        System.out.println(s);

        Object o1 = s.peek();//returns the top element
        System.out.println(s);
        System.out.println(o1);

        System.out.println(s.empty()); //just is isEmpty method
        System.out.println(s.search(10)); //searching an object

    }
}
