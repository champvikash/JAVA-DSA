package com.example.mycode.matrix.LinkedList;

public class removeDup {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(4);
        printLL(head);
        removeDuplicates(head);
        printLL(head);
    }
   public static void removeDuplicates(Node head) {
        Node temp = head, prev = head;
        while (temp != null) {
            if (temp.data != prev.data) {
                prev.next = temp;
                prev = temp;
            }
            temp = temp.next;
        }
        if (prev != temp)
            prev.next = null;
    }

    public static void printLL(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

}
