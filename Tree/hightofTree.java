package com.example.mycode.Tree;

public class hightofTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.left.left = new Node(50);
        root.right = new Node(30);
        root.right.right = new Node(40);
        System.out.println(treeHight(root));
    }
//
//    private static int treeHight(Node root) {
//        if (root == null)
//            return 0;
//        else {
//            int lDepth = treeHight(root.left);
//            int rDepth = treeHight(root.right);
//
//            if (lDepth > rDepth)
//                return (lDepth + 1);
//            else
//                return (rDepth + 1);
//        }
//    }

    private static int treeHight(Node root){
        if(root==null) return 0;
        else {
            return Math.max(treeHight(root.left),treeHight(root.right)) +1;
        }
    }
}
