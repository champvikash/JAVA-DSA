package com.example.mycode.matrix.jan2025;

public class InsertionAtTail {


    public static void main(String[] args) {

        Node head = null;
        head = insertAtTail(head, 10);
        head = insertAtTail(head, 11);
        head = insertAtTail(head, 12);
        head = insertAtTail(head, 13);
        printLL(head);

    }

    public static void printLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println("Current Data:" + curr.data + "");
            curr = curr.next;
        }
    }


    public static Node insertAtTail(Node head, int i) {

        Node temp = new Node(i);
        if (head == null) return temp;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;

    }


}








