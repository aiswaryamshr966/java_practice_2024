package com.algorithms;

public class TernarySearch {
    public static void main(String[] args) {
        int left,right;
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        left = 0;
        right = array.length-1;

        int pivot = ternarySearch(left,right,5,array.clone());
        System.out.println("The Key Is Present At: "+pivot);

        int pivot2 = ternarySearch(left,right,100,array.clone());
        System.out.println("The Key Is Present At: "+pivot2);
    }

    private static int ternarySearch(int left, int right, int key, int[] array) {
        if (right>=left){
            int mid1 = left+(right-left)/3;
            int mid2 = right-(right-left)/3;

            if (array[mid1]==key) return mid1;
            if (array[mid2]==key) return mid2;

            if (key<array[mid1]) return ternarySearch(left,mid1-1,key,array.clone());
            else if (key>array[mid2]) return ternarySearch(mid2+1,right,key,array.clone());

            else return ternarySearch(mid1+1,mid2-1,key,array.clone());
        }
        return -1;
    }
}
