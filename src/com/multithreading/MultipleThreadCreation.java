package com.multithreading;

import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class MultipleThreadCreation {
    public static void main(String[] args) {
        //Manual Mode
        multiThreadCreation();

        //Order Mode Using Streams
        //multiThreadCreationUsingStreams();

        //Order Mode Using Streams and AtomicReference and Synchronized Lock
        //multiThreadCreationUsingStreamsInOrder();
    }

    //This will create 5 threads
    private static void multiThreadCreation() {
        for(int i=0;i<5;i++){
            int finalI = i;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Hello from thread!"+ finalI);
                }
            });
            try{
                thread.start();
                thread.join(); // Wait for the thread to complete before starting the next one
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private static void multiThreadCreationUsingStreams(){
        IntStream.range(0,5)
                .mapToObj(i->new Thread(()->System.out.println("Hello from thread!"+i)))
                .forEach(thread -> {
                    try{
                        thread.start();
                        thread.join();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                });
    }

    private static void multiThreadCreationUsingStreamsInOrder(){
        Object lock = new Object();
        AtomicReference<Thread> previousThread = new AtomicReference<>();
        IntStream.range(0,5)
                .mapToObj(i->new Thread(()->{
                    synchronized (lock){
                        try{
                            if(previousThread.get() !=null) previousThread.get().join();
                            System.out.println("Hello From Thread "+i);
                            previousThread.set(Thread.currentThread());
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }))
                .forEachOrdered(Thread::start);
    }
}
