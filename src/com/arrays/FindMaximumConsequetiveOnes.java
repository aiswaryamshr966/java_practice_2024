package com.arrays;

public class FindMaximumConsequetiveOnes {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,1,3,1,3,1,2,4,3,2,4,2,1};
        int consequetiveOnes = findConsequetiveOnes(array);
        System.out.println("The Maximum Consequetive Ones In The Array: "+consequetiveOnes);
    }

    private static int findConsequetiveOnes(int[] array) {
        int maxCount = 0;
        int currentCount = 0;

        for (int i=0;i<array.length;i++){
            if (array[i]==1){
                currentCount++;
                maxCount = Math.max(maxCount,currentCount);
            }else {
                currentCount = 0;
            }
        }
        return maxCount;
    }
}
