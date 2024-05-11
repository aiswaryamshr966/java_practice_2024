package com.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFSImplementation {

    public static void main(String[] args) {
        ArrayList<LinkedList<Integer>> adj = new ArrayList<>();
        int v = 6;
        int e = 8;

        int pred[] = new int[v+1];
        int dist[] = new int[v+1];

        for (int i = 0; i <= v; i++) {
            adj.add(new LinkedList<>());
        }

        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,1,5);
        addEdge(adj,2,5);
        addEdge(adj,3,4);
        addEdge(adj,4,5);
        addEdge(adj,4,6);
        addEdge(adj,5,6);

        boolean isReached = bfs(adj,1,6,v,pred,dist);

        if(isReached){
            System.out.println("The path is: ");
            int i = 6;
            while(i!=1){
                System.out.print(i+"<-");
                i = pred[i];
            }
            System.out.println(1);
        }
    }

    private static void addEdge(ArrayList<LinkedList<Integer>> adj, int source, int dest){
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }
    private static boolean bfs(ArrayList<LinkedList<Integer>> adj, int src, int dest, int v, int pred[], int dist[]) {
        LinkedList<Integer> queue = new LinkedList<>(); //Queue<>
        boolean visited[] = new boolean[v+1];
        for (int i = 0; i <= v; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }

        visited[src] = true;
        dist[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()) {
            int cur = queue.remove();
            for (int i = 0; i < adj.get(cur).size(); i++) {
                int neighbor = adj.get(cur).get(i);
                if (visited[neighbor] == false) {
                    visited[neighbor] = true;
                    dist[neighbor] = dist[cur] + 1;
                    pred[neighbor] = cur;
                    queue.add(neighbor);

                    if (neighbor == dest) return true;
                }
            }
        }
        return false;
    }
}
