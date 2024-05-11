package com.trees;

public class InorderTraversal {
    Node root;

    public InorderTraversal(){
        root = null;
    }

    public void printInorder(Node node){
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    public static void main(String[] args){
        InorderTraversal tree = new InorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("Inorder traversal of binary tree is ");
        tree.printInorder(tree.root);
    }
}
