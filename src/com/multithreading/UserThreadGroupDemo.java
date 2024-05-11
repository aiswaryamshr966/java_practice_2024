package com.multithreading;

class MyThreads extends Thread{
    public MyThreads(ThreadGroup group, String name){
        super(group, name);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" is executing");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

public class UserThreadGroupDemo {
    public static void main(String[] args) {
        //Create a thread group
        ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");

        //Create and start threads using lambda expressions
        Thread thread1 = new Thread(threadGroup, () -> {
            System.out.println(Thread.currentThread().getName() + " is executing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }, "Thread 1");

        Thread thread2 = new Thread(threadGroup, () -> {
            System.out.println(Thread.currentThread().getName() + " is executing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }, "Thread 2");

        Thread thread3 = new Thread(threadGroup, () -> {
            System.out.println(Thread.currentThread().getName() + " is executing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }, "Thread 3");

        //Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        //Print information about the thread group
        threadGroup.list();

        //Wait for the threads in the group to finish
        while(threadGroup.activeCount()>0){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }

        //Display information about the thread group after all threads have finished
        threadGroup.list();
    }
}
