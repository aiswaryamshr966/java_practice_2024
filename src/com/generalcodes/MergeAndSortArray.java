package com.generalcodes;

public class MergeAndSortArray {
    public static void main(String[] args) {
        int[] array1 = {1,3,5,7,9,0};
        int[] array2 = {2,4,6,8,10};

        int[] mergedArray = mergeAndSort(array1,array2);

        for (int element : mergedArray){
            System.out.print(element+" ");
        }
    }

    private static int[] mergeAndSort(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length+array2.length];

        int firstArrayCounter = 0, secondArrayCounter = 0, mergedArrayCounter = 0;

        while (firstArrayCounter<array1.length){
            mergedArray[mergedArrayCounter] = array1[firstArrayCounter];
            firstArrayCounter++;
            mergedArrayCounter++;
        }

        while (secondArrayCounter<array2.length){
            mergedArray[mergedArrayCounter] = array2[secondArrayCounter];
            secondArrayCounter++;
            mergedArrayCounter++;
        }

        sortArray(mergedArray, mergedArray.length);
        return mergedArray;
    }

    private static void sortArray(int[] mergedArray, int length) {
        int counter = 0;
        for (int i=0;i<length-1;i++){
            if (mergedArray[i]>mergedArray[i+1]){
                int temp = mergedArray[i];
                mergedArray[i] = mergedArray[i+1];
                mergedArray[i+1] = temp;
                counter++;
            }
        }
        if (counter==0) return;
        sortArray(mergedArray,length-1);
    }
}
