package com.example.mycode.matrix.LinkedList;

public class printNthNodefromlast {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        int n  = 2;
        printLL(head);
//        printNThnodefromlast(head,n);
          printNThnodefromlast(head,n);

    }
 /// this is the first solution
//    private static void printNThnodefromlast(Node head, int n) {
//        int len = 0;
//        for(Node curr=head;curr!=null;curr=curr.next)
//            len++;
//        if(len<n)
//            return;
//        Node curr=head;
//        for(int i=1;i<len-n+1;i++)
//            curr=curr.next;
//        System.out.println(curr.data);
//    }
    // this is second solution
    public static void printNThnodefromlast(Node head,int n){
        if(head==null)return;
        Node first=head;
        for(int i=0;i<n;i++){
            if(first==null)return;
            first=first.next;
        }
        Node second=head;
        while(first!=null){
            second=second.next;
            first=first.next;
        }
        System.out.print(second.data);
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
