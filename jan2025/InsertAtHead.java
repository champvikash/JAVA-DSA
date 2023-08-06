package com.example.mycode.matrix.jan2025;

public class InsertAtHead {

    public static void main(String[] args) {

        Node head = null;
        head = insertAtFirst(head, 7);
        head = insertAtFirst(head, 9);
        head = insertAtFirst(head, 10);
        printlist(head);


    }


    public static Node insertAtFirst(Node head, int i) {
        Node temp = new Node(i);
        temp.next = head;
        return temp;
    }

    private static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

