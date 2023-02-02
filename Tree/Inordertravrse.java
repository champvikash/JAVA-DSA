package com.example.mycode.Tree;
//Inorde ->   LEFT ROOT RIGHT
public class Inordertravrse {
    public static void main(String[] args) {
        Node root  = new Node(10);
        root.left  = new Node(20);
        root.right = new Node(30);
        root.right.right = new Node( 40);
        root.left.left = new Node(50);
        inorder(root);
    }

    private static void inorder(Node root) {
        if(root != null){
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }
}
