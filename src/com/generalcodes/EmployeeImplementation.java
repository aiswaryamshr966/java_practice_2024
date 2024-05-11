package com.generalcodes;

import com.generalcodes.EmployeeClass;

import java.util.HashSet;
import java.util.Set;

public class EmployeeImplementation {
    public static void main(String[] args) {
        Set<EmployeeClass> set = new HashSet<>();
        set.add(new EmployeeClass("abc",1));
        set.add(new EmployeeClass("abc",1));

        System.out.println(set.size());
    }
}
