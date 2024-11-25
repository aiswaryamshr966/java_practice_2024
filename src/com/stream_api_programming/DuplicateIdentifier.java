package com.stream_api_programming;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateIdentifier {
    public static void main(String[] args) {

        Object[] array = Stream
                .of(1, 2, 3, 4, 6, 7, 8, 9, 3, 6, 8)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .distinct()
                .toArray();

        System.out.println(Arrays.toString(array));

        Stream.of(1, 2, 3, 4, 6, 7, 8, 9, 3, 6, 8)
                .filter(i->i%2==0)
                .map(i->i+5)
                .toList()
                .forEach(i->System.out.print(i+" "));

        List<Integer> lst = Arrays.asList(1,2,3,4,6,7,8,9,3,6,8,2,9,1);
        lst.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(e-> System.out.println(e.getKey()+"->"+e.getValue()));
    }
}
