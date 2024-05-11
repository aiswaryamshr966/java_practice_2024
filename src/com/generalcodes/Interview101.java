package com.generalcodes;

import java.util.Arrays;
import java.util.Comparator;

//String[] str = {"I", "AM", "LONGEST", "WORD"};
public class Interview101 {
    public static void main(String[] args) {
        String[] str = {"I", "AM", "LONGEST", "WORD"};

        //Map<Integer, String> map = new HashMap<>();
        Arrays.stream(str)
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(z-> System.out.println(z.length()+" : "+z));
    }
}


/*
    com.generalcodes.Employee: empID, empName, empSalary

    SELECT empID, empName, empSalary
    FROM com.generalcodes.Employee
    ORDER BY empSalary DESC
    LIMIT 7
    OFFSET 6;

    SELECT TOP
 */