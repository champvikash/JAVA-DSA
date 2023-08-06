package com.example.mycode.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Basicswork {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.offer(5);
        System.out.println(q);


        int a =   q.remove();
        int b = q.poll();

        System.out.println(q);
        System.out.println(a);
        System.out.println(b);

    }



}
