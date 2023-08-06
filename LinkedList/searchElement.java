package com.example.mycode.matrix.LinkedList;

public class searchElement {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        (head.next).next = new Node(3);
        int a = 2;

        System.out.println(searchinLinkedList(head,a));
    }

    private static boolean searchinLinkedList(Node head,int a) {
        Node curr = head;
        while(curr != null) {
         if(curr.data == a ){
             return true;
         } else {
             curr = curr.next;
         }
        }
        return false;
    }
}
