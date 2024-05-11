package com.multithreading;

public class VolatileExample {

    private static volatile boolean flag = false;

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> volatileUtility());
        Thread thread2 = new Thread(() -> volatileUtility());

        //Start both threads
        thread1.start();
        thread2.start();

        //Sleap for aa while to observe the behavious of volatile
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Set the flag to true
        flag = true;
    }

    private static void volatileUtility() {
        while (!flag) {
            //Spin until the flag becomes true
        }
        System.out.println(Thread.currentThread().getName() + " Flag is now true");
    }
}
