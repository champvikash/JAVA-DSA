package com.example.mycode.BinarySerachTree;

public class insertinBST {
    public static void main(String[] args) {
        Node root=new Node(15);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.right=new Node(20);
        root.right.left=new Node(18);
        root.right.left.left=new Node(16);
        root.right.right=new Node(80);
        int x=85;
        root =inserstion(root,x);
        inorder(root);
    }
    //iterative solution
    private static Node inserstion(Node root, int x) {
        Node temp=new Node(x);
        Node parent=null,curr=root;
        while(curr!=null){
            parent=curr;
            if(curr.key>x)
                curr=curr.left;
            else if(curr.key<x)
                curr=curr.right;
            else
                return root;
        }
        if(parent==null)
            return temp;
        if(parent.key>x)
            parent.left=temp;
        else
            parent.right=temp;
        return root;
    }

//    private static Node inserstion(Node root, int x) {
//        if(root==null) return new Node(x);
//        if(root.key>x){
//            root.left=inserstion(root.left,x);
//        } else if (root.key<x){
//            root.right=inserstion(root.right,x);
//        }
//        return root;
//    }
//
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
}
