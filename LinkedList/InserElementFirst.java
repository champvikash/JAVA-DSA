package com.example.mycode.matrix.LinkedList;

public class InserElementFirst {
    public static void main(String[] args) {
        Node head  = null;
        head  = inserBieg(head,30);
        head  = inserBieg(head,20);
        head  = inserBieg(head,10);
        printf(head);


    }

    private static Node inserBieg(Node head, int i) {
            Node temp = new Node(i);
            temp.next=head;
            return temp;

    }
    private static void printf(Node head) {
//            while(head != null){
//                System.out.println(head.data);
//                head = head.next;
//            }

        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

}
