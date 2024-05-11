package com.generalcodes;

public class ValueOperations {
    public static void main(String[] args) {
        String[] operations = {"X++","++X","--X","X--"};
        //Initial Value Of X being 0
        int x = 0;
        System.out.println("Initial Value of X : "+x);
        System.out.println("Final Value of X : "+findValue(operations,x));
    }

    private static int findValue(String[] operations, int x) {
        for (String operation : operations){
            x+=operation.charAt(1)=='+'?1:-1;
        }
        return x;
    }
}
