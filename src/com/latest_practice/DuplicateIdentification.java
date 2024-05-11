package com.latest_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateIdentification {
    public static void main(String[] args) {
        int[] array = {1,2,3,1};

        //Normal Approach, which is optimal
        if (findDuplicate(array)) System.out.println("Duplicates are present");
        else System.out.println("Duplicates are not present");

        //Optimal approach, using Java streams api
        if (findDuplicateUsingStreams(array)) System.out.println("Duplicates are present");
        else System.out.println("Duplicates are not present");
    }

    private static boolean findDuplicate(int[] array) {
        Set<Integer> duplicateSet = new HashSet<>();
        for (int num : array){
            if (!duplicateSet.add(num)) return true;
        }
        return false;
    }

    private static boolean findDuplicateUsingStreams(int[] array){
        return Arrays.stream(array).distinct().count() < array.length;
    }
}
