package com.algorithms;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String[] array = {"race","grace","graceful","disgraceful","gracefully"};
        String subs = findLCS(array);
        System.out.println("The Longest Subsequence Is: "+subs);
    }

    private static String findLCS(String[] array) {
        int arrayLength = array.length; //Length Of The Array

        String s = array[0]; //Consuming First String Of The Array Of Strings
        int stringLength = s.length(); //Length Of The First String Of The Array Of Strings

        String lcs = ""; //The Resultant Longest Common Subsequence

        for(int i=0;i<stringLength;i++){ //Outer Loop Traversing From 0 -> First String Length
            for(int j=i+1;j<=stringLength;j++){ //Inner Loop Traversing From Outer Loop Cursor+1 -> First String Length
                String stem = s.substring(i,j); //Identifying The Substring from First String Within Outer Loop Cursor and Inner Loop Cursor
                int k = 1; //Instansiating K
                for(k=1;k<arrayLength;k++){ //K Loop From 1 -> Length Of The Array
                    if(!array[k].contains(stem)) break; //If String In The Array Doesn't Contain Substring, Then Break Out
                }
                if(k==arrayLength&&lcs.length()<stem.length()) lcs = stem; //Comparing K With Array Length, Length Of Result With Substring Length
            }
        }
        return lcs; //Returning The Substring
    }
}
