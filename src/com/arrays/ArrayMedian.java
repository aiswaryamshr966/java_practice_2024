package com.arrays;

public class ArrayMedian {
    public static void main(String[] args) {
        int[] array1 = {900};
        int[] array2 = {5,8,10,20};

        System.out.println("The Median For Both The Arrays: "+getMedian(array1,array2));
    }

    private static int getMedian(int[] array1, int[] array2) {
        //Current index of input array array1[]
        int i=0;

        //Current index of input array array2[]
        int j=0;

        int count;
        int m1=-1, m2=-1;

        int m=array1.length;
        int n=array2.length;

        //Since there are (m+n) elements,
        //There are following two cases
        //If n+m is odd then the middle
        //index is median i.e. (m+n)/2
        if((m+n)%2==1){
            for (count=0;count<=(m+n)/2;count++){
                if(i!=m && j!=n) m1 = (array1[i]>array2[j])?array2[j++]:array1[i++];
                else if(i<m) m1 = array1[i++];
                else m1 = array2[j++];
            }
            return m1;
        }

        //median will be average of elements
        //at index ((m+n)/2 - 1) and (m+n)/2
        //in the array obtained after merging
        //ar1 and ar2
        else {
            for (count=0;count<=(m+n)/2;count++){
                m2=m1;
                if (i!=m&&j!=n) m1 = (array1[i]>array2[j])?array2[j++]:array1[i++];
                else if (i<n) m1 = array1[i++];
                else m1 = array2[j++];
            }
            return (m1+m2)/2;
        }
    }
}