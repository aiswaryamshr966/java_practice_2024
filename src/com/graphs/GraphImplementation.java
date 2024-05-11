package com.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphImplementation {
    public static void main(String[] args) {
        int v = 6;
        int e = 10;

        //Adjacency Matrix
        int a[][] = new int[v+1][v+1];

        //Adjacency List
        ArrayList<LinkedList<Integer>> adj = new ArrayList<>();
    }

    //Biderectional Graph using Adjacency Matrix
    static void addEdge(int a[][], int source, int dest){
        a[source][dest] = 1;
        a[dest][source] = 1;
    }

    //Biderectional Graph using Adjacency List
    static void addEdge(ArrayList<LinkedList<Integer>> adj, int source, int dest){
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }
}
