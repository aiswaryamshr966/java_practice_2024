package com.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

//Detect Cycle in a Directed Graph
public class CycleDetectionDirected {

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

        boolean isCyclic = isCyclic(adj,v);

        if(isCyclic) System.out.println("Cycle is present");
        else System.out.println("Cycle is not present");
    }

    private static void addEdge(ArrayList<LinkedList<Integer>> adj, int source, int destination) {
        adj.get(source).add(destination);
        adj.get(destination).add(source);
    }

    private static boolean isCyclic(ArrayList<LinkedList<Integer>> adj, int V) {
        boolean visited[] = new boolean[V];
        boolean recStack[] = new boolean[V];

        for (int i = 1; i <= V; i++) {
            if (!visited[i]) {
                if (dfs(i, adj, visited, recStack)) return true;
            }
        }
        return false;
    }

    private static boolean dfs(int v, ArrayList<LinkedList<Integer>> adj, boolean[] visited, boolean[] recStack) {
        visited[v] = true;
        recStack[v] = true;

        for (Integer neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, adj, visited, recStack)) return true;
            }
            else if (recStack[neighbor]) return true;
        }

        recStack[v] = false;
        return false;
    }
}
