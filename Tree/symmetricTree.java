package com.example.mycode.matrix.Tree;

public class symmetricTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.right= new Node(40);
        root.right.right = new Node(50);

        System.out.println(SymmetricTree(root.left,root.right));
    }

    private static boolean SymmetricTree(Node left, Node right) {
        boolean status = false;
        if(left == null && right== null){
            status = true;
        } else if(left !=null &&
                  right !=null &&
                  left.key == right.key &&
                  SymmetricTree(left.right,right.left) &&
                  SymmetricTree(left.left,right.right)) {
            status = true;
        }
        return status;
    }
}
