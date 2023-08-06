package com.example.mycode.matrix.LinkedList;
//TC=0(N)
public class middleofLL1 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printll(head);
        printMiddle(head);
    }
    static void printMiddle(Node head){
        if(head==null)return;
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.data);
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
