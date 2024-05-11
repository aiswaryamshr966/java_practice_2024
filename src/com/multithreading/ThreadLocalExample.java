package com.multithreading;

public class ThreadLocalExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> accessThreadLocal("Thread 1"));
        Thread thread2 = new Thread(() -> accessThreadLocal("Thread 2"));
        Thread thread3 = new Thread(() -> accessThreadLocal("Thread 3"));

        //Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static void accessThreadLocal(String s) {
        //Declare a thread-local variable with initital value 0
        ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(()->0);

        //Increment and print the thread-local variable
        for (int i = 0; i < 10; i++) {
            int value = threadLocal.get();
            value++;
            threadLocal.set(value);
            System.out.println(s + ": Thread-local variable = " + value);
        }
    }
}
