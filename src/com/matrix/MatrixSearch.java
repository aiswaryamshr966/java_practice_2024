package com.matrix;

import java.util.HashMap;
import java.util.Map;

public class MatrixSearch {
    public static void main(String[] args) {
        int matrix[][] = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9},
                            {10,11,12},
                            {13,14,15},
                            {16,17,18},
                            {19,20,21}
                        };
        int search_key = 17;

        //Using HashTable

        if (searchElement(matrix,search_key)) System.out.println("Element Found");
        else System.out.println("Element Not Found");

        //Using Divide And Conquer

        int[] result = searchMatrix(matrix,search_key);
        if (result!=null) System.out.println("Element Is Found At Coordinates: "+result[0]+" & "+result[1]);
        else System.out.println("Element Not Found");
    }

    //HashTable implementation, if the matrix is unsorted,
    //then this is one possible way to find the element with a linear search.
    //the setup costs O(m*n)
    //the subsequent search costs only O(1)
    private static boolean searchElement(int[][] matrix, int searchKey) {
        Map<Integer, int[]> hashtable = new HashMap<>();
        for (int k=0;k<matrix.length;k++){
            for (int j=0;j<matrix[k].length;j++){
                hashtable.put(matrix[k][j],new int[]{k,j});
            }
        }

        if (hashtable.containsKey(searchKey)) return true;
        else return false;
    }

    //Divide and Conquer is one of the way which can be implemented
    //for searching the matrix where the matrix is divided into multiple sub matrices
    //searched recursively
    private static int[] searchMatrix(int[][] matrix,int searchKey){
        int rows = matrix.length;
        int columns = matrix[0].length;
        return searchMatrix(matrix,searchKey,0,0,rows-1,columns-1);
    }

    private static int[] searchMatrix(int[][] matrix, int searchKey, int startRow, int startColumn, int endRow, int endColumn) {
        //Base Case : the substring is null
        if (startRow>endRow||startColumn>endColumn) return null;

        int midRow = (startRow+endRow)/2;
        int midColumn = (startColumn+endColumn)/2;

        if(matrix[midRow][midColumn]==searchKey) return new int[]{midRow,midColumn};
        else if (matrix[midRow][midColumn]< searchKey) {
            //search in the right and bottom submatrices
            int[] result1 = searchMatrix(matrix,searchKey,startRow,midColumn+1,endRow,endColumn);
            int[] result2 = searchMatrix(matrix,searchKey,midRow+1,startColumn,endRow,endColumn);
            return (result1!=null)?result1:result2;
        }
        else {
            //search in the left and top submatrices
            int[] result1 = searchMatrix(matrix,searchKey,startRow,startColumn,endRow,midColumn-1);
            int[] result2 = searchMatrix(matrix,searchKey,startRow,startColumn,midRow-1,endColumn);
            return (result1!=null)?result1:result2;
        }
    }
}
