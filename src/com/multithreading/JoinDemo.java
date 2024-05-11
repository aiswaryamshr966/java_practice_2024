package com.multithreading;

import java.util.concurrent.CompletableFuture;

public class JoinDemo {
    public static void main(String[] args) {
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(()->{
            for(int i=0;i<10;i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(()->{
            for(int i=0;i<10;i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        CompletableFuture<Void> future3 = CompletableFuture.runAsync(()->{
            for(int i=0;i<10;i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        future1.thenRun(()-> System.out.println("Future 1 completed"));
        future2.thenRun(()-> System.out.println("Future 2 completed"));
        future3.thenRun(()-> System.out.println("Future 3 completed"));

        //Join all the futures
        CompletableFuture.allOf(future1,future2,future3).join();
        System.out.println("All Futures Completed");
    }
}
