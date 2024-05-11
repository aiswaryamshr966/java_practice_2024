package com.generalcodes;

import java.util.*;

public class SortingReputations {
    public static void main(String[] args) {
        int[] array = {8,4,2,5,8,3,6,4,2,5,1,3};
        Map<Integer,Integer> elementCountMap = new LinkedHashMap<>();

        for (int i=0;i<array.length;i++){
            if (elementCountMap.containsKey(array[i]))
                elementCountMap.put(array[i],elementCountMap.get(array[i])+1);
            else
                elementCountMap.put(array[i],1);
        }

        ArrayList<Integer> sortedElements = new ArrayList<>();

        elementCountMap.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry->{
                    for (int i=1;i<=entry.getValue();i++){
                        sortedElements.add(entry.getKey());
                    }
                });

        System.out.println("Input Array: "+ Arrays.toString(array));
        System.out.println("Sorted Array: "+ sortedElements);
    }
}
