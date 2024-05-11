package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        //Create a fixed-size thread pool with 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        //Submit task to the thread pool
        for (int i = 0; i < 10; i++) {
            int taskId = i+1;
            executor.execute(()->{
                String taskName = "Task "+taskId;
                System.out.println(Thread.currentThread().getName()+" executing : "+taskName);

                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+" completed : "+taskName);
            });
        }

        //Shutdown the executor after all tasks aare completed
        executor.shutdown();
    }
}
