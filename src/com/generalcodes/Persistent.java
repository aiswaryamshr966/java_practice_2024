package com.generalcodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
List<Integer> intList = Arrays.asList(1,2,8,3,5,3);
Exactly one number is duplicated in the array. Write java function to find this duplicate
*/
public class Persistent {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,8,3,5,3);
        int duplicate = findDuplicate(intList);
        long duplicate2 = findDuplicate2(intList);

        System.out.println("The Repeated Value: "+duplicate);
        System.out.println("The Repeated Value: "+duplicate2);
    }

    private static long findDuplicate2(List<Integer> intList) {
        long duplicate = intList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .findFirst()
                .get()
                .getValue();

        return duplicate;
    }

    private static int findDuplicate(List<Integer> intList) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int element : intList){
            if(map.containsKey(element)) map.put(element,map.get(element)+1);
            else map.put(element,1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()>1) return entry.getKey();
        }
        return 0;
    }
}