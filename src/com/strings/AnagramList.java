package com.strings;

import java.util.*;

public class AnagramList {
    /*

      - Common Anagrams
      Input- {“cat”, “dog”, “tac”, “god”, “act”}
      Output - [[cat,tac,act], [dog,god]]
     */
    public static void main(String[] args) {
        String[] array = {"cat", "dog", "tac", "god", "act"};
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Step 1: Group words with the same sorted letters
        for (String word : array) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!anagramMap.containsKey(sortedWord)) {
                anagramMap.put(sortedWord, new ArrayList<>());
                anagramMap.get(sortedWord).add(word);
            }
            else anagramMap.get(sortedWord).add(word);
        }

        // Step 2: Create list of anagram groups
        List<List<String>> anagramGroups = new ArrayList<>();

        for (List<String> anagramsList : anagramMap.values()) {
            if (anagramsList.size() > 1) {
                anagramGroups.add(anagramsList);
            }
        }

        System.out.println(anagramGroups);
    }
}
