package com.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class DFSImplementation {

    public static void main(String[] args) {
        ArrayList<LinkedList<Integer>> adj = new ArrayList<>();
        int v = 6;
        int e = 8;

        int pred[] = new int[v + 1];
        int dist[] = new int[v + 1];

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

        System.out.println("DFS Path: "+dfs(1,v,adj)); // Start DFS from vertex 1
    }

    private static void addEdge(ArrayList<LinkedList<Integer>> adj, int source, int dest) {
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }

    private static ArrayList<Integer> dfs(int source, int v, ArrayList<LinkedList<Integer>> adj) {
        boolean vis[] = new boolean[v + 1];
        ArrayList<Integer> path = new ArrayList<>();
        dfsUtil(source, adj, vis, path);

        return path;
    }

    private static void dfsUtil(int v, ArrayList<LinkedList<Integer>> adj, boolean[] vis, ArrayList<Integer> path) {
        vis[v] = true;
        path.add(v);

        for (Integer neighbor: adj.get(v)) {
            if (!vis[neighbor]) dfsUtil(neighbor, adj, vis, path);
        }
    }
}