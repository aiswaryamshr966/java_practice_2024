package com.stream_api_programming;

import java.util.function.Function;
import java.util.stream.Collectors;

//List<Employee> empList;
public class CGIinterview {
    public static void main(String[] args) {
//        List<Employee> empList = new ArrayList<>();
//        List<Employee> maleEmployees = empList.stream()
//                .filter(e->e.getGender().equals("Male"))
//                .collect(Collectors.toList());
//
//        List<Employee> femaleEmployees = empList.stream()
//                .filter(e->e.getGender().equals("Female"))
//                .collect(Collectors.toList());
//

        String name = "Aiswarya Mishra";
        name.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(e-> System.out.println(e.getKey()+" : "+e.getValue()));
    }
}
