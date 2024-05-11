package com.strings;

import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCompression {
    public static void main(String[] args) {
        String target = "abbbaap";
        target.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> System.out.print(key + "" + value));
    }
}
