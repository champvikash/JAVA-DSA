package com.example.mycode.matrix.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class maxElemenetinTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.right= new Node(40);
        root.right.right = new Node(50);
        System.out.println(getmaxElement(root));
    }



    private static int getmaxElement(Node root) {
        if(root == null){
            return Integer.MIN_VALUE;
        } else {
            return Math.max(root.key, Math.max(getmaxElement(root.left),getmaxElement(root.right)));
        }
    }


    public static int getmaxElement2(Node root){
        if(root==null)return Integer.MIN_VALUE;
        Queue<Node> q=new LinkedList<>();  int max =  Integer.MIN_VALUE;
        q.add(root);
        while(q.isEmpty()==false){
            Node curr=q.poll(); max = Math.max(max , curr.key);
//            System.out.print(curr.key+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        } return max;
    }
}

// T.C FOR RECURSIVE FUNCTION = O(N).
// T.C FOR QUEUE SOLUTION = O(N).
// S.C COMPLEXITY FOR RECURSIVE IS = O(N).
// S.C COMPLEXITY FOR QUEUE SOL = O(W).
