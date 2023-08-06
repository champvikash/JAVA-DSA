package com.example.mycode.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {
    public static void main(String[] args) {
        // Creating Queue using the PriorityQueue class
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        int[] arr = {1,2,0,-1,4,5,6,6};

        for(int i=0; i<arr.length; i++){
            numbers.add(arr[i]);

        }

        System.out.println(numbers);
        int a =   numbers.remove();
        int b = numbers.poll();
        System.out.println(a + " "+ b );

        System.out.println(numbers);
        // Using the remove() method
        boolean result = numbers.remove(2);
        System.out.println("Is the element 2 removed? " + result);
        System.out.println(numbers);

        boolean results = numbers.remove(6);
        System.out.println("Is the element 6 removed? " + result);

        System.out.println(numbers);


        boolean result3 = numbers.remove(1);
        System.out.println("Is the element 1 removed? " + result);

        System.out.println(numbers);

        boolean results4 = numbers.remove(6);
        System.out.println("Is the element 6 removed? " + result);

        System.out.println(numbers);


    }




}
