package com.generalcodes;

public class FindPairings {
    public static void main(String[] args) {
        int[] a={3,3,6,8,10,12,16,19,21};
        int key = 22;

        int left = 0;
        int right = a.length-1;

        while(left<right){
            if(a[left]+a[right]==key) {
                System.out.println("The Pairs Are: "+a[left]+" "+a[right]);
                left++;
                right--;
            }
            else if(a[left]+a[right]>key) right--;
            else left++;
        }
    }
}
