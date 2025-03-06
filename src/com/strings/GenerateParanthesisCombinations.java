package com.strings;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesisCombinations {
    public static void main(String[] args) {
        System.out.println(generateParanthesis(3));
        System.out.println(generateParanthesis(7));
    }

    private static List<String> generateParanthesis(int number) {
        List<String> result = new ArrayList<String>();
        backtrack(result,new StringBuilder(),0,0,number);
        return result;
    }

    private static void backtrack(List<String> result, StringBuilder current, int open, int close, int number) {
        //Base Case: when current string is complete
        if(current.length() == number*2){
            result.add(current.toString());
            return;
        }

        //Add an open paranthesis if we still have some cases left
        if(open<number){
            current.append('('); //Add '('
            backtrack(result,current,open+1,close,number); //Recurse
            current.deleteCharAt(current.length()-1); //Backtrack
        }

        //Add an open paranthesis if it doesn't exceed the number of open paranthesis
        if(close<open){
            current.append(')'); //Add ')'
            backtrack(result,current,open,close+1,number); //Recurse
            current.deleteCharAt(current.length()-1); //Backtrack
        }
    }
}
