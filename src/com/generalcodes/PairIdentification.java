package com.generalcodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairIdentification {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};
        int sum = 4;

        boolean flag = findPairArrays(arr.clone(), sum);
        if (flag) System.out.println("The Pair is Present");
        else System.out.println("The Pair is Not Present");
    }

    private static boolean findPair(int[] clone, int sum) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int element : clone){
            map.put(element,element);
        }

        for (int i=0;i< clone.length;i++){
            if (map.containsKey(sum-clone[i])) return true;
        }
        return false;
    }

    private static boolean findPairArrays(int[] clone, int sum){
        Arrays.sort(clone);
        int left = 0;
        int right = clone.length-1;
        while(left<right){
            if(clone[left]+clone[right]==sum) return true;
            else if(clone[left]+clone[right]>sum) right--;
            else if(clone[left]+clone[right]<sum) left++;
        }
        return false;
    }
}
