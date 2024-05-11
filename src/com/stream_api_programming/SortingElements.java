package com.stream_api_programming;

import java.util.Arrays;

public class SortingElements {
    public static void main(String[] args) {
        Arrays.stream(new int[]{10,9,8,7,6,5,4,3,2,1,0})
                .sorted()
                .forEach(i->System.out.print(i+" "));
    }
}
