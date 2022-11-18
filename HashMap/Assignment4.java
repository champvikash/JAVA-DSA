package com.example.mycode.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character,Integer> freq = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            freq.put(str.charAt(i),freq.getOrDefault(str.charAt(i),0)+1);
        }

//        for (Map.Entry<Character, Integer> itr : freq.entrySet()) {
//            if (itr.getValue() == 1) {
//                System.out.println(itr.getKey());
//            }
//
//        }

        for(int i=0;i<str.length();i++){
            if(freq.get(str.charAt(i))==1)
                System.out.println(i);

        }

    }
    
}
