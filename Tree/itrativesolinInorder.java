package com.example.mycode.Tree;

import java.util.Stack;

public class itrativesolinInorder {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.right= new Node(40);
        root.right.right = new Node(50);
        inOrderItrarivesolution(root);
    }

    private static void inOrderItrarivesolution(Node root) {
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while( curr !=null || s.isEmpty() == false){
            while(curr != null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            System.out.println(curr.key + " ");
            curr = curr.right;
        }
    }
}
