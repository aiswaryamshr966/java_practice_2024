package com.generalcodes;

import java.util.Collections;
import java.util.HashMap;

public class LongestConsequetiveSequence {
    public static void main(String[] args) {
        int[] array = {3,10,3,11,4,5,6,7,8,12};
        System.out.println("Longest Incremental Consecutive Sequence: "+LongestIncrementalConsecutiveSequence(array,array.length));
    }

    private static int LongestIncrementalConsecutiveSequence(int[] array, int length) {
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(array[0],1);
        for (int i=1;i<length;i++){
            if(map.containsKey(array[i]-1)){
                map.put(array[i],map.get(array[i]-1)+1 );
                map.remove(array[i]-1);
            }
            else {
                map.put(array[i],1);
            }
        }
        return Collections.max(map.values());
    }
}
