package com.generalcodes;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ModerInterview {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aiswarya");
        names.add("Suvashree");
        names.add("Ira");
        names.add("Khirod");
        names.add("Aiswarya");

        //max length string in the list
        String maxLengthName = names.stream()
                .sorted(Comparator.comparingInt(String::length))
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .get();

        System.out.println("Maximum Length Name: "+maxLengthName);

        //How many times the occurances
        names.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(e->System.out.println(e.getKey()+" : "+e.getValue()));

        int secondLargestNumber = Arrays.asList(1,2,3,4,5,7,9).stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Largest Number: "+secondLargestNumber);

        String s = "abcdklmnlmnp";

        //find repeatative substrings in the above string like lmn is repeated

        List<String> repeatedSubstrings = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.toList());

        repeatedSubstrings.forEach(l->System.out.print(l));
    }
}
