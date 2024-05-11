package com.multithreading;

public class ThreadPriorityExample {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> getPriorities());
        Thread thread2 = new Thread(() -> getPriorities());
        Thread thread3 = new Thread(() -> getPriorities());

        //Set priority for all threads
        thread1.setPriority(Thread.MAX_PRIORITY); //10
        thread2.setPriority(Thread.MIN_PRIORITY); //1
        thread3.setPriority(Thread.NORM_PRIORITY); //5

        //Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
}

    private static void getPriorities() {

        System.out.println(Thread.currentThread().getName()+" priority: "+Thread.currentThread().getPriority());
    }
}
