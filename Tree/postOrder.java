package com.example.mycode.Tree;
// Post Order -> LEFT RIGHT ROOT
public class postOrder {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.right = new Node(40);
        PostOrder(root);
    }

    private static void PostOrder(Node root) {
       if(root != null){
           PostOrder(root.left);
           PostOrder(root.right);
           System.out.println(root.key);
       }
    }
}
