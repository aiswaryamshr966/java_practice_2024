package com.latest_practice;

import java.util.*;

public class KFrequentElements {
    public static void main(String[] args) {
        int[] array = {1,1,1,2,2,3};
        int k = 2;
        List<Integer> result = kTopElements(array,k);
        System.out.println(result);
    }

    private static List<Integer> kTopElements(int[] array, int k) {
        // Step 1: Count the frequency of each element using a HashMap
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int num : array){
            if (frequencyMap.containsKey(num)) frequencyMap.put(num,frequencyMap.get(num)+1);
            else frequencyMap.put(num,1);
        }

        // Step 2: Use a PriorityQueue (Min Heap) to keep track of the k most frequent elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));
        for (int num : frequencyMap.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll();
        }

        // Step 3: Build the result list
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        // Step 4: Reverse the result list to get the elements in descending order of frequency
        Collections.reverse(result);

        return result;
    }
}
