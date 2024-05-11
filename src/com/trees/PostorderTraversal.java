package com.trees;

public class PostorderTraversal {
    Node root;

    public PostorderTraversal(){
        root = null;
    }

    public void printPostorder(Node node){
        if (node == null) {
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    public static void main(String[] args){
        PostorderTraversal tree = new PostorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("Postorder traversal of binary tree is ");
        tree.printPostorder(tree.root);
    }
}
