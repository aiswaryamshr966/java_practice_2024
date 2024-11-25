package com.complex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ascendion1 {
    public static void main(String[] args) {
        //First Question
        Arrays.asList(Arrays.asList("Saket", "sreekar"), Arrays.asList("sani", "manish"),
                Arrays.asList("Shawn", "Franklin"), Arrays.asList("Johnty", "Sean"))
                .stream()
                .flatMap(List::stream)
                .filter(s->s.startsWith("S")||s.startsWith("s"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //Second Question
        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 72;

        int indexOfTarget = findElementIndex(arr,target,0);
        if (indexOfTarget==-1) System.out.println("Target Element not found");
        else System.out.println("Target Element found at index: "+indexOfTarget);
    }

    private static int findElementIndex(int[] arr, int target, int i) {
        if (i>= arr.length) return -1;
        if(arr[i]==target) return i;
        return findElementIndex(arr,target,i+1);
    }
}
