package com.strings;

public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "Aiswarya";
        String str2 = new String("Aiswarya");

        if(str1.equals(str2)) System.out.println("References Are Equal");
        else System.out.println("References Are Not Equal");

        String str3 = str2.intern();

        if (str1.equals(str3)) System.out.println("Same References After intern()");
        else System.out.println("Not Same References After intern()");
    }
}