package com.example.mycode.matrix.matrix;

import java.util.Stack;

public class arrayquestion {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 4, 5};

        Stack<Integer> stk = new Stack<>();

        for (int i=0; i<arr.length; i++){
            stk.push(arr[i]);
        }

        System.out.println(stk);


        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        for (int i=0; i<arr.length; i++){
            stk.pop();
        }

        System.out.println(stk);


    }
}
