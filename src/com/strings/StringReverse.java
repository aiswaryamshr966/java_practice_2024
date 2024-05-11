package com.strings;

public class StringReverse {
    public static void main(String[] args) {
        String name = "Aiswarya Mishra";
        String reverseName = new String();
        for(int i=name.length()-1;i>=0;i--){
            reverseName = reverseName+name.charAt(i);
        }

        System.out.println("Original String: "+name);
        System.out.println("Reversed String: "+reverseName);
    }
}
