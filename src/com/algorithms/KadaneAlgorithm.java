package com.algorithms;

//This Algorithm is defined to find the largest contiguous array sum
public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = findSum(array.clone());

        System.out.println("The Maximum Array Sum: "+sum);
    }

    private static int findSum(int[] array) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int j : array) {
            maxEndingHere = maxEndingHere + j;
            if (maxSoFar < maxEndingHere) maxSoFar = maxEndingHere;
            if (maxEndingHere < 0) maxEndingHere = 0;
        }
        return maxSoFar;
    }
}
