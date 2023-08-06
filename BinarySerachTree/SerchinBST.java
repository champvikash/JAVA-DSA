package com.example.mycode.matrix.BinarySerachTree;

class Node{
    int key;
    Node left,right;
    Node(int x){
        key=x;
        left = right = null;
    }
}

public class SerchinBST {
    public static void main(String[] args) {
        Node root=new Node(15);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.right=new Node(20);
        root.right.left=new Node(18);
        root.right.left.left=new Node(16);
        root.right.right=new Node(80);
        int x=21;
        boolean ans = searchKey(root,x);
        System.out.println(ans);
    }

    // this is iterative solution
    // T.C for iterative solution worst case = height of BST=O(h).
    // S.c = O(1) because we are running only  a loop.

    private static boolean searchKey(Node root, int x) {
        while(root !=null){
            if(root.key==x){
                return true;
            } else if(root.key<x){
                root=root.right;
            } else if(root.key>x){
                root=root.left;
            }
        }
        return false;
    }

    // this is recursive  solution
    // T.C for iterative solution worst case = height of BST=O(h).
    // S.c = O(n) because we are running only  a loop.

//    private static boolean searchKey(Node root, int x) {
//        if(root == null) return false;
//        else if(root.key==x) return true;
//        else if (root.key<x){
//            return searchKey(root.right,x);
//        }
//        else if(root.key>x){
//            return searchKey(root.left,x);
//        }
//        return false;
//    }
}
