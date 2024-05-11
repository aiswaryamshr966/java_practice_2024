package com.generalcodes;

import java.io.Serializable;

public class Demo implements Serializable {
    public static final long serialVersionUID = 4L;
    //static and transient variable will not be serialized
    public int a;
    public String b;

    // Default constructor
    public Demo(int a, String b)
    {
        this.a = a;
        this.b = b;
    }
}
