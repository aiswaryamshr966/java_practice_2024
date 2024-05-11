package com.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArraySorting {
    public static void main(String[] args) {
        String[] array = {"Soumya","Bibhu","Aiswarya","Amar"};
        System.out.println("The Original Array: "+ Arrays.toString(array));
        sortStringsArray(array);

        Singleton101 single = Singleton101.getInstance();
    }

    private static void sortStringsArray(String[] array) {
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                String temp = "";
                if (array[i].charAt(0)>array[j].charAt(0)){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: "+Arrays.toString(array));
    }
}

class Singleton101{

    private static Singleton101 instance = null;

    private Singleton101(){
        //Constructor
    }

    public static Singleton101 getInstance(){
        synchronized (Singleton101.class) {
            if (instance == null) {
                instance = new Singleton101();
            }
            return instance;
        }
    }
}

final class Immutable{
    private final int field1;
    private final List<Integer> list = new ArrayList<>();

    public Immutable(int field1, List<Integer> list){
        this.field1=field1;
        List<Integer> newList = new ArrayList<>();
        newList.addAll(list);
    }

    //Getter
    //No Setter Methods

}