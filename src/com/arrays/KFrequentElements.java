package com.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class KFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        List<Integer> result = topKFrequent(nums, k);
        List<Integer> streamingResult = topKFrequentUsingStreams(nums,k);
        System.out.println("Top " + k + " frequent elements: " + result);
        System.out.println("Top " + k + " frequent elements: " + streamingResult);
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a Min Heap based on the frequency of elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));

        // Keep only the top k frequent elements in the heap
        for (int num : frequencyMap.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Convert the heap to a list
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        // Reverse the list to get the elements in descending order of frequency
        Collections.reverse(result);

        return result;
    }

    public static List<Integer> topKFrequentUsingStreams(int[] nums, int k) {
        Map<Integer,Long> frequencyMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        return frequencyMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,Long>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
