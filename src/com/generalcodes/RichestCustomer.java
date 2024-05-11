package com.generalcodes;

import java.util.Arrays;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] array = {{1,5},{7,3},{3,5}};
        System.out.println("The Original Array : ");
        for (int[] a : array){
            for (int e : a){
                System.out.print(e+" ");
            }
            System.out.println();
        }
        System.out.println("The Richest Customer With Wealth : "+findRichestCustomer(array.clone()));
    }

    private static int findRichestCustomer(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        int savings = 0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                savings+=accounts[i][j];
            }
            wealth[i] = savings;
            savings = 0;
        }

        Arrays.sort(wealth);
        return wealth[wealth.length-1];
    }
}
