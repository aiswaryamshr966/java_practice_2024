package com.complex;

import java.util.ArrayList;
import java.util.List;

public class Complex7 {
    public static void main(String[] args) {
        List<Integer>[] intList = new List[5];
        Object[] objArray = intList;
        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(Double.valueOf(1.23));
        objArray[0] = doubleList;
    }
}
