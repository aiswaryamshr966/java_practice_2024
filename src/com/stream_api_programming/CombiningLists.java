package com.stream_api_programming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombiningLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> combinedList = Stream.of(list1, list2)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(combinedList);
    }
}
