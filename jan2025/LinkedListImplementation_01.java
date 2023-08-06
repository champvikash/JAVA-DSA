package com.example.mycode.matrix.jan2025;

public class LinkedListImplementation_01 {

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        (head.next.next) = new Node(3);


        Node temp = head;
        while (temp != null) {
            System.out.println(temp + " : " + temp.data+" : ");
            temp =  temp.next;
        }


    }


}


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

}


