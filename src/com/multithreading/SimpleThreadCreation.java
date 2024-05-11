package com.multithreading;

public class SimpleThreadCreation {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread!");
            }
        });
        thread.start();
    }
}
