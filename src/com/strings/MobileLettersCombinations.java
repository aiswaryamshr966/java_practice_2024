package com.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileLettersCombinations {
    public static void main(String[] args) {
        System.out.println(lettersCombinations("23"));
        System.out.println(lettersCombinations(""));
        System.out.println(lettersCombinations("23958"));
    }

    private static List<String> lettersCombinations(String number) {
        //Edge case, if input is empty, return empty list
        if (number.isEmpty()) return Collections.emptyList();

        //Map of digits to corresponding letters
        String[] letterMap = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        List<String> result = new ArrayList<>();
        backtrack(number,0,new StringBuilder(),letterMap,result);
        return result;
    }

    private static void backtrack(String number, int index, StringBuilder current, String[] letterMap, List<String> result) {
        // Base case: if the current combination is the same length as the input, add it to the result
        if(index==number.length()){
            result.add(current.toString());
            return;
        }

        //Get corresponding letter for the current digit
        String letters = letterMap[number.charAt(index)-'0'];

        //Loop through each letter and recurse
        for(char c : letters.toCharArray()){
            current.append(c); //Choose a letter
            backtrack(number, index+1, current, letterMap, result); //Explore Further
            current.deleteCharAt(current.length()-1); //Undo the choice
        }
    }
}
