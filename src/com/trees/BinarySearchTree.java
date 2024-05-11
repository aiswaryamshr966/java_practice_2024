package com.trees;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree(){
        root = null;
    }

    //Function to insert a node in the tree
    private Node insert(Node node, int key){
        //If the tree is empty, return a new node
        if (node == null) return new Node(key);
        //if the key is less than the node, insert in the left subtree
        if (key < node.key) node.left = insert(node.left, key);
        //if the key is greater than the node, insert in the right subtree
        else if (key > node.key) node.right = insert(node.right, key);
        //return the unchanged node pointer
        return node;
    }

    //Function to search a node in the tree
    private Node search(Node node, int key){
        //If root is null, return node
        if (node == null) return node;
        //If the key is found, return the node
        if (key == node.key) return node;
        //If the key is less than the node, search in the left subtree
        if (key < node.key) return search(node.left, key);
        //else search in the right subtree
        return search(node.right, key);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = tree.insert(tree.root, 6);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 8);
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 7);
        tree.root = tree.insert(tree.root, 9);

        Node node = tree.search(tree.root, 8);

        if (node != null) System.out.println("Key found: " + node.key);
        else System.out.println("Key not found");
    }
}