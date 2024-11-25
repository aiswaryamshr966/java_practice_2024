package com.generalcodes;

public class TrigentInterveiw {
    public static void main(String[] args){
        int[] a = {-2,-3,4,-1,-2,1,5,-3};

        int maxSum = a[0];
        int currSum = a[0];

        int startIndex = 0;
        int endIndex = 0;

        int currentStartIndex = 0;

        for(int i=1;i<a.length;i++){
            if(a[i]>currSum+a[i]){
                currSum = a[i];
                currentStartIndex = i;
            } else {
                currSum = currSum + a[i];
            }

            if(currSum>maxSum){
                maxSum = currSum;
                startIndex = currentStartIndex;
                endIndex = i;
            }
        }

        System.out.println("The Maximum Sum is: "+maxSum);
        System.out.print("The SubArray: ");
        for(int i=startIndex;i<=endIndex;i++){
            System.out.print(a[i]+" ");
        }
    }
}
