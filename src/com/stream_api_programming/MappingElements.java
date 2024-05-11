package com.stream_api_programming;

import java.util.Arrays;
import java.util.stream.Stream;

public class MappingElements {
    public static void main(String[] args) {
        //Converting Each Element Of The Character Array To Uppercase Using Stream API
        Stream.of('a', 'b', 'c', 'd', 'e')
                .map(Character::toUpperCase)
                .forEach(System.out::print);
    }
}
