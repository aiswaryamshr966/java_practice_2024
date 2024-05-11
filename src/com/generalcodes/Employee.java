package com.generalcodes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    String id;
    String name;
    int age;

    public Employee(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("1","Aiswarya",30));
        empList.add(new Employee("2","Soumya",29));
        empList.add(new Employee("3","Amar",28));
        empList.add(new Employee("4","Laltu",27));
        empList.add(new Employee("5","Subham",26));

        empList.stream()
                .sorted(Comparator.comparing(employee -> employee.age))
                .map(Employee::getName)
                .toList()
                .forEach(System.out::println);
    }
}
