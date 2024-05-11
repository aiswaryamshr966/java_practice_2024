package com.matrix;

import java.util.Arrays;

public class MatrixSorting {
    public static void main(String[] args) {
        int[][] matrix = {
                {5,8,3},
                {2,7,4},
                {1,6,9},
                {10,12,11}
        };
        
        int[][] sortedMatrix = sortMatrix(matrix);

        //Printing the unsorted Matrix
        for (int k=0;k<matrix.length;k++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[k][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //Printing the sorted Matrix
        for (int k=0;k<sortedMatrix.length;k++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(sortedMatrix[k][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[] flatMatrix(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
    }

    private static int[][] sortMatrix(int[][] matrix){
        int index=0;
        int[][] sortedMatrix = new int[matrix.length][matrix[0].length];
        int[] flatMatrix = flatMatrix(matrix);

        for (int k=0;k<matrix.length;k++){
            for (int j=0;j<matrix[k].length;j++){
                sortedMatrix[k][j] = flatMatrix[index];
                index++;
            }
        }

        return sortedMatrix;
    }
}
