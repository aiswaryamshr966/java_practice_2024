package com.multithreading;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentCollectionsDemo {
    public static void main(String[] args) {

        //ConcurrentHashMap Example
        ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put(1, "One");
        concurrentHashMap.put(2, "Two");
        concurrentHashMap.put(3, "Three");

        //Create a separate thread to modify the map while iterating
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> {
            try{
                Thread.sleep(1000);
                concurrentHashMap.put(4, "Four");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        executorService.shutdown();

        //Iterating over ConcurrentHashMap
        System.out.println("ConcurrentHashMap Elements: ");
        concurrentHashMap.entrySet()
                .stream()
                .forEach(e-> System.out.println(e.getKey()+"->"+e.getValue()));

        //CopyOnWriteArrayList Example
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("One");
        copyOnWriteArrayList.add("Two");
        copyOnWriteArrayList.add("Three");
        copyOnWriteArrayList.add("Four");

        //Create a separate thread to modify the list while iterating
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        executorService2.execute(() -> {
            try{
                Thread.sleep(1000);
                copyOnWriteArrayList.add("Five");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        executorService2.shutdown();

        //Iterating over CopyOnWriteArrayList
        System.out.println("CopyOnWriteArrayList Elements: ");
        copyOnWriteArrayList
                .stream()
                .forEach(e-> System.out.println(e));
    }
}
