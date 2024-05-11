package com.generalcodes;

import com.generalcodes.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
    }
}
