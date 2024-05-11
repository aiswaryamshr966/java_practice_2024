package com.multithreading;

class Processor{
    public void produce() throws InterruptedException{
        synchronized (this) {
            System.out.println("Producer Thread Running.........");

            //Simulating some time-consuming work
            Thread.sleep(2000);

            System.out.println("Producer Thread Notifying........");

            //Notify the consumer thread
            notify();
        }
    }

    public void consume() throws InterruptedException{
        synchronized (this) {
            System.out.println("Consumer Thread Running.........");

            //Wait until notified by the producer thread
            wait();

            System.out.println("Consumer Thread Resumed.........");
        }
    }
}

public class ThreadCommunicaationDemo {
    public static void main(String[] args) {
        final Processor processor = new Processor();

        Thread producerThread = new Thread(() -> {
            try {
                processor.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                processor.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();

        //Wit for both threads to finish
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
