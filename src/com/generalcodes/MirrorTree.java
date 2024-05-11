package com.generalcodes;

class BSTNode {
    int data;
    BSTNode left, right;

    public BSTNode(int item){
        this.data=item;
        left=right=null;
    }
}

public class MirrorTree {
    BSTNode root;
    private void mirror(){
        root = mirror(root);
    }

    private BSTNode mirror(BSTNode root) {
        if (root==null) return root;
        BSTNode left = mirror(root.left);
        BSTNode right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    private void inOrder(){
        inOrder(root);
    }

    private void inOrder(BSTNode node){
        if (node==null) return;
        inOrder(node.left);
        System.out.print(node.data+" ");

        inOrder(node.right);
    }

    public static void main(String[] args) {
        MirrorTree tree = new MirrorTree();
        tree.root = new BSTNode(1);
        tree.root.left = new BSTNode(2);
        tree.root.right = new BSTNode(3);
        tree.root.left.left = new BSTNode(4);
        tree.root.left.right = new BSTNode(5);

        System.out.println("Inorder Traversal of the constructed tree is: ");
        tree.inOrder();
        System.out.println();

        tree.mirror();

        System.out.println("inOrder traversal of the mirror tree is: ");
        tree.inOrder();
    }
}
