package com.multithreading;

class Counter {
    private int count = 0;

    //Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
    }

    //Synchronized method to get the counter value of the counter
    public synchronized int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private final Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter value: " + counter.getCount());
    }
}
