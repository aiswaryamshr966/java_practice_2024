package com.cracking_the_coding_interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamImplementation {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(1, "Alice", 150.0, "COMPLETED"),
                new Order(2, "Bob", 300.0, "PENDING"),
                new Order(3, "Alice", 450.0, "COMPLETED"),
                new Order(4, "Dave", 200.0, "COMPLETED"),
                new Order(5, "Bob", 50.0, "CANCELLED")
        );

        //revenue generated or total amount received on completed orders

        double revenue = orders.stream()
                .filter(e->e.getStatus().equals("COMPLETED"))
                .mapToDouble(Order::getPrice)
                .sum();

        System.out.println("Revenue Generated: "+revenue);

        //Top three expensive orders

        orders.stream()
                .sorted(Comparator.comparingDouble(Order::getPrice).reversed())
                .limit(3)
                .forEach(System.out::println);

        //Total amount spent by each customer

        orders.stream()
                .collect(Collectors.groupingBy(Order::getName, Collectors.summingDouble(Order::getPrice)))
                .entrySet()
                .stream()
                .forEach(e-> System.out.println(e.getKey()+" : "+e.getValue()));

        
    }
}
