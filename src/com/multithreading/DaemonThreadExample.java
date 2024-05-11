package com.multithreading;

public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
           while(true){
               System.out.println("Daemon thread is running");
               try{
                   Thread.sleep(1000);
               }catch (InterruptedException e){
                   e.printStackTrace();
               }
           }
        });

        daemonThread.setDaemon(true); // Set the daemon flag true
        daemonThread.start();

        //Sleep for a while to observe the behavious of daemon thread
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread Exiting");
    }
}
