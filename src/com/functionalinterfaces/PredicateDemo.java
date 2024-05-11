package com.functionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = a -> a%2==0;
        System.out.println(predicate.test(10));

        BiPredicate<Integer,Integer> biPredicate1 = (n1,n2) -> (n1%n2==0);
        BiPredicate<Integer,Integer> biPredicate2 = (n1,n2) -> (n1*n2>100);
        System.out.println(biPredicate1.and(biPredicate2).test(10,100));
        System.out.println(biPredicate1.or(biPredicate2).test(10,100));

        BiPredicate<String,String> biPredicate3 = (s1,s2) -> s1.startsWith(s2);
        BiPredicate<String,String> biPredicate4 = (s1,s2) -> s1.endsWith(s2);
        System.out.println(biPredicate3.and(biPredicate4).test("Aiswarya","Ais"));
        System.out.println(biPredicate3.or(biPredicate4).test("Aiswarya Mishra","Mishra"));

    }
}
