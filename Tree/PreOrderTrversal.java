package com.example.mycode.matrix.Tree;
// Inorder -> ROOT LEFT RIGHT;
public class PreOrderTrversal {
    public static void main(String[] args) {
          Node root = new Node(10);
          root.left = new Node(20);
          root.right = new Node(30);
          root.right.right = new Node(40);
        root.left.left = new Node(70);
          inOrder(root);
    }
    private static void inOrder(Node root) {
        if(root != null){
            System.out.print(root.key+" ");
            inOrder(root.left);
            inOrder(root.right);
        }
    }
}
