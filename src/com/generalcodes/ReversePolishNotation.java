package com.generalcodes;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] token = {"2","1","+","3","*"};
        System.out.println(evaluateRPN(token));
    }

    private static int evaluateRPN(String[] token) {
        int returnValue = 0;
        String operators = "+-*/";

        Stack<String> stack = new Stack<>();

        for (String s : token){
            if (!operators.contains(s)) stack.push(s);
            else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());

                switch (s) {
                    case "+" -> stack.push(String.valueOf(a + b));
                    case "-" -> stack.push(String.valueOf(a - b));
                    case "*" -> stack.push(String.valueOf(a * b));
                    case "/" -> stack.push(String.valueOf(b / a));
                }
            }
        }

        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }
}
