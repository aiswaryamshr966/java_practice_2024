package com.latest_practice;

import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagramGroup = findAnagramGroups(strings);
        anagramGroup.forEach(System.out::println);
    }

    private static List<List<String>> findAnagramGroups(String[] strings){
        if (strings.length == 0) return new ArrayList<>();

        Map<String,List<String>> anagramGroups = new HashMap<>();

        for (String str : strings){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            anagramGroups.computeIfAbsent(sortedStr,k->new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramGroups.values());
    }
}
