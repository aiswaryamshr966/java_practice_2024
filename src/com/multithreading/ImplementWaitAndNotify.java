package com.multithreading;

class SharedObject{
    boolean isReady = false;

    synchronized void waitForReady(){
        while (!isReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted While Waiting");
            }
        }
        System.out.println("Shared Resource Is Ready");
    }

    synchronized void setReady(){
        isReady = true;
        notify();
    }
}

public class ImplementWaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        SharedObject sharedObject = new SharedObject();

        //Creating a Runnable inline inside the main method
        Runnable waiterRunnable = () -> {
            synchronized (sharedObject) {
                sharedObject.waitForReady();
            }
        };

        //Creating a Thread using the Runnable
        Thread waiterThread = new Thread(waiterRunnable);

        //Starting the Thread
        waiterThread.start();

        //Simulating some work before setting the shared resource ready
        Thread.sleep(2000);

        //Setting the shared resource ready
        synchronized (sharedObject) {
            sharedObject.setReady();
        }

        //Waiting for the waiter thread to finish
        waiterThread.join();
    }

}
