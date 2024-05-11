package com.trees;

//This class defines the visualization of the tree data structure
class Node{
    int key;
    Node left, right;
    public Node(int item){
        key = item;
        left = right = null;
    }
}
