package com.generalcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectManipulation {
    public static void main(String[] args) {
        List<Integer>[] intList = new List[5];
        Object[] objArray = intList;
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(Double.valueOf(1.23));
        objArray[0] = doubleList;

        System.out.println(Arrays.deepToString(objArray));
    }
}
