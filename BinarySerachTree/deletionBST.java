package com.example.mycode.BinarySerachTree;


import static com.example.mycode.BinarySerachTree.insertinBST.inorder;

public class deletionBST {
    public static void main(String[] args) {
        Node root=new Node(15);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.right=new Node(20);
        root.right.left=new Node(18);
        root.right.left.left=new Node(16);
        root.right.right=new Node(80);
        int x=80;
        root=delNode(root,x);
        inorder(root);

    }

    public static Node getSuccessor(Node curr){
        curr=curr.right;
        while(curr!=null && curr.left!=null)
            curr=curr.left;
        return curr;
    }

    public static Node delNode(Node root, int x){
        if(root==null)
            return root;
        if(root.key>x)
            root.left=delNode(root.left,x);
        else if(root.key<x)
            root.right=delNode(root.right,x);
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node succ=getSuccessor(root);
                root.key=succ.key;
                root.right=delNode(root.right,succ.key);
            }
        }
        return root;
    }
}
