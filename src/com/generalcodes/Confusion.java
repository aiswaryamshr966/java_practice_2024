package com.generalcodes;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

//class Parent{
//    protected void print(){
//        System.out.println("Parent");
//    }
//
//    protected int print(){
//        return 1;
//    }
//}
public class Confusion {
    public static void main(String[] args) {
//        Parent p = new Parent();
//        p.print();

        String s1 = "A";
        String s2 = new String("A");
//        s1 = s1+"B";
//        System.out.println(s1+" "+s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.intern().equals(s2));
        System.out.println(s1.intern()==s2);

        List<Integer> list = Arrays.asList(1,3,5,7,9,2,4,6,8,0);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);

        System.out.println();

        String x = "Java";
        x.concat(" Rules!");
        System.out.println(x);
        x.toUpperCase();
        x.replace('a','X');
        System.out.println(x);

        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                //something
            }
        };

        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        };

        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };

        Stream stream = new Stream() {
            @Override
            public Stream filter(Predicate predicate) {
                return null;
            }

            @Override
            public Stream map(Function mapper) {
                return null;
            }

            @Override
            public IntStream mapToInt(ToIntFunction mapper) {
                return null;
            }

            @Override
            public LongStream mapToLong(ToLongFunction mapper) {
                return null;
            }

            @Override
            public DoubleStream mapToDouble(ToDoubleFunction mapper) {
                return null;
            }

            @Override
            public Stream flatMap(Function mapper) {
                return null;
            }

            @Override
            public IntStream flatMapToInt(Function mapper) {
                return null;
            }

            @Override
            public LongStream flatMapToLong(Function mapper) {
                return null;
            }

            @Override
            public DoubleStream flatMapToDouble(Function mapper) {
                return null;
            }

            @Override
            public Stream distinct() {
                return null;
            }

            @Override
            public Stream sorted() {
                return null;
            }

            @Override
            public Stream sorted(Comparator comparator) {
                return null;
            }

            @Override
            public Stream peek(Consumer action) {
                return null;
            }

            @Override
            public Stream limit(long maxSize) {
                return null;
            }

            @Override
            public Stream skip(long n) {
                return null;
            }

            @Override
            public void forEach(Consumer action) {

            }

            @Override
            public void forEachOrdered(Consumer action) {

            }

            @NotNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NotNull
            @Override
            public Object[] toArray(IntFunction generator) {
                return new Object[0];
            }

            @Override
            public Object reduce(Object identity, BinaryOperator accumulator) {
                return null;
            }

            @NotNull
            @Override
            public Optional reduce(BinaryOperator accumulator) {
                return Optional.empty();
            }

            @Override
            public Object reduce(Object identity, BiFunction accumulator, BinaryOperator combiner) {
                return null;
            }

            @Override
            public Object collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner) {
                return null;
            }

            @Override
            public Object collect(Collector collector) {
                return null;
            }

            @NotNull
            @Override
            public Optional min(Comparator comparator) {
                return Optional.empty();
            }

            @NotNull
            @Override
            public Optional max(Comparator comparator) {
                return Optional.empty();
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public boolean anyMatch(Predicate predicate) {
                return false;
            }

            @Override
            public boolean allMatch(Predicate predicate) {
                return false;
            }

            @Override
            public boolean noneMatch(Predicate predicate) {
                return false;
            }

            @NotNull
            @Override
            public Optional findFirst() {
                return Optional.empty();
            }

            @NotNull
            @Override
            public Optional findAny() {
                return Optional.empty();
            }

            @NotNull
            @Override
            public Iterator iterator() {
                return null;
            }

            @NotNull
            @Override
            public Spliterator spliterator() {
                return null;
            }

            @Override
            public boolean isParallel() {
                return false;
            }

            @NotNull
            @Override
            public BaseStream sequential() {
                return null;
            }

            @NotNull
            @Override
            public BaseStream parallel() {
                return null;
            }

            @NotNull
            @Override
            public BaseStream unordered() {
                return null;
            }

            @NotNull
            @Override
            public BaseStream onClose(Runnable closeHandler) {
                return null;
            }

            @Override
            public void close() {

            }
        };
    }
}
