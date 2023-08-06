package com.example.mycode.matrix.LinkedList;

public class traversingonLinkedlist {

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            (head.next).next = new Node(3);
            printf(head);
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

