package com.functionalinterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = s-> System.out.println(s.toUpperCase());
        consumer.accept("Aiswarya Mishra");

        BiConsumer<String,String> biConsumer = (a,b) -> System.out.println("a: "+a+" "+"b: "+b);
        biConsumer.accept("Aiswarya","Mishra");

        BiConsumer<Integer,Integer> biConsumer1 = (x,y) -> System.out.println("Addition is: "+(x+y));
        BiConsumer<Integer,Integer> biConsumer2 = (x,y) -> System.out.println("Subtraction is: "+(x-y));

        biConsumer1.andThen(biConsumer2).accept(10,20);
    }
}
