package com.example.mycode.matrix.LinkedList;

public class insertatLast {
    public static void main(String[] args) {
        Node head = null;
        head=insertEnd(head,10);
        head=insertEnd(head,20);
        head=insertEnd(head,30);
        printlist(head);
    }

    private static void printlist(Node head)  {
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    private static Node insertEnd(Node head, int i) {
        Node temp=new Node(i);
        if(head==null)return temp;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    }

