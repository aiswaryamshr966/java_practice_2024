package com.codewars;

import java.util.*;

/*
Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order
of the strings of a1 which are substrings of strings of a2.

Example 1:
a1 = ["arp", "live", "strong"]
a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
returns ["arp", "live", "strong"]

Example 2:
a1 = ["tarp", "mice", "bull"]
a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
returns []

Notes:
-Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
-In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
-Beware: In some languages r must be without duplicates.
 */
public class WhichArraysAreIn {
    public static void main(String[] args) {
        String[] a1 = {"arp","live","strong"};
        String[] a2 = {"lively","alive","harp","sharp","armstrong"};

        System.out.println("The Substrings are in the same order : "+ Arrays.toString(inArray(a1, a2)));

        String[] a3 = {"tarp","mice","bull"};
        System.out.println("The Substrings are in the same order : "+ Arrays.toString(inArray(a1, a3)));

        String[] a4 = {"lively","alive","harp","sharp","armstrong"};
        System.out.println("The Substrings are in the same order : "+ Arrays.toString(inArray(a3, a4)));

        //Using efficient approach
        System.out.println("The Substrings are in the same order : "+ Arrays.toString(optimisedInArray(a1, a2)));
        System.out.println("The Substrings are in the same order : "+ Arrays.toString(optimisedInArray(a1, a3)));
        System.out.println("The Substrings are in the same order : "+ Arrays.toString(optimisedInArray(a3, a4)));

    }

    private static String[] inArray(String[] a1, String[] a2) {
        List<String> result = new ArrayList<>();

        //Check string inside a1 against all the elements of a2
        for(String s : a1) {
            for(String s2 : a2) {
                if(s2.contains(s)) {
                    result.add(s);
                    break;
                }
            }
        }

        return result.stream()
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }

    private static String[] optimisedInArray(String[] a1, String[] a2){
        //Combine all the strings into one string dividing by spaces
        String combinedA2 = String.join(" ", a2);

        //Initialize a set so that we don't need to find distinct elements
        Set<String> result = new TreeSet<>();

        for(String a : a1){
            if (combinedA2.contains(a)){
                result.add(a);
            }
        }

        return result.toArray(new String[0]);
    }
}
