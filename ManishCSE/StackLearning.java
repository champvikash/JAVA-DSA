package com.example.mycode.matrix.ManishCSE;

import java.util.Stack;

public class StackLearning {

    public static void main(String[] args) {

        Stack<Integer> plates = new Stack<>();
        System.out.println(plates);

        plates.push(7);
        System.out.println(plates);

        plates.push(20);
        plates.push(21);
        plates.push(22);
        plates.push(23);
        System.out.println(plates);


        System.out.println(plates.peek());

        plates.pop();
        System.out.println(plates);

      boolean manish =  plates.isEmpty();
        System.out.println(manish);

        plates.pop();
        plates.pop();
        System.out.println(plates);

        plates.push(10);
        System.out.println(plates);


        int[] rollNum = {10,12,45,34,56,};
        for(int i = 0; i<rollNum.length; i++ ){

            plates.push(rollNum[i]);
        }

        System.out.println(plates);

        plates.pop();

        System.out.println(plates);

        int num = plates.peek();

        System.out.println(num);



    }

}
