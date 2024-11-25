package com.cracking_the_coding_interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPair {
    public static void main(String[] args) {
        int[] array = {2,3,5,7,9,11,1};
        int sum = 10;
        int[] pair = new int[2];
        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(indexMap.containsKey(sum-array[i])){
                pair[0] = i;
                pair[1] = indexMap.get(sum-array[i]);
            }else{
                indexMap.put(array[i], i);
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("The Pair is at : "+pair[0]+","+pair[1]);
    }
}
