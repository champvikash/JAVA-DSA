package com.example.mycode.LinkedList;
//Naive solution
//in this solution we are using two for loop
// time complexity will be n.n/2 = n^2;
//because we are traversing one the LL for counting the numbers of the node, in second for loop traveling on the loo
// on the loop for the retuning the middle of the node.



public class middleofLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printll(head);
        printMiidle(head);
    }

    static void printMiidle(Node head){
        //if LL is null return the null;
        if(head==null)return;
        int count=0;
        Node curr;
        for(curr=head;curr!=null;curr=curr.next) {
            count++;
            curr = head;
        }
        for(int i=0;i<count/2;i++) {
            curr = curr.next;
            System.out.print(curr.data);
        }
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
