package com.complex_stream_problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NthLargestElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 3, 8, 4, 6);
        int nthSmallest = findNthSmallest(numbers, 3);
        int nthLargest = findNthLargest(numbers, 2);

        int largest = numbers.stream().max(Comparator.naturalOrder()).get();
        int smallest = numbers.stream().min(Comparator.naturalOrder()).get();

        System.out.println("Nth Smallest Element: " + nthSmallest);
        System.out.println("Nth Largest Element: " + nthLargest);
    }

    private static int findNthLargest(List<Integer> numbers, int i) {
        return numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(i-1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("List is too short"));
    }

    private static int findNthSmallest(List<Integer> numbers, int i) {
        return numbers.stream()
                .sorted()
                .skip(i-1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("List is too short"));
    }
}
