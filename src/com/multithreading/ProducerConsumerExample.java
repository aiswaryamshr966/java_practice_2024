package com.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        //Using a blocking queue for simplicity
        BlockingQueue<Integer> buffer = new LinkedBlockingQueue<>(5);

        //Producer Thread Creation
        Thread producer = new Thread(()->{
           int value = 0;
           while (true) {
               try{
                   buffer.put(value);
                   System.out.println("Producer produced: "+value);
                   value++;
                   Thread.sleep(1000);
               }catch (InterruptedException e){
                   e.printStackTrace();
               }
           }
        });

        //Consumer Thread Creation
        Thread consumer = new Thread(()->{
            while (true) {
                try{
                    int value = buffer.take();
                    System.out.println("Consumer consumed: "+value);
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
