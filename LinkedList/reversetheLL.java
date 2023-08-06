package com.example.mycode.LinkedList;

import java.util.ArrayList;

public class reversetheLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        printLL(head);
//        revList(head);
        reverse(head);
        printLL(head);
    }
    //Naive solution two for loop uses time complexity will be O(n*n)
    public static Node revList(Node head){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(Node curr=head;curr!=null;curr=curr.next){
            arr.add(curr.data);
        }
        for(Node curr=head;curr!=null;curr=curr.next){
            curr.data=arr.remove(arr.size()-1);
        }
        return head;
    }
 // efficient solution  only one time traverse
   public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
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
