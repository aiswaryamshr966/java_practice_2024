package com.generalcodes;

public final class Singleton {
    private static volatile Singleton instance = null;

    private Singleton(){
        //Write Something
    }

    public static Singleton getInstance(){
        if (instance==null) instance = new Singleton();
        return instance;
    }
}
