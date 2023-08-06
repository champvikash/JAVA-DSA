package com.example.mycode.matrix.Tree;

public class PrintNodesatKdistance {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.left.left = new Node(50);
        root.right = new Node(30);
        root.right.right = new Node(40);
        int k = 3;
        printKdistanceElement(root, k);
    }

    private static void printKdistanceElement(Node root, int k) {
        if(root==null) return;
        if(k==0){
            System.out.println(root.key + " ");
        } else {
            printKdistanceElement(root.left,k-1);
            printKdistanceElement(root.right,k-1);
        }
    }
}
