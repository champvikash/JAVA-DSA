package com.example.mycode.matrix.PallaviVaibhav;
import java.util.Stack;


public class StackInteger {
    public static void main(String[] args) {

        Stack<Integer> plates = new Stack<>();

        plates.push(5);
        plates.push(6);
        plates.push(7);
        plates.push(55);
        plates.push(455);
        System.out.println(plates);
        plates.pop();
        System.out.println(plates);
        System.out.println(plates.size());

        int[] arr = {66 , 55 , 88 , 99};

        for (int i = 0; i<arr.length; i++){
            plates.add(arr[i]);
        }


        System.out.println(plates);

  /*      System.out.println(plates);
        System.out.println(plates.isEmpty());
        plates.pop();
        System.out.println(plates);
        System.out.println(plates.peek());


   */


    }
}
