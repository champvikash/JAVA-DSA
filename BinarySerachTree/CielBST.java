package com.example.mycode.BinarySerachTree;

public class CielBST {
    public static void main(String[] args) {
        Node root=new Node(15);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.right=new Node(20);
        root.right.left=new Node(18);
        root.right.left.left=new Node(16);
        root.right.right=new Node(80);
        int x=11;
        System.out.println(cielSol(root,x).key);
    }

    private static Node cielSol(Node root, int x) {
        Node res=null;
        while(root!=null){
            if(root.key==x)
                return root;
            else if(root.key<x)
                root=root.right;
            else{
                res=root;
                root=root.left;
            }
        }
        return res;
    }
}
