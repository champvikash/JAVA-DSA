package com.example.mycode.matrix.Tree;

public class sizeofTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.right= new Node(40);
        root.right.right = new Node(50);
        System.out.println(getTreeSize(root));

    }

    private static int getTreeSize(Node root) {
        if(root == null){
            return 0;
        } else {
            return getTreeSize(root.left) + getTreeSize(root.right) +1;
        }

    }
}
