package com.generalcodes;

public class Sort012 {
    public static void main(String[] args) {
        int[] array = {0,1,1,0,1,2,1,2,0,0,0,1};

        System.out.print("Original Array: ");
        for (int element : array){
            System.out.print(element+" ");
        }
        System.out.println();

        System.out.print("Sorted 0s, 1s & 2s: ");
        sorting012(array.clone());
    }

    private static void sorting012(int[] clone) {
        int cnt0=0,cnt1=0,cnt2=0;
        for (int element : clone){
            if (element==0) cnt0++;
            else if (element==1) cnt1++;
            else if (element==2) cnt2++;
        }

        int i = 0;
        while(cnt0>0){
            clone[i++] = 0;
            cnt0--;
        }
        while(cnt1>0){
            clone[i++] = 1;
            cnt1--;
        }
        while(cnt2>0){
            clone[i++] = 2;
            cnt2--;
        }

        for (int element : clone){
            System.out.print(element+" ");
        }
    }
}