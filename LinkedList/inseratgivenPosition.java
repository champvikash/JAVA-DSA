package com.example.mycode.matrix.LinkedList;

public class inseratgivenPosition {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        printll(head);
        int pst =  3;
        int data = 10;
        insetelement(head, pst,data);
        printll(head);
    }

    private static Node insetelement(Node head, int pst, int data) {
        Node temp = new Node(data);
        if(pst == 1){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i=0; i<=pst-2 && curr!=null; i++){
            curr = curr.next;
            if(curr == null){
                return head;
            }

        }
        temp.next = curr.next;
        curr.next = temp;
        return temp;
    }

    private static void printll(Node head) {
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
