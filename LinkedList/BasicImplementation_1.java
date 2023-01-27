package com.example.mycode.LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class BasicImplementation_1 {
    public static void main(String[] args) {
        // create a Linked-list.
        Node head = new Node(1);
        head.next = new Node(2);
        (head.next).next = new Node (3);
        head.next.next.next = new Node(4);
        //traverse on the LinkedLIST
        Node temp = head;
        while(temp != null){
//          System.out.print( temp.data + " ");
            System.out.println(temp + " : " + temp.data+" : "+temp.next);
            temp =  temp.next;
        }
    }
}
