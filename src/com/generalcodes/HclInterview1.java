package com.generalcodes;

import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HclInterview1 {
    public static void main(String[] args) {
        String name = "Aiswarya Mishra";
        name.toLowerCase()
                .chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(e-> System.out.println(e.getKey()+" : "+e.getValue()));

        Stack stack = new Stack();
    }
}
