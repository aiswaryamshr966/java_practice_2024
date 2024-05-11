package com.graphs;

import java.util.ArrayList;
import java.util.LinkedList;


//Detect Cycke in Undirected Graph
public class CycleDetection {

    public static void main(String[] args) {
        ArrayList<LinkedList<Integer>> adj = new ArrayList<>();
        int v = 6;
        int e = 8;

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

        boolean isCycle = isCycle(adj,v);

        if(isCycle) System.out.println("Cycle is present");
        else System.out.println("Cycle is not present");
    }

    private static void addEdge(ArrayList<LinkedList<Integer>> adj, int source, int destination) {
        adj.get(source).add(destination);
        adj.get(destination).add(source);
    }


    //Function to detect cycle in an undirected graph
    private static boolean isCycle(ArrayList<LinkedList<Integer>> adj, int V) {
        boolean visited[] = new boolean[V];

        for (int i = 1; i <= V; i++) {
            if (!visited[i]) {
                if (dfs(i, adj, visited, -1)) return true;
            }
        }
        return false;
    }

    private static boolean dfs(int v, ArrayList<LinkedList<Integer>> adj, boolean[] visited, int parent) {
        visited[v] = true;
        for (Integer neighnor : adj.get(v)) {
            if (!visited[neighnor]) {
                if (dfs(neighnor, adj, visited, v)) return true;
            } else if (neighnor != parent) return true;
        }
        return false;
    }
}
