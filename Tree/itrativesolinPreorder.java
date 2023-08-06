package com.example.mycode.matrix.Tree;

import java.util.Stack;

public class itrativesolinPreorder {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.right= new Node(40);
        root.right.right = new Node(50);
        itrativesolInpreorder(root);
    }

    private static void itrativesolInpreorder(Node root) {
        if(root == null) return;
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(s.isEmpty() == false){
            Node curr = s.pop();
            System.out.print(curr.key + " ");
            if(curr.right !=null)  s.push(curr.right);
            if(curr.left != null)  s.push(curr.left);

        }
    }
}
