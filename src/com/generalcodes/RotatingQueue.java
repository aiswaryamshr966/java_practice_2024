package com.generalcodes;

import java.util.ArrayDeque;
import java.util.Queue;

public class RotatingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Original Queue : "+queue);

        int pivot = 3;
        for (int i=0;i<pivot;i++){
            queue.add(queue.poll());
        }

        System.out.println("Rotated Queue : "+queue);
    }
}