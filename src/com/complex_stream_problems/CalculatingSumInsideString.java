package com.complex_stream_problems;

import java.util.Arrays;
import java.util.stream.Stream;

public class CalculatingSumInsideString {
    public static void main(String[] args) {
        String sequence = "My 90 name 40 is 20 Aiswarya";
        int sum = Stream.of(sequence.split(" "))
                .filter(s->{
                    try {
                        Integer.parseInt(s);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println("The Sum Of All Numbers In The String Is: " + sum);
    }
}
