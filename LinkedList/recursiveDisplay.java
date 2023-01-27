package com.example.mycode.LinkedList;

public class recursiveDisplay {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        (head.next).next = new Node(3);
        printLinkedlist(head);
    }

    private static void printLinkedlist(Node head) {
        // base case
        if(head == null){
            return;
        }

        System.out.println(head.data);
        printLinkedlist(head.next);

    }


}
