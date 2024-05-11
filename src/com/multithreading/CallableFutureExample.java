package com.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureExample {
    public static void main(String[] args) {
        //Create a fixed-size thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        //Submit tasks to the thread pool using Callable interface and lambda expression
        Future<Integer> future1 = executor.submit(() -> {
            System.out.println("Task 1 is executing...........");
            Thread.sleep(1000);
            return 10*10;
        });

        Future<Integer> future2 = executor.submit(() -> {
            System.out.println("Task 2 is executing...........");
            Thread.sleep(1000);
            return 20*20;
        });

        Future<Integer> future3 = executor.submit(() -> {
            System.out.println("Task 3 is executing...........");
            Thread.sleep(1000);
            return 30*30;
        });

        //Retrieve results from Future Objects using lambda expressions
        try {
            int result1 = future1.get();
            int result2 = future2.get();
            int result3 = future3.get();
            System.out.println("Result 1: "+result1);
            System.out.println("Result 2: "+result2);
            System.out.println("Result 3: "+result3);
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }

        //Shutdown the executor after all tasks aare completed
        executor.shutdown();
    }
}
