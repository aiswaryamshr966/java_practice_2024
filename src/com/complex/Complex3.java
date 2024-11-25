package com.complex;

import java.io.IOException;

public class Complex3 {
    public static void main(String[] args) {
        try{
            throw new IOException("IO Exception");
        }catch(Exception e){
            throw new RuntimeException("Runtime Exception");
        }finally{
            System.out.println("This is Finally Block, it will be executed always");
        }
    }
}
