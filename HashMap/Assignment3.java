package com.example.mycode.matrix.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// same number of freq
public class Assignment3 {
    public static void main(String[] args) {

        //input format : 10
        //4 5 -3 8 -3 4 4 -3 6 4
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> freq = new HashMap<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }


        for (Map.Entry<Integer, Integer> itr : freq.entrySet()) {

            if (Math.abs(itr.getKey()) == itr.getValue()) {
                System.out.println(itr.getValue());
            }

        }

//         for(Map.Entry<Integer,Integer>  itr: freq.entrySet()){
//             if(itr.getValue() == itr.getValue()){
//                 System.out.println(itr.getValue());
//             }
//         }

    }
}