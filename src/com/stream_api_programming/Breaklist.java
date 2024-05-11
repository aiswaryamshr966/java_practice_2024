package com.stream_api_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Breaklist {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> breaklist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        for (int i=0;i<array.length;i++){
            list.add(array[i]);
            counter++;
            if (counter==3){
                Collections.reverse(list);
                breaklist.add(list);
                list=new ArrayList<>();
                counter=0;
            }
        }

        breaklist.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList())
                .forEach(z-> System.out.print(z+" "));
    }
}