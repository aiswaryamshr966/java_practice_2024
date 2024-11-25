package com.complex;

public class Complex1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = s2.intern();

        System.out.println(s1==s3);
    }
}
