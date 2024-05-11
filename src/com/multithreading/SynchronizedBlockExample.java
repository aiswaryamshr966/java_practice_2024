package com.multithreading;

public class SynchronizedBlockExample {

    static class SharedResource {
        private int count = 0;

        //Increment the count using a synchronized block
        public void increment() {
            synchronized (this) {
                count++;
                System.out.println(Thread.currentThread().getName()+" Incremented Count To: "+count);
            }
        }
    }
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        //Create 2 Threads
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                sharedResource.increment();
                try{
                    Thread.sleep(100); //Simulate some work
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                sharedResource.increment();
                try{
                    Thread.sleep(100); //Simulate some work
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        //Start both the threads
        thread1.start();
        thread2.start();
    }
}
