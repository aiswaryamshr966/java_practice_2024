package com.multithreading;

public class ThreadGroupExmple {
    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");

        Thread thread1 = new Thread(threadGroup, new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(threadGroup, new MyRunnable(), "Thread 2");

        //Start both threads
        thread1.start();
        thread2.start();

        //Print information about the thread group
        threadGroup.list();
    }

    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
