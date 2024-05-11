package com.multithreading;

public class InterruptThreadExample {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            try{
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread is running");
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        thread.start();

        try{
            //Let the main thread sleep for a while
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //interrupt the thread
        thread.interrupt();

        try{
            //Let the main thread sleep for a while
            Thread.sleep(1000);
            //Interrupt the thread
            thread.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
