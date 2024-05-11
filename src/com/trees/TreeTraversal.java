package com.trees;

class BSTNodeTraversal {
    int data;
    BSTNodeTraversal left, right;

    public BSTNodeTraversal(int item){
        this.data=item;
        left=right=null;
    }
}
public class TreeTraversal {
    BSTNodeTraversal root;
    public TreeTraversal(){
        root = null;
    }

    private void printInOrder(){
        printInOrder(root);
    }

    private void printPreOrder(){
        printPreOrder(root);
    }

    private void printPostOrder(){
        printPostOrder(root);
    }

    private void printInOrder(BSTNodeTraversal node){
        if (node==null) return;
        printInOrder(node.left);
        System.out.print(node.data+" ");
        printInOrder(node.right);
    }

    private void printPreOrder(BSTNodeTraversal node){
        if (node==null) return;
        System.out.print(node.data+" ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    private void printPostOrder(BSTNodeTraversal node) {
        if (node==null) return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data+" ");
    }

    public static void main(String[] args) {
        TreeTraversal inOrderTree = new TreeTraversal();
        inOrderTree.root = new BSTNodeTraversal(1);
        inOrderTree.root.left = new BSTNodeTraversal(2);
        inOrderTree.root.right = new BSTNodeTraversal(3);
        inOrderTree.root.left.left = new BSTNodeTraversal(4);
        inOrderTree.root.left.right = new BSTNodeTraversal(5);

        System.out.print("InOrder Traversal Of Binary Tree Is: ");
        inOrderTree.printInOrder();
        System.out.println();

        TreeTraversal preOrderTree = new TreeTraversal();
        preOrderTree.root = new BSTNodeTraversal(1);
        preOrderTree.root.left = new BSTNodeTraversal(2);
        preOrderTree.root.right = new BSTNodeTraversal(3);
        preOrderTree.root.left.left = new BSTNodeTraversal(4);
        preOrderTree.root.left.right = new BSTNodeTraversal(5);

        System.out.print("PreOrder Traversal Of Binary Tree Is: ");
        preOrderTree.printPreOrder();
        System.out.println();

        TreeTraversal postOrderTree = new TreeTraversal();
        postOrderTree.root = new BSTNodeTraversal(1);
        postOrderTree.root.left = new BSTNodeTraversal(2);
        postOrderTree.root.right = new BSTNodeTraversal(3);
        postOrderTree.root.left.left = new BSTNodeTraversal(4);
        postOrderTree.root.left.right = new BSTNodeTraversal(5);

        System.out.print("PostOrder Traversal Of Binary Tree Is: ");
        postOrderTree.printPostOrder();
        System.out.println();
    }
}
