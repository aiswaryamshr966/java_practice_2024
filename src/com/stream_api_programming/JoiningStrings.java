package com.stream_api_programming;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningStrings {
    public static void main(String[] args) {
        String firstName = "Aiswarya";
        String lastName = "Mishra";

        //Joining Strings
        String fullName = Stream.of(firstName, lastName)
                .collect(Collectors.joining(" "));
        System.out.println(fullName);
    }
}
