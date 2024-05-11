package com.multithreading;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        //Set the default uncaught exception handler
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());

        //Create and start a thread that throws an exception
        Thread thread = new Thread(() -> {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            //Throw an exception
            throw new RuntimeException("Exception in thread");
        });

        thread.start();
    }

    static class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println("Uncaught exception in thread: "+t.getName());
            System.out.println("Exception message: "+e.getMessage());
        }
    }
}
