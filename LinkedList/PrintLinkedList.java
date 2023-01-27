package com.example.mycode.LinkedList;
import java.util.Scanner;

public class PrintLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        Node head = null;

        while(n-- !=0){
            int num = sc.nextInt();
            if(head == null){
                head = new Node(num);
            } else {
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new Node(num);
            }

        }
        printLL(head);
    }
    public static void printLL(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

}

