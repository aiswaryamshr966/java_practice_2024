package com.complex;

public class Complex6 {
    public static void main(String[] args) {
        int five = 5;
        int two = 2;
        int total = five + (five > 6 ? ++two:--two);
        System.out.println(total); //6
    }
}
